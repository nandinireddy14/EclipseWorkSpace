package cgg.chatgpt;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

public class ChatBot {

	public static String sendQuery(String input, String endpoint, String apiKey) {
		// Build input and API key params
	    JSONObject payload = new JSONObject();
	    JSONObject message = new JSONObject();
	    JSONArray messageList = new JSONArray();

	    message.put("role", "user");
	    message.put("content", input);
	    messageList.put(message);

	    payload.put("model", "gpt-3.5-turbo"); // model is important
	    payload.put("messages", messageList);
	    payload.put("temperature", 0.7);

	    StringEntity inputEntity = new StringEntity(payload.toString(), ContentType.APPLICATION_JSON);

	    // Build POST request
	    HttpPost post = new HttpPost(endpoint);
	    post.setEntity(inputEntity);
	    post.setHeader("Authorization", "Bearer " + apiKey);
	    post.setHeader("Content-Type", "application/json");

	    // Send POST request and parse response
	    try {
	    	CloseableHttpClient httpClient = HttpClients.createDefault();
		      CloseableHttpResponse response = httpClient.execute(post);
	        HttpEntity resEntity = response.getEntity();
	        String resJsonString = new String(resEntity.getContent().readAllBytes(), StandardCharsets.UTF_8);
	        JSONObject resJson = new JSONObject(resJsonString);


	        if (resJson.has("error")) {
	            JSONObject errorObj = resJson.getJSONObject("error");
	            String errorMsg = errorObj.getString("message");
	            System.out.println(errorMsg);
	            return "Error: " + errorMsg;
	        }


	        // Parse JSON response
	        JSONArray responseArray = resJson.getJSONArray("choices");
	        List<String> responseList = new ArrayList<String>();

	        for (int i = 0; i < responseArray.length(); i++) {
	          JSONObject responseObj = responseArray.getJSONObject(i);
	          String responseString = responseObj.getJSONObject("message").getString("content");
	          responseList.add(responseString);
	        }

	        // Convert response list to JSON and return it
	        Gson gson = new Gson();
	        String jsonResponse = gson.toJson(responseList);
	        httpClient.close();
	        response.close();
	        return jsonResponse;
	      } catch (IOException e) {
	        System.out.println(e);
	        return "Error: " + e.getMessage();
	      }
	    catch (JSONException e) {
	        System.out.println(e);
	        return "Error: " + e.getMessage();
	      }
	}

}
