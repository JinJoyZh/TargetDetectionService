package demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String args[]){
        Message message    =   new Message();
        message.setDataType("Images");
        message.setDataPath("E:/tmp/LibTargetDetection/src/main/samples");
        ObjectMapper mapper = new ObjectMapper();
        String inputData = null;
        try {
            inputData = mapper.writeValueAsString(message);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        String strUrl = "http://127.0.0.1:5000/process";
        //send data to the flask service
        HttpURLConnection conn = null;
        DataOutputStream os = null;
        try{
            URL url = new URL(strUrl); //important to add the trailing slash after add
            byte[] postData = inputData.getBytes(StandardCharsets.UTF_8);
            conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty( "charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(inputData.length()));
            os = new DataOutputStream(conn.getOutputStream());
            os.write(postData);
            os.flush();

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();
        } catch (IOException e){
            e.printStackTrace();
        } finally
        {
            if(conn != null)
            {
                conn.disconnect();
            }
        }
    }

}