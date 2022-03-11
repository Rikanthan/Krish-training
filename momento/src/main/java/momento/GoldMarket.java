package momento;

public class GoldMarket
{
	private double goldPrice;

	public void set(double goldPrice)
	{
		System.out.println("Setting goldPrice to " + goldPrice);
		this.goldPrice = goldPrice;
	}

	public Memento saveToMemento()
	{
		System.out.println("Saving goldPrice to Memento");
		return new Memento(goldPrice);
	}

	public void restoreFromMemento(Memento memento)
	{
		goldPrice = memento.getSavedgoldPrice();
		System.out.println("goldPrice restored from Memento: " + goldPrice);
	}

	public static class Memento
	{
		private final double goldPrice;

		public Memento(double goldPriceToSave)
		{
			goldPrice = goldPriceToSave;
		}

		public double getSavedgoldPrice()
		{
			return goldPrice;
		}
	}
}