package com.bang.demo;

import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Test1 {

	public static void main(String[] args) {
		
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><Result>" + 
				"<Code>00</Code>" + 
				"<City>" + 
				"<city-name>강원도</city-name>" + 
				"<city-count>138</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>경기도</city-name>" + 
				"<city-count>924</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>경상남도</city-name>" + 
				"<city-count>282</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>경상북도</city-name>" + 
				"<city-count>250</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>광주광역시</city-name>" + 
				"<city-count>113</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>대구광역시</city-name>" + 
				"<city-count>201</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>대전광역시</city-name>" + 
				"<city-count>104</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>부산광역시</city-name>" + 
				"<city-count>228</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>서울특별시</city-name>" + 
				"<city-count>599</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>세종특별자치시</city-name>" + 
				"<city-count>10</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>울산광역시</city-name>" + 
				"<city-count>78</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>인천광역시</city-name>" + 
				"<city-count>244</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>전라남도</city-name>" + 
				"<city-count>196</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>전라북도</city-name>" + 
				"<city-count>197</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>제주특별자치도</city-name>" + 
				"<city-count>61</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>충청남도</city-name>" + 
				"<city-count>216</city-count>" + 
				"</City>" + 
				"<City>" + 
				"<city-name>충청북도</city-name>" + 
				"<city-count>130</city-count>" + 
				"</City>" + 
				"</Result>";
		
		if(xml.contains("<?")) {
			System.out.println(xml.replace(xml.substring(xml.indexOf("<?"), xml.indexOf("?>") + 2), ""));
		}else {
			System.out.println(xml);
		}
		

	}

}
