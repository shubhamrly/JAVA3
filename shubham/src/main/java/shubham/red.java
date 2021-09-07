package shubham;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class red {
public static void main(String [] args) throws IOException, ParseException
{
	JSONParser jp=new JSONParser();
	 FileReader fr = new FileReader(".\\jasonf\\emp.json");
	Object ob= jp.parse(fr);
	 JSONObject o = (JSONObject) ob;
	 String n1=(String) o.get("fruit");
	 String n2=(String) o.get("size");
	 String n3=(String) o.get("color");
	 System.out.println(n1 + n2 + n3);
	 JSONArray a = (JSONArray) o.get("a");
	 for(int i=0;i<a.size();i++)
	{
		 System.out.println(a.get(i));
		 
		    
	 }
	 a= (JSONArray) o.get("b");
	 for(int i=0;i<a.size();i++)
		{
		JSONObject k = (JSONObject) a.get(i);	 
		 System.out.println(k.get("blue"));
		 System.out.println(k.get("city"));
		 
			 
			    
		 }
		 
}
}
