

abstract class CheckNumber
{
	private CheckNumber nextCheckNumber;

	public CheckNumber(CheckNumber nextCheckNumber){
		this.nextCheckNumber = nextCheckNumber;
	};
	
	public void process(Number request){
		if(nextCheckNumber != null)
			nextCheckNumber.process(request);
	};
}
