
class TestChain
{
	public static void main(String[] args) {
		Chain chain = new Chain();

		chain.process(new Number(85));
		chain.process(new Number(50));
		chain.process(new Number(0));
		chain.process(new Number(1));
	}
}
