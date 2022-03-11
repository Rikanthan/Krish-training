package momento;

import java.util.ArrayList;
import java.util.List;

public class Design {
	public static void main(String[] args)
	{
		
		List<GoldMarket.Memento> savedgoldPrices = new ArrayList<GoldMarket.Memento>();

		GoldMarket GoldMarket = new GoldMarket();

		//goldPrice travel and record the eras
		GoldMarket.set(10000.25);
		savedgoldPrices.add(GoldMarket.saveToMemento());
		GoldMarket.set(11000.75);
		savedgoldPrices.add(GoldMarket.saveToMemento());
		GoldMarket.set(15000.85);
		savedgoldPrices.add(GoldMarket.saveToMemento());
		GoldMarket.set(18000.35);

		GoldMarket.restoreFromMemento(savedgoldPrices.get(0));

	}
}
