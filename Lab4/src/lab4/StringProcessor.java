package lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProcessor {

 public String readInputText() throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter String");
  return br.readLine();
 }

 public String processText(String text) {
  
  String result = text.replaceAll("(^|( ))([A-Z]+)(\\w*)( )([A-Z]+)(\\w*)( )([A-Z]+)(\\w*)", " PERSONAL_INFO");
  return result;
 }

}