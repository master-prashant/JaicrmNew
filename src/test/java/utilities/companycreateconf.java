package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class companycreateconf {
	public Properties pro;
	public companycreateconf() {
		pro=new Properties();
	try {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//compdetail.properties");
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
	public String getcompname() {
		String compname = pro.getProperty("compname");
		return compname;
		}
	public String getindtype() {
		String indtype = pro.getProperty("indtype");
		return indtype;
		}
	public String getwebsite() {
		String website = pro.getProperty("website");
		return website;
		}
	public String getcin() {
		String cin = pro.getProperty("cin");
		return cin;
		}
	public String gettan() {
		String tan = pro.getProperty("tan");
		return tan;
		}
	public String getpan() {
		String pan = pro.getProperty("pan");
		return pan;
		}
	public String getamount() {
		String amount = pro.getProperty("amount");
		return amount;
		}
	public String getsummary() {
		String summary = pro.getProperty("summary");
		return summary;
		}
	
}
