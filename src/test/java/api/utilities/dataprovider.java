package api.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class dataprovider {
	
	@DataProvider(name="Data")
	public String[][] getalldata() throws IOException {
		String path=System.getProperty("user.dir")+"//testdata//usercreate.xlsx";
		datausercreate xl=new datausercreate(path);
		int rownum=xl.getrowcount("Sheet1");
		int colcount=xl.getcellcount("Sheet1", 1);
		String apidata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for (int j=0;j<colcount;j++) {
				apidata[i-1][j]=xl.getcelldata("Sheet1", i, j);
			}
		}
		return apidata;
	}
	
	
	

}
