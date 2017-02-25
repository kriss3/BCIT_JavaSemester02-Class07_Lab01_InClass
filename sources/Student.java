
public class Student extends Person
{
	public String studentNumber;
	public String major;
	public double gpa;
	
	//What is substitution, you can always substitute Child for parent but parent for child - not always, check required and CAST
	public Student(String firstName, String lastName, int yearOfBirth, Gender sGender, String studentNumber, String major, double gpa)
	{
		super(firstName, lastName, yearOfBirth, sGender);
		this.studentNumber = studentNumber;
		this.major = major;
		this.gpa = gpa;
	}


	public String getStudentNumber() 
	{
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) 
	{
		this.studentNumber = studentNumber;
	}

	public String getMajor() 
	{
		return major;
	}

	public void setMajor(String major) 
	{
		this.major = major;
	}

	public double getGpa() 
	{
		return gpa;
	}

	public void setGpa(double gpa) 
	{
		this.gpa = gpa;
	}
	
	//�Michelle Obama is a Student of law (st# 98765432). She was born in 1964.�
	public String getDetails()
	{
		return String.format("%s is a %s of %s (Student#: %s). %s was born in %d.", super.getFullName(), this.getClass().getSimpleName(), major, studentNumber,
				super.getGenderIndicator(), super.getYearOfBirth());
	}
}
