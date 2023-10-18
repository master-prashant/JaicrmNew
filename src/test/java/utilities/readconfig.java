package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class readconfig {
	public Properties pro;
	public readconfig() {
		pro=new Properties();
	try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//data.properties");
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
}
	public String getbrowser() {
		String browser = pro.getProperty("browser");
		return browser;
		}
	public String getemail() {
		String email = pro.getProperty("username");
		return email;
		}
	public String getpass() {
		String pass = pro.getProperty("password");
		return pass;
		}
	public String geturl() {
		String url = pro.getProperty("basepath");
		return url;
		}
	
	public String getFilePath() {
		String path = pro.getProperty("uploadfilepath");
		return path;
		}
	
	public String LargeSizeFile() {
		String LFpath = pro.getProperty("largefilePath");
		return LFpath;
		}
	
	public String getWrongFile() {
		String wrfile = pro.getProperty("worngFormatFIle");
		return wrfile;
		}
	
	
	public static void main(String []args) {
		readconfig p=new readconfig();
		System.out.println(p.getbrowser());
		System.out.println(p.getFilePath());
	}
}
