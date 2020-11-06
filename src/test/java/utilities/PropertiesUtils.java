package utilities;

import java.io.FileReader;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

public class PropertiesUtils {

	String fileName;

	public PropertiesUtils(String fileName) {
		this.fileName = fileName;
	}

	public Properties getPropInstance() throws Exception {

		try {
			Properties prop = new Properties();
			FileReader reader = new FileReader(this.fileName);

			prop.load(reader);

			return prop;

		} catch (Exception e) {
			throw new Exception("Exception occurred while fetching propInstance -->" + e);
		}
	}
	
	
}
