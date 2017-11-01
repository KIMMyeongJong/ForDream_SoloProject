package Calculator;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
/***********************
 * 
 * 어래이스 클래스에 투 스트링 메소드 살펴보기
 * @author 김명종
 *
 ************************/
public class CalculatorExcel {
	private String[][] classMember = null;
	
	public CalculatorExcel(String[][] classMember) {
		this.classMember = classMember;
	}
	
	public void saveExcel() throws IOException, RowsExceededException, WriteException {
		
		File file = new File("C:\\Users\\김명종\\Downloads\\tes22211111111t11.csv");
		if (!file.exists()) {
			file.createNewFile();
		}
		
		WritableWorkbook workbook = Workbook.createWorkbook(file);// 액셀 객체 생성

		WritableSheet sheet = workbook.createSheet("테스트", 0);// 시트 생성

		// 셀(Label) 생성
		Label label;
		
		for (int i = 0; i < 4; i++) {
			if (i == 0) {
				for (int j = 0; j <=33; j++) {
					label = null;
					label = new Label(i, j, "ddd");
					sheet.addCell(label);
				} // for end
			} // if end | 첫번째 열
			else if (i == 1) {
				System.out.println("first line start");
				for (int j = 0; j <= classMember[0].length - 1; j++) {
					label = null;
					label = new Label(i, j, classMember[1][j]);
					sheet.addCell(label);
				}
			} else if (i == 2) {
				for (int j = 0; j <= classMember[0].length - 1; j++) {
					label = null;
					label = new Label(j, i, ChangeScoreForString.stringScoreArray[j]);//String타입으로 변환
					sheet.addCell(label);
				}
			}
			else {
				for (int j = 0; j <= classMember[0].length - 1; j++) {
					label = null;
					label = new Label(j, i, ChangeScoreForString.stringScoreArray[j]);//String타입으로 변환
					sheet.addCell(label);
				}
			}
		} // for end

		workbook.write();
		workbook.close();

	}
}
