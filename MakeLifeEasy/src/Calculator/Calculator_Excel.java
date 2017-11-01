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
		File file = new File("C:\\Users\\�����\\Downloads\\tes22211111111t11.csv");
		if (!file.exists()) {
			file.createNewFile();
		}
		WritableWorkbook workbook = Workbook.createWorkbook(file);// �׼� ��ü ����
		HSSFSheet makeSheet = makeExcel.createSheet("ù��° ��Ʈ");// ��Ʈ ����
		Row makeFirstRow = makeSheet.createRow(1);// ù��° row ����
		Row makeSecondRow = makeSheet.createRow(1);//�ι�° row ����
		Row makeThirdRow = makeSheet.createRow(1);//����° row ����
		Row makeFourthRow = makeSheet.createRow(1);//�׹�° row ����

		for (int i = 0; i < CalculatorArray.classMember[0][0].length(); i++) {
			Cell makeCell = makeFirstRow.createCell(i);// cell���� 0����...
			makeCell.setCellValue(CalculatorArray.classMember[0][i]);// �迭 ����� �� ���� ����
		} // for end
		
		for (int i = 0; i < CalculatorArray.classMember[0][0].length(); i++) {
			Cell makeCell = makeSecondRow.createCell(i);// cell���� 0����...
			makeCell.setCellValue(CalculatorArray.classMember[1][i]);// �迭 ����� �� ���� ����
		} // for end
		
		for(int i = 0; i<CalculatorArray.classMember[0][0].length();i++) {
			Cell makeCell = makeSecondRow.createCell(i);// cell���� 0����...
			makeCell.setCellValue(CalculatorArray.scoreArray[i]);// �迭 ����� �� ���� ����
		}
		
		makeSheet.setColumnWidth(0, 12*256);
		makeSheet.setColumnWidth(1, 8*256);
		makeSheet.setColumnWidth(2, 12*256);//colum �ʺ� ����
	

		workbook.write();
		workbook.close();

		
}
}
