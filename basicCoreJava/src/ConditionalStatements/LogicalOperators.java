package ConditionalStatements;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int CET = 98;
		int IIT = 93;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your CET score");
		
		
		int score = sc.nextInt();
		
		if(CET>=100 || IIT>=100)
			
		{
			System.out.println("you are eligible");
		}
		else
		{
			System.out.println("You are not eligible");
			}
		}


	}


