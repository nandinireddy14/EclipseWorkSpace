package cgg.chatgpt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 // Set ChatGPT endpoint and API key
        String endpoint = "https://api.openai.com/v1/chat/completions";
        String apiKey = "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";
            
        // Prompt user for input string
        try {
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          System.out.print("Enter your message: ");
          String input = reader.readLine();
                
          // Send input to ChatGPT API and display response
          String response = ChatBot.sendQuery(input, endpoint, apiKey);
          System.out.println(response);
        } catch (IOException e) {
        	System.out.println(e);
        } catch (JSONException e) {
        	System.out.println(e);
        } catch (Exception e) {
          System.out.println(e);
        }
    }
}
