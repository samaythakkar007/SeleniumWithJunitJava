package utilities;

import java.util.Properties;

public class ConfigUtils {

	
	private PropertiesUtils getConfigProperties() throws Exception {
		
		try {
		PropertiesUtils propUtils = new PropertiesUtils("config.properties");
		
		return propUtils;
		
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching values from config properties -->"+e);
		}
	}
	
	
	public String getNestedPropertyKey(String keys) {
		String k = keys.replace(" ", ".");
		return k;
		
	}
	
	public String getEnvironment() throws Exception {
		try {
			return getConfigProperties().getPropInstance().getProperty("env");
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching Environment type from config file -->"+e);
		}
	}
	
	public String getBrowserType() throws Exception {
		try {
			return getConfigProperties().getPropInstance().getProperty("browser");
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching browse type from config file -->"+e);
		}
	}
	
	public String getUsername(String userType) throws Exception {
		try {
			return getConfigProperties().getPropInstance().getProperty(getEnvironment() +"."+userType+"."+"username");
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching username from config file -->"+e);
		}
	}
	
	
	public String getPassword(String userType) throws Exception {
		try {
			return getConfigProperties().getPropInstance().getProperty(getEnvironment() +"."+userType+"."+"password");
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching username from config file -->"+e);
		}
	}
	
	public String getBrowserVersion() throws Exception{
		try {
			return getConfigProperties().getPropInstance().getProperty(getBrowserType()+"."+"version");
		}catch(Exception e) {
			throw new Exception("Exception occurred while fetching browser version -->"+e);
		}
	}
	
	
	
	
	
	
}
