package com.bang.demo.openapi.socitystats.controller;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.bang.demo.openapi.url.OpenApiURL;
import com.bang.demo.util.CommonUtil;


@RestController
public class SOCityStatsController {
	
	protected static final Logger Logger = LoggerFactory.getLogger(SOCityStatsController.class);
	
	@GetMapping(value = "/api/socitystats.do")
	public Map<String,Object> selectSOCityStats(
			@RequestParam(value="city", required=false ) String city
		){
		
		List<Map<String,Object>> list = new ArrayList<>();
		
		Map<String,Object> result = new HashMap<>();
		
		try {
			String apiURL = OpenApiURL.SO_CITY_STATS.toString();
			
			URL url = new URL(apiURL);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			int responseCode = con.getResponseCode();
			BufferedReader br = null;
			if(responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			}else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			
			br.close();
			
			Logger.debug(response.toString());
			
			String xml = response.toString();
			
			InputStream is = new ByteArrayInputStream(xml.getBytes());
		    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		    dbf.setNamespaceAware(true);
		    DocumentBuilder db = dbf.newDocumentBuilder();
		    Document document = db.parse(is);
		    
		    NodeList cName = document.getElementsByTagName("city-name");
		    NodeList cCount = document.getElementsByTagName("city-count");
		    
		    for(int i = 0;i<cName.getLength(); i++) {
		    	String name = cName.item(i).getTextContent();
		    	int count = Integer.parseInt(cCount.item(i).getTextContent());
		    	
		    	Map<String,Object> data = new HashMap<>();
		    	data.put("name", name);
		    	data.put("count",count);
		    	
		    	list.add(data);
		    	
		    }
			
			result.put("list", list);
			
			
		}catch(Exception e) {
			e.printStackTrace();
			Logger.error(e.getMessage());
		}
		
		return result;
		
	}
	
	

}
