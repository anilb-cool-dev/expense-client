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
            conn.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjE0NTU2MTQwMjIifQ.eyJjb25jdXIuc2NvcGVzIjpbIlVTRVIiLCJwcm9maWxlIiwidXNlcl9yZWFkIl0sImF1ZCI6IioiLCJjb25jdXIuYXBwSWQiOiJlOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJzdWIiOiIzNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJpc3MiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tIiwiY29uY3VyLnByb2ZpbGUiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvcHJpbmNpcGFscy8zNzhkN2Y4MS1iZWEzLTRkODgtOWU0MC0wNWE4YmRmN2E4ZGYiLCJleHAiOjE0OTI1MzY0MTEsImxlZ2FjeV9hcHBsaWNhdGlvbl9pZCI6ODI1NiwiY29uY3VyLnZlcnNpb24iOjIsImNvbmN1ci50eXBlIjoidXNlciIsImNvbmN1ci5hcHAiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Byb2ZpbGUvdjEvYXBwcy9lOTQzM2IzNi0xYjAxLTQ4MWEtOTM5MC1kM2NhNDY2ZDJmYzgiLCJuYmYiOjE0OTI1MzI4MTEsImlhdCI6MTQ5MjUzMjgxMX0.nPvBiceIk8Ckj2MPAJ-ZiUv7lSFq_bCltTefsNUu7d90zz6s5BUdHx5K3eUyOBGsqWp9sHHTHEgVmhw4GB5CNNdTkj-YSNXPTXtBuGK3FOvfZr9fNq4WSnexreCocyoNQRdAhjf_MRirRnKirOxyApU-JVBkHq58GdBxY0lbcY2qEEpqXbf6teMEoxsNV8fZ4Axm-Af44u4x1lsf3UEZqmFE3z-P20Q2ttdZCeZo0O7DyAqor30UsPSbUONG6jOFUibja_ReTYXLnuPGIq05sKCpjxkPbqF_N-B3dYhEiPesV3HXO4K-NaaL8AvfXoyMX63FaUZZp0Lg3akA1ObPYw");

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
