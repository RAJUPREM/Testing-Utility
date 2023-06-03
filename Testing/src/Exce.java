import java.util.Scanner;

public class Exce {

	public static void main(String[] args) throws AgeIsNotGood {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter you age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("You are good now");
		}
		else
		{
			throw new AgeIsNotGood("You need to wait");
		}

	}

}
