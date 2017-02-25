
public class BCITStudent extends Student 
{
	public String BCITSN;
	public Campus SCAMPUS;
	
	
	public BCITStudent(String firstName, String lastName, int yearOfBirth, Gender sGender, String BCITSN, Campus SCAMPUS, String major, double sGpa)
	{
		super(firstName, lastName, yearOfBirth, sGender, null, major, sGpa);
		this.SCAMPUS = SCAMPUS;
		this.BCITSN = BCITSN;
	}
	
	public String BCITSN()
	{
		return this.BCITSN;
	}
	
	public void BCITSN(String value)
	{
		String prefix = "A";
		this.BCITSN = value == null || value.equals("") ? prefix + "000000" : prefix + value; 
	}

	//“Gloria Macarenko is a BCITStudent of journalism (st# A88877777) at the Burnaby campus. She was born in 1962.”
	public String getDetails()
	{
		return String.format("%s is a %s of %s (Student#: %s) at the %s campus. %s was born in %d.", super.getFullName(), this.getClass().getSimpleName(), 
				super.getMajor(), BCITSN, SCAMPUS, super.getGenderIndicator(), super.getYearOfBirth());
	}
}
