package com.concur.expense;

import java.util.*;
import java.net.*;
import java.io.*;

public class ReportsList
{
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

        try
        {
            URL url = new URL("https://us.api.concursolutions.com/expensereports/v4/users/378D7F81-BEA3-4D88-9E40-05A8BDF7A8DF/context/TRAVELER/reports");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjE0NTU2MTQwMjIifQ.eyJjb25jdXIuc2NvcGVzIjpbIlVTRVIiLCJwcm9maWxlIiwidXNlcl9yZWFkIl0sImF1ZCI6IioiLCJjb25jdXIuYXBwSWQiOiJlOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJzdWIiOiIzNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJpc3MiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tIiwiY29uY3VyLnByb2ZpbGUiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvcHJpbmNpcGFscy8zNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJleHAiOjE0OTI1NTM1ODMsImxlZ2FjeV9hcHBsaWNhdGlvbl9pZCI6ODI1NiwiY29uY3VyLnZlcnNpb24iOjIsImNvbmN1ci50eXBlIjoidXNlciIsImNvbmN1ci5hcHAiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvYXBwcy9lOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJuYmYiOjE0OTI1NDk5ODMsImlhdCI6MTQ5MjU0OTk4M30.Qna_G_1tE_NnuzMe3NWddAQKzU0uyIRd86VvId6ZdNJN-J6MZ-cfltRRsNE8k1z9BkKblk9KzkxPXwwnQqr1pMA896NaK57hS74OVHg_Tt0OhKyUFFMXZm0vJ8zCGvpSgnsbIhDU6u40DY6wMlwEKfIeoMW_ouEo3Lo55O9eX_YAqvKwEbizcTN69hGufklQN7JjN8lRFSPqkWsTH8FVE1ObLEsr639UkdhDJvWtx5-Ssm8T_23ZsM8fCfi7OK3oUooe0qUSRLTctel2-MNCH34ZC3II9MmrOcFcg5UvVvFzHLZM8TLwCGBA0GidsOlioiNVEnHp-Hayy87hF2dS9Q");

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
}
