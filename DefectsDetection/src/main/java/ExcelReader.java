import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public DefaultTableModel readFile(String filename){

		File file = new File(filename);
		FileInputStream f = null;
		DefaultTableModel data = new DefaultTableModel();

		try {
			f = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//creates the object for the XLSX excel file
		XSSFWorkbook wbk = null;
		try {
			wbk = new XSSFWorkbook(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//gets the sheet
		XSSFSheet s = wbk.getSheetAt(0);

		//iterate rows
		Iterator<Row> rIterator = s.iterator();

		Vector<Object> v = new Vector<Object>();

		int iteratorOfColumns=0;
		
		while(rIterator.hasNext()) {
			Row r = rIterator.next();

			Iterator<Cell> cIterator = r.cellIterator();


			while(cIterator.hasNext()) {
				Cell c = cIterator.next();
				if(iteratorOfColumns==0	) {
					System.out.print("COLCOLCOLCOLCOLCOL------>"+ c.toString());
					data.addColumn(c.toString());
				}else {
					v.add(c.toString());
				}
			}
			if(iteratorOfColumns!=0) {
				data.addRow(v);
				System.out.println("rowrowrowroworoworow--------->"+v.toString());
				v = new Vector<Object>();
			}
			
			iteratorOfColumns++;

		}

		try {
			wbk.close();
			f.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
}