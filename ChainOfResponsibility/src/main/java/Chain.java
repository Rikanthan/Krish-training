
public class Chain
{
	CheckNumber chain;

	public Chain(){
		buildChain();
	}

	private void buildChain(){
		chain = new EvenNumber(new OddNumber(null));
	}

	public void process(Number request) {
		chain.process(request);
	}

}