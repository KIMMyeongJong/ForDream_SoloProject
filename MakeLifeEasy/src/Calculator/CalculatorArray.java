package Calculator;

import java.util.Date;
import java.util.Scanner;

public class CalculatorArray {
	private String classMember[][] = {
			{"", "1301204", "1309016", "1401203", "1401247", "1401248", "1401266", "1501043", "1501055",
					"1501091", "1501167", "1501169", "1701007", "1701012", "1701030",
					"1701035", "1701043", "1701051", "1701061", "1701068", "1701082",
					"1701089", "1701101", "1701140", "1701160", "1701167", "1701211",
					"1701218", "1701226", "1701243", "1701270", "1701290", "1701312" },
			{ "", "�̼���", "������", "�̹���", "��ȫ��", "������", "���ؿ�", "�輺��", "������", "������", "�Źμ�", "������", "������",
					"�ǵ���", "�赿��", "�����", "�躸��", "��ҹ�", "����ä", "������", "������", "��ȫ��", "������",
					"������", "�����", "������", "������", "�Ӽ���", "������", "���ؿ�", "�ּ���", "������", "������" } };
	
	static double[] scoreArray = new double[33];// �� �ο� ��
	
//	static int arrayLength = classMember.length;
	public String[][] getClassMember() {
		return this.classMember;
	}
	
	public void calculatorArray() {
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		
		String notSubmission[] = new String[33];
		int todayDate = date.getDate();// ��¥ ���
		int todayMonth = date.getMonth();// �� ���
		double inputScore;// ���� �Է¹ޱ�
		int classMemberNum = 32;// �� ���ο�
		int perfectScore;// ��������
		double averageScore;// �������
		boolean whileControl = true;// while ��Ʈ�� ����
		double sum = 0;// ���� ��ü ���� ��
		int i = 0;
		int notSubmissionArray = 0;

		System.out.println(todayMonth + 1 + "�� " + todayDate + "�� ");

		System.out.println("������ �Է� �� �ּ���");
		perfectScore = scan.nextInt();

		while (whileControl) {
			
			
			System.out.print(this.classMember[0][i] + this.classMember[1][i] + "���� �Է� : ");
			inputScore = scan.nextDouble();
			
			if (inputScore == 9000) {// ������ �ο� �迭�� ����
				notSubmission[notSubmissionArray] = classMember[0][i] + classMember[1][i];
				System.out.println("������ �ο� ��� �Ϸ�");
				notSubmissionArray++;
			} // if end

			else if (inputScore <= perfectScore) {// ���� �迭�� ����
				scoreArray[i] = inputScore;
				whileControl = false;
			} // if end

			else {// ���� �ȵǴ� �ο� �ٽ� �ݺ�
				System.out.println("�ٽ� �Է��� �ּ���");
				System.out.println("������ " + perfectScore + "�Դϴ�.");
				i--;
			} // else end

			System.out.println(scoreArray[i]);// ���߿� ����
			whileControl = true;// �ٽ� �ٲ���� while ����

			if (i == 32) {
				whileControl = false;
			}
			
			i++;
		} // while end

		for (double k : scoreArray) {// �л��� ���� �� �����ִ� for��
			sum = sum + k;
		} // for end
		averageScore = sum / 32;

		System.out.println("����� : " + averageScore);
		System.out.print("������ �ο��� : ");
		for (int k = 0; k < 33; k++) {
			System.out.print(notSubmission[k] + ", ");
		}
	}// void end

}// class end
