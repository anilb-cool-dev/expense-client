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
        String name = "testing 123...";

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
            URL url = new URL("https://qaers.concurasp.com/expensereports/v4/users/FB3816AE-8C07-4402-B36B-F773E440ED83/context/TRAVELER/reports");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImtpZCI6IjE0NTU2MTQzNDYifQ.eyJodHRwczovL2FwaS5jb25jdXJzb2x1dGlvbnMuY29tL3Njb3BlcyI6WyIqIl0sInN1YiI6IkZCMzgxNkFFLThDMDctNDQwMi1CMzZCLUY3NzNFNDQwRUQ4MyIsImF1ZCI6IioiLCJpc3MiOiJodHRwczovL3VzLmFwaS5jb25jdXJzb2x1dGlvbnMuY29tIiwiZXhwIjoxNDY0NzY4MTY1LCJuYmYiOjE0NjQ3NjA5NjUsImlhdCI6MTQ2NDc2MDk2NX0.QtyaV7bPiudrZ-MErVTbzRfa867TQzQihh_VZkfuo9N1ndSUzZ6QMLvwO59-edTZbt1dJmiM0d-LxHr5tm1kq8I85dZ0rFvqi-tFtHgI6-jxjaluoZkRtbMzGG_YsW19FkyjZHcsEfQC349OUZo2K_U-SG40GOoVInBYVXYM-KUiMwwYa4ngYT64fV53LZTwdtUIHCFDI6DEmOVgvN0s1VBW3SXgWgZKQgQ43bCOdc1UjASNxt-EurL4o4OPYMA_7Qr75-54UnB-5TAW7rgfKGU3AxfjIqBV-fVsZldjt7pgV2wHSE2MQC4EMMlbHrYWR-3on7_-x-e-7VzVfWAhdQ");

            if (conn.getResponseCode() != 200)
            {
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
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return json;
    }
}
