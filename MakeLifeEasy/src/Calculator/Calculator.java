package Calculator;

import java.util.Scanner;

import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import java.io.IOException;
import java.util.Date;

public class Calculator {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		/**************************************************************
		 * ��հ� ��� ������ ���ϴ� �ڵ��Դϴ�
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
