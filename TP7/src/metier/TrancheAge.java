package metier;

public class TrancheAge 
{

	private String code;
	private int ageMin;
	private int ageMax;

	
	public TrancheAge(String code, int ageMin, int ageMax) 
	{
		super();
		this.code = code;
		this.ageMin = ageMin;
		this.ageMax = ageMax;

	}

	public String getCode() 
	{
		return code;
	}

	public int getAgeMin() 
	{
		return ageMin;
	}

	public int getAgeMax() 
	{
		return ageMax;
	}

	@Override
	public String toString() {
		return  code + ", ageMin=" + ageMin + ", ageMax=" + ageMax;
	}
	
	
	
}
