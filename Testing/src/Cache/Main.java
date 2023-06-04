package Cache;

import java.util.Scanner;
import Cache.Dao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dao.loadData();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the Name");
		
		String name=sc.next();
		System.out.println(Cache.getStudent(name));
		

	}

}
