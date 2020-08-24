package Framework.ExcelDriven;

import java.io.IOException;
import java.util.ArrayList;

public class test_excel_data {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		dataDriven d=new dataDriven();
		ArrayList<String> ready=d.getData("Python");
		for(int i=0;i<ready.size();i++)
		System.out.println(ready.get(i));
	}

}
