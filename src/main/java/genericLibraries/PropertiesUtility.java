package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains reusable methods to perform action on
 * Properties file
 * @author DELL
 *
 */

public class PropertiesUtility {
	
	private Properties property;
	/**
	 * This method is used to initialize Properties file
	 * @paramfilePath
	 */
	
	public void propertiesIntialization(String filePath) {
		FileInputStream fis= null;
		try {
			fis =new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		/**
		 * This method is used to read data from Properties file
		 *@Param key
		 *@return 
		 */
		
		property = new Properties();
		try {
			property.load(fis);
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public String fetchproperty(String key) {
		return property.getProperty(key);
	}

}
