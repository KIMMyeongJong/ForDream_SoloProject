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
			{ "", "이수재", "서보민", "이문희", "임홍기", "임희제", "정준우", "김성훈", "김은광", "류정훈", "신민섭", "신현빈", "공욱진",
					"권도완", "김동영", "김명종", "김보령", "김소민", "김은채", "김주은", "김현욱", "김홍민", "류정은",
					"변수정", "오상민", "윤을동", "이진수", "임수빈", "전상현", "정해원", "최소희", "한혜은", "이정훈" } };
	
	static double[] scoreArray = new double[33];// 총 인원 수
	
//	static int arrayLength = classMember.length;
	public String[][] getClassMember() {
		return this.classMember;
	}
	
	public void calculatorArray() {
		Scanner scan = new Scanner(System.in);
		Date date = new Date();
		
		String notSubmission[] = new String[33];
		int todayDate = date.getDate();// 날짜 출력
		int todayMonth = date.getMonth();// 월 출력
		double inputScore;// 점수 입력받기
		int classMemberNum = 32;// 총 반인원
		int perfectScore;// 만점점수
		double averageScore;// 평균점수
		boolean whileControl = true;// while 컨트롤 변수
		double sum = 0;// 점수 전체 더한 합
		int i = 0;
		int notSubmissionArray = 0;

		System.out.println(todayMonth + 1 + "월 " + todayDate + "일 ");

		System.out.println("만점을 입력 해 주세요");
		perfectScore = scan.nextInt();

		while (whileControl) {
			
			
			System.out.print(this.classMember[0][i] + this.classMember[1][i] + "점수 입력 : ");
			inputScore = scan.nextDouble();
			
			if (inputScore == 9000) {// 미제출 인원 배열에 저장
				notSubmission[notSubmissionArray] = classMember[0][i] + classMember[1][i];
				System.out.println("미제출 인원 등록 완료");
				notSubmissionArray++;
			} // if end

			else if (inputScore <= perfectScore) {// 점수 배열에 저장
				scoreArray[i] = inputScore;
				whileControl = false;
			} // if end

			else {// 만점 안되는 인원 다시 반복
				System.out.println("다시 입력해 주세요");
				System.out.println("만점은 " + perfectScore + "입니다.");
				i--;
			} // else end

			System.out.println(scoreArray[i]);// 나중에 지움
			whileControl = true;// 다시 바꿔줘야 while 동작

			if (i == 32) {
				whileControl = false;
			}
			
			i++;
		} // while end

		for (double k : scoreArray) {// 학생들 점수 다 더해주는 for문
			sum = sum + k;
		} // for end
		averageScore = sum / 32;

		System.out.println("평균은 : " + averageScore);
		System.out.print("미제출 인원은 : ");
		for (int k = 0; k < 33; k++) {
			System.out.print(notSubmission[k] + ", ");
		}
	}// void end

}// class end
