package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int avg = 0;
		String result = "";
		char grade = 'F';
		
		do{
			System.out.println("평균 점수를 입력하세요. : ");
			avg = scanner.nextInt();	
		}while(avg>100||avg<0);
			
		if(avg>=70){
			result = "합격";
		}
		if(avg>=70){
			result = "합격";
		}else{
			result = "재시험";
		}
		//평균점수에 따라서 비교 학점구하기

	/*	if(avg>=90){grade = 'A';}
		else if(avg>=80){grade = 'B';}
		else if(avg>=70){grade = 'C';}
		else if(avg>=60){grade = 'D';}
		else{grade = 'F';}
		System.out.println("귀하는 "+result+"이며, 학점은 "+grade+" 입니다.");
		*/
		
		// if else 를 switch로 바꾸시오
		
		if(100>=avg && avg>0){
			switch(avg/10){
			case 10:
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default : break;
			}
			System.out.println("귀하는 "+result+"이며, 학점은 "+grade+" 입니다.");
		}else {
			System.out.println("잘못 입력");
		}//if
	}
}
