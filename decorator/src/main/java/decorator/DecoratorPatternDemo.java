package decorator;

public class DecoratorPatternDemo {
	   public static void main(String[] args) {Bank hnb = new HNB();Bank MainHNB = new HNBBankDecorator(new HNB());Bank MainBOC = new BankDecorator(new BOC());
	      System.out.println("HNB with normal interest");
	      hnb.interest();System.out.println("HNB with bonus interest");
	      MainHNB.interest();System.out.println("\nBOC with bonus interest");
	      MainBOC.interest();
	   }
	}