package javaConcepts;

import xls.ShineXlsReader;

public class WorkWithExcel {

	public static void main(String[] args) {
		
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rowCount = xls.getRowCount("Sheet1");
		int columnCount = xls.getColumnCount("Sheet1");
		System.out.println("Row count ="+rowCount);
		System.out.println("col count="+columnCount);
		
		//xls.addSheet("enames");
		//xls.addColumn("enames", "eName");
		xls.setCellData("enames", "eName", 2, "Srinivas Narayan");
		
		/*for(int i=2;i<=rowCount;i++){
			for(int j=0;j<columnCount;j++){
				String cellData = xls.getCellData("Sheet1", j, i);
				System.out.println(cellData);
			}
		}*/
	}

}
