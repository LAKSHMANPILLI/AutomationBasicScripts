package DrivenTesting;

import java.io.IOException;

public class DemoGanaricLibrary {

	public static void main(String[] args) throws IOException {
		GenaricFile f=new GenaricFile();
		String url=f.getPropertyData("url");
		System.out.println(url);
		f.setExelData("Sheet1", 1, 5, "pass");
		System.out.println(f.getExelData("Sheet1", 1, 5));
	}
}
