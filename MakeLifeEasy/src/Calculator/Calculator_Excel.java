package Calculator;

import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import jxl.Workbook;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

public class Calculator_Excel {
	HSSFWorkbook makeExcel = new HSSFWorkbook();

	public void saveDataForExcel() throws IOException, WriteException {
		File file = new File("C:\\Users\\김명종\\Downloads\\tes22211111111t11.csv");
		if (!file.exists()) {
			file.createNewFile();
		}
		WritableWorkbook workbook = Workbook.createWorkbook(file);// 액셀 객체 생성
		HSSFSheet makeSheet = makeExcel.createSheet("첫번째 시트");// 시트 생성
		Row makeFirstRow = makeSheet.createRow(1);// 첫번째 row 생성
		Row makeSecondRow = makeSheet.createRow(1);//두번째 row 생성
		Row makeThirdRow = makeSheet.createRow(1);//세번째 row 생성
		Row makeFourthRow = makeSheet.createRow(1);//네번째 row 생성

		for (int i = 0; i < CalculatorArray.classMember[0][0].length(); i++) {
			Cell makeCell = makeFirstRow.createCell(i);// cell생성 0부터...
			makeCell.setCellValue(CalculatorArray.classMember[0][i]);// 배열 저장된 값 셀에 삽입
		} // for end
		
		for (int i = 0; i < CalculatorArray.classMember[0][0].length(); i++) {
			Cell makeCell = makeSecondRow.createCell(i);// cell생성 0부터...
			makeCell.setCellValue(CalculatorArray.classMember[1][i]);// 배열 저장된 값 셀에 삽입
		} // for end
		
		for(int i = 0; i<CalculatorArray.classMember[0][0].length();i++) {
			Cell makeCell = makeSecondRow.createCell(i);// cell생성 0부터...
			makeCell.setCellValue(CalculatorArray.scoreArray[i]);// 배열 저장된 값 셀에 삽입
		}
		
		makeSheet.setColumnWidth(0, 12*256);
		makeSheet.setColumnWidth(1, 8*256);
		makeSheet.setColumnWidth(2, 12*256);//colum 너비 조정
	

		workbook.write();
		workbook.close();

		
}
}
