
public class EvenNumber extends CheckNumber {
	public EvenNumber(CheckNumber nextCheckNumber){
		super(nextCheckNumber);
		
	}

	public void process(Number request)
	{
		if (request.getNumber() % 2 == 0)
		{
			System.out.println("EvenNumber : " + request.getNumber());
		}
		else
		{
			super.process(request);
		}
	}
}
