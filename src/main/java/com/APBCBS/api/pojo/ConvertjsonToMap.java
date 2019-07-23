package com.APBCBS.api.pojo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class ConvertjsonToMap {
	
	public static void main(String[] args) throws IOException {
		
		int count=1;
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ObjectMapper mapper = new ObjectMapper();
		
		ObjectReader reader = mapper.readerFor(new TypeReference<List<String>>() {
		} );
		
		JsonNode rootNode =mapper.readTree(new File("D:\\eclipse-workspace\\APBCBS\\src\\test\\resources\\jsonFile\\A013Json_001.json"));
		
/*		byte[] jsondata=Files.readAllBytes(Paths.get("D:\\eclipse-workspace\\APBCBS\\src\\test\\resources\\jsonFile\\A013Json_001.json"));
		//System.out.println(jsondata.toString());
		 * 
*/		
		if(rootNode.isArray())
		{
			for(JsonNode childNode : rootNode)
			{
				Iterator<String> itr = childNode.fieldNames();
				
				while(itr.hasNext())
				{
					String key = itr.next();
					JsonNode value = childNode.findValue(key);
					key = key+"_"+count;
					if(value.isArray())
					{
						
						List<String> list = reader.readValue(value);
						String finalValue = Arrays.toString(list.toArray());
						
						map.put(key, finalValue);
						
					}else if(value.isObject())
					{
						Iterator<String> k = value.fieldNames();
						while(k.hasNext())
						{
							String key1 = k.next();
							String value1 = value.findValue(key1).toString();
							key1 = key1+"_"+count;
							map.put(key1, value1);
						}
						
					}else
					{
						map.put(key, value.toString());
					}
					
				}
				
				count++;
			}
		}else
		{
			Iterator<String> itr = rootNode.fieldNames();
			
			while(itr.hasNext())
			{
				String key = itr.next();
				JsonNode value = rootNode.findValue(key);
				//key = key+"_"+count;
				if(value.isArray())
				{
					
					List<String> list = reader.readValue(value);
					String finalValue = Arrays.toString(list.toArray());
					
					map.put(key, finalValue);
					
				}else if(value.isObject())
				{
					Iterator<String> k = value.fieldNames();
					while(k.hasNext())
					{
						String key1 = k.next();
						String value1 = value.findValue(key1).toString();
						//key1 = key1+"_"+count;
						map.put(key1, value1);
					}
					
				}else
				{
					map.put(key, value.toString());
				}
				
			}
			
		}
		System.out.println(map);
	}

}
