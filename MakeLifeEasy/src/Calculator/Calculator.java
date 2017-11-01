package Calculator;

import java.util.Scanner;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.IOException;
import java.util.Date;

public class Calculator {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		/**************************************************************
		 * 평균과 취득 점수를 구하는 코드입니다
		 * Project_Start : 2017-10-30
		 * Made by KIMMyeongJong
		 **************************************************************/
		CalculatorArray calculator = new CalculatorArray();
		
		CalculatorExcel makeExcel = new CalculatorExcel(calculator.getClassMember());
		
//		Calculator_Excel excelMake = new Calculator_Excel();
		
		calculator.calculatorArray();
		
		makeExcel.saveExcel();
//		excelMake.saveDataForExcel();
	}// main method end
}// class end
