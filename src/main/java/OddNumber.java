
public class OddNumber extends CheckNumber {
	public OddNumber(CheckNumber nextCheckNumber){
		super(nextCheckNumber);
	}

	public void process(Number request)
	{
		if (request.getNumber() % 2 != 0)
		{
			System.out.println("OddNumber : " + request.getNumber());
		}
		else
		{
			super.process(request);
		}
	}
}
