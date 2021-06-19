package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonFunctions {
	
	public static String getValue(String str) throws IOException
	{
	File f=new File("Config//Configuration.properties");
	FileReader fr = new FileReader(f);
	Properties prop = new Properties();
	prop.load(fr);
	return prop.getProperty(str);
	

    }
	
}
