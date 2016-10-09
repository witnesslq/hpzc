package com.hpzc.common.json;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JsonRule {

	private Set<String> skipField = new HashSet<String>();
	private Set<String> matchField = new HashSet<String>();
	private Map<String,String> renameField = new HashMap<String,String>();
	private String dataFormatString = null;
	private boolean serializeNull;
	
	public JsonRule(){}
	
	public JsonRule(String format)
	{
		this.setDataFormat(format);
	}
	
	public JsonRule skip(String... fieldNames)
	{
		for(String s : fieldNames)
		{
			if(!skipField.contains(s))
				skipField.add(s);
		}
		
		return this;
	}
	
	public JsonRule match(String... fieldNames)
	{
		for(String s : fieldNames)
		{
			if(!matchField.contains(s))
				matchField.add(s);
		}
		
		return this;
	}
	
	public JsonRule rename(String fieldName, String newName)
	{
		getRenameField().put(fieldName, newName);
		return this;
	}
	
	public JsonRule rename(Map<String, String> renameMap)
	{
		getRenameField().putAll(renameMap);
		return this;
	}
	 
	public void setDataFormat(String format)
	{
		this.dataFormatString = format;
	}
	
	public String getDataFormat()
	{
		return this.dataFormatString;
	}
	 
	public Set<String> getSkipField() {
		return skipField;
	}
	
	public Set<String> getMatchField() {
		return matchField;
	}

	public Map<String,String> getRenameField() {
		return renameField;
	}

	public boolean isSerializeNull() {
		return serializeNull;
	}

	public void setSerializeNull(boolean serializeNull) {
		this.serializeNull = serializeNull;
	}
 
 
}
