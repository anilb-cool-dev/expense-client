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
            conn.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjE0NTU2MTQwMjIifQ.eyJjb25jdXIuc2NvcGVzIjpbIlVTRVIiLCJwcm9maWxlIiwidXNlcl9yZWFkIl0sImF1ZCI6IioiLCJjb25jdXIuYXBwSWQiOiJlOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJzdWIiOiIzNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJpc3MiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tIiwiY29uY3VyLnByb2ZpbGUiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvcHJpbmNpcGFscy8zNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJleHAiOjE0OTI5MjUyODYsImxlZ2FjeV9hcHBsaWNhdGlvbl9pZCI6ODI1NiwiY29uY3VyLnZlcnNpb24iOjIsImNvbmN1ci50eXBlIjoidXNlciIsImNvbmN1ci5hcHAiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvYXBwcy9lOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJuYmYiOjE0OTI5MjE2ODYsImlhdCI6MTQ5MjkyMTY4Nn0.rN8mG7iu0asnao6phds1jBLxhzVnm0tDwwdBHDnU6xmJSFZO1pSSuhYcM7TIAMfWZiJ4P1a17EScbYx0o3emx1Uv858kg2OW-EFGoL43gcQlQr9qVAd0tGlLhudnLq5Ap-tfj4HBGt94ikVMHCYiFO3-V27l5NKrKkRoQ2WQaMWn25eA7VHDMjFBsqzqXL2_oV3qDoxi4YGEF88CgFguEAeuPStYJDYuMwVBkSi1BBsAcCFdnSBS4p4pxzLA1h2bQsKoEcMYAht8J6C8IVYpfTGlklLm1f3XPX2y4DpPvPWA65FnwLczrJVbuZyNVQFM2U_MU0buQm57ZDLuJ89yiQ");

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
