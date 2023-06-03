import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class JDBCtest {
	
	 public static void main(String args[]) throws SQLException {
	     
		 
		 
		 JDBCDAO jdbcdao=new JDBCDAO();
		 
		 
		 
		 ArrayList<ArrayList<String>> temp=jdbcdao.getData();
		 
		 
		 ArrayList<String> columns=temp.get(0);
		 
		 for(int i=0;i<columns.size();i++)
		 {
			 System.out.println(columns.get(i));
		 }
		 
		 System.out.println(temp.get(0));
		 
		 for(ArrayList<String> t:temp)
		 {
			 System.out.println(t.toString());
			 System.out.println(t.get(1));
			 System.out.println(t.size());
		 }
		 
//		 ResultSetMetaData rsMetaData = rs.getMetaData();
//	       System.out.println("List of column names : ");
//	       //Retrieving the list of column names
//	       int count = rsMetaData.getColumnCount();
//	       for(int i = 1; i<=count; i++) {
//	          System.out.println(rsMetaData.getColumnName(i));
//	       }
//	       
//	       while(rs.next())
//	       {
//	    	   System.out.println(rs.getInt(1));
//	    	   System.out.println(rs.getString(2));
//	    	   System.out.println(rs.getString(3));
////	    	   System.out.println(rs.getString(4));
//	       }
//		 
	      
	   }


}
