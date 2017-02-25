
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class School
{	
	public Person president;
	public HashMap<String, Student> students;
	
	public static void main()
	{
		School s = new School();
	}
	
	public School()
	{
		president = new Person("Kathy","Kinloch", 1960, Gender.FEMALE);
		
		students = new HashMap<>();
		
		
		Student s1 = new Student("Tony","Hawk",1968 ,Gender.MALE, "00001", "Physical Education", 4.0);
		students.put("00001", s1);
		
		Student s2 = new BCITStudent("Stanislaw","Ulam",1909,Gender.MALE, "00002", Campus.RICHMOND, "Mathematics", 4.0);
		students.put("00002", s2);
		
		Student s3 = new Student("Mark","Zuckerberg",1984,Gender.MALE, "12345678", "Computer Science", 3.0);
		students.put("12345678", s3);
		
		Student s4 = new Student("Michelle","Obama",1964,Gender.FEMALE, "98765432", "Law", 4.5);
		students.put("98765432", s4);
		
		Student s5 = new BCITStudent("Markus", "Frind", 1979, Gender.MALE, "A12345678", Campus.DOWNTOWN, "Computer Science", 3.6);
		students.put("A12345678", s5);
		
		Student s6 = new BCITStudent("Gloria", "Macarenko", 1962, Gender.FEMALE, "A88877777", Campus.BURNABY, "Jurnalisim", 3.6);
		students.put("A88877777", s6);
		
		
		System.out.print(president.getDetails());
		int count = 1;
		
		for(Map.Entry<String, Student> entry : students.entrySet())
		{
			System.out.print(count + "." + entry.getValue().getDetails());
			count++;
		}
	}	
}