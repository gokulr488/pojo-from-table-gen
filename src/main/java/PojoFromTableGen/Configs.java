package PojoFromTableGen;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configs {

	public static String username;
	public static String password;
	public static String url;
	public static String[] tables;
	public static String schema;

	static FileInputStream fileInputStream;

	public static void getAllConfigs() throws IOException {

		try {
			Properties prop = new Properties();
			String propFileName = "config.txt";

			fileInputStream = new FileInputStream(new File(propFileName));

			if (fileInputStream != null) {
				prop.load(fileInputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}

			username = prop.getProperty("username");
			password = prop.getProperty("password");
			url = prop.getProperty("url");
			tables = prop.getProperty("tables").split(",");
			schema = prop.getProperty("schema");

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			fileInputStream.close();
		}

	}

}
