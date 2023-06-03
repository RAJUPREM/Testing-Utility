import java.util.Scanner;

public class Clen {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		String string="";
		System.out.println("Please enter the string");
		
		string=sc.next();
		
		char c[]=string.toCharArray();
		
		System.out.println("Length : "+c.length);
		
		int cr=0;
		int nm=0;
		int coma=0;
		for(int i=0;i<c.length;i++)
		{
			if((int)c[i]>=65 && (int)c[i]<=90 || (int)c[i]>=97 && (int)c[i]<=122)
			{
				System.out.println("character : "+c[i]+" value : "+(int)c[i]);
				cr+=1;
			}
			else if((int)c[i]>=48 && (int)c[i]<=57)
			{
				System.out.println("number : "+c[i]+" value : "+(int)c[i]);
				nm+=1;
			}
			else
			{
				coma+=1;
			}
			
		}
		
		System.out.println("Char : "+cr+" nm : "+nm+" coma : "+coma+" length : "+c.length);
		
		String eng="A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
		
		int i=1;
		for(String temp:eng.split(", "))
		{
			System.out.println(",{"+i+":"+"'"+temp+"'"+"}");
			i+=1;
		}
		
		String engSmall="a b c d e f g h i j k l m n o p q r s t u v w x y z";
		
		int y=1;
		
		for(String temp:engSmall.split(" "))
		{
			System.out.println(",{"+y+":"+"'"+temp+"'"+"}");
			y+=1;
		}
		
		
		String num="1 2 3 4 5 6 7 8 9";
		
			int x=1;
		
		for(String temp:num.split(" "))
		{
			System.out.println(",{"+x+":"+"'"+temp+"'"+"}");
			x+=1;
		}
		
		
		

	}

}
