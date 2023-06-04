package Cache;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cache {
	
	private static Map<String,Student> lstudent=new LinkedHashMap<String,Student>();
	
	public static  void addStudent(Student student)
	{
		if(!lstudent.containsKey(student.getStudentName()))
		{
			lstudent.put(student.getStudentName(),student);
		}
	}
	
	public static Student getStudent(String studentName)
	{
		return lstudent.get(studentName);
	}

}
