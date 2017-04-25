package com.concur.expense;

import java.util.*;
import java.net.*;
import java.io.*;
import org.json.JSONException;
import org.json.JSONObject;

public class ReportsList
{
    String FILE_NAME = "token";
    String DEFAULT_REFRESH_TOKEN = "8eb09349-ae3c-4a8c-a9f9-71a1468f4ca5";

    public List getReportsList()
    {
        List l = new ArrayList();

        String json = getRestResponse();
        String name = json;

        l.add(name);
        return l;
    }

    String parseJSON(String json)
    {
//        JSONObject obj = new JSONObject(json);
          return json;
    }


    private String getRestResponse()
    {
        String json = new String();

        String token = getAuthToken();

        try
        {
            URL url = new URL("https://us.api.concursolutions.com/expensereports/v4/users/378D7F81-BEA3-4D88-9E40-05A8BDF7A8DF/context/TRAVELER/reports");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", "Bearer " + token);

            if (conn.getResponseCode() != 200)
            {
                json = "Sorry";
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null)
            {
                json = json.concat(output);
            }

            conn.disconnect();
        }
        catch (MalformedURLException e)
        {
            json = "Sorry1";
            e.printStackTrace();
        }
        catch (IOException e)
        {
            StringWriter errors = new StringWriter();
            e.printStackTrace(new PrintWriter(errors));
            json = errors.toString();
            e.printStackTrace();
        }

        return json;
    }

    private String getAuthToken()
    {
        String refresh_token;

        try
        {
            refresh_token = getRefreshToken();

            URL url = new URL("https://us.api.concursolutions.com/oauth2/v0/token?client_id=e9433b36-1b01-481a-9390-d3ca466d2fc8&client_secret=500c938c-baf4-4a3e-8ab6-724b673dd3f0&scope=USER%20profile%20user_read&grant_type=refresh_token&refresh_token=" + refresh_token);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() == 200) {
                AuthResponse ar = parseAuthResponse(conn.getInputStream());

                if (!refresh_token.equals(ar.refresh_token))
                {
                    saveRefreshToken(ar.refresh_token);
                }

                return ar.access_token;
            }
        }
        catch (Exception e)
        {
        }

        return null;
    }

    private String getRefreshToken() throws Exception
    {
        String refresh_token;

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            refresh_token = reader.readLine();
            reader.close();
        }
        catch(Exception e)
        {
            refresh_token = DEFAULT_REFRESH_TOKEN;
        }

        if (refresh_token == null)
        {
            refresh_token = DEFAULT_REFRESH_TOKEN;
        }

        return refresh_token;
    }

    private AuthResponse parseAuthResponse(InputStream stream) throws Exception
    {
        AuthResponse ar = new AuthResponse();

        BufferedReader br = new BufferedReader(new InputStreamReader(stream));

        String output;
        String json = new String();

        while ((output = br.readLine()) != null)
        {
            json = json.concat(output);
        }

        JSONObject obj = new JSONObject(json);
        ar.access_token = (String)obj.get("access_token");
        ar.refresh_token = (String)obj.get("refresh_token");

        return ar;
    }

    private void saveRefreshToken(String token) throws Exception
    {
        File file = new File(FILE_NAME);

        if (!file.exists())
        {
            // creates the file
            file.createNewFile();
        }

        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);

        // Writes the content to the file
        writer.write(token);
        writer.flush();
        writer.close();
    }
}
