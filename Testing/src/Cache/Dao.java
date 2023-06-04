package Cache;



public class Dao {
	
private static Dao dao = null;
	
	private Dao() {
	
	}
	
	public static void loadData(){
		if(dao == null){
			dao = new Dao();
			dao.loadAll();
		}
	}
	
	public  void loadAll(){
		
		Student s1=new Student();
		s1.setStudentName("Raju");
		s1.setStudentMobile("8210574728");
		s1.setStudentMarks("79");
		s1.setStudentRoll("70");
		
		Cache.addStudent(s1);
		
		Student s2=new Student();
		s2.setStudentName("Prem");
		s2.setStudentMobile("8210574728");
		s2.setStudentMarks("71");
		s2.setStudentRoll("7");
		
		Cache.addStudent(s2);
		
		Student s3=new Student();
		s3.setStudentName("Sakshi");
		s3.setStudentMobile("8210574728");
		s3.setStudentMarks("47");
		s3.setStudentRoll("81");
		
		Cache.addStudent(s3);
		
		Student s4=new Student();
		s4.setStudentName("Ravi");
		s4.setStudentMobile("8210574728");
		s4.setStudentMarks("85");
		s4.setStudentRoll("73");
		
		Cache.addStudent(s4);
		
		Student s5=new Student();
		s5.setStudentName("Sourabh");
		s5.setStudentMobile("8210574728");
		s5.setStudentMarks("40");
		s5.setStudentRoll("401");
		
		Cache.addStudent(s5);
		
		Student s6=new Student();
		s6.setStudentName("Sanchayeta");
		s6.setStudentMobile("8210574728");
		s6.setStudentMarks("80");
		s6.setStudentRoll("82");
		
		Cache.addStudent(s6);
	}

	
}
