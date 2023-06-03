import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class JDBCDAO {
	
	
	
	public ArrayList<ArrayList<String>> getData()
	{
		 //Registering the Driver
	    try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	    //Getting the connection
	    String mysqlUrl = "jdbc:mysql://localhost/student";
	    Connection con = null;
	    
	    ResultSet rs=null;
	    ArrayList<ArrayList<String>> rows=new ArrayList<ArrayList<String>>();
//	    Map<String,ArrayList<ArrayList<String>>> linkedData=new LinkedHashMap<String,ArrayList<ArrayList<String>>>();
	    
		try {
			con = DriverManager.getConnection(mysqlUrl, "root", "root");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    System.out.println("Connection established......");

	    //Creating a Prepared Statement
	   
	    
//	    ResultSet rs=null;
	    PreparedStatement pstmt=null;
	    try
	    {
	  	  String query = "select \r\n"
//	  	  		+ "						student2.studentRoll roll,\r\n"
	  	  		+ "						student2.studentName name,\r\n"
	  	  		+ "						(select student.studentMobile\r\n"
	  	  		+ "						from student where studentId=?\r\n"
	  	  		+ "						) mobile\r\n"
	  	  		+ "						from student2\r\n"
	  	  		+ "						where student2.studentName='Raju Kumar Sharma'";
		      pstmt = con.prepareStatement(query);
		      pstmt.setObject(1, 1);
	  	  rs = pstmt.executeQuery();
	  	  
	  	  
	  	  
	  	  
	  	  
	  	  
	  	 ResultSetMetaData rsMetaData = rs.getMetaData();
	       System.out.println("List of column names : ");
	       int colCount = rsMetaData.getColumnCount();
	       
	       ArrayList<String> cols=new ArrayList<String>();
	       for(int j=1;j<=colCount;j++)
	       {
	    	   cols.add(rsMetaData.getColumnName(j));
	       }
	       
	       rows.add(cols);
	       
	  	  while(rs.next())
	  	  {
	  		ArrayList<String> row=new ArrayList<String>();
	  		
	  		for (int i = 1; i <= colCount; i++) {
	  			row.add(rs.getString(i));
			} 
	  		rows.add(row);
	  	  }
	  	  
	    }
	    catch (SQLException e) {
			     
		       e.printStackTrace();
		   }       catch (Exception e) {
		        
		          e.printStackTrace();
		      }finally{
		       try{
		           if(rs != null) rs.close();
		           if(pstmt != null) pstmt.close();
		           if(con != null) con.close();
		       } catch(Exception ex){}
		   }
	    
	    return rows;
	}
}
