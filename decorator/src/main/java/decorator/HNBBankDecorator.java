package decorator;

public class HNBBankDecorator extends BankDecorator {

	   public HNBBankDecorator(Bank decoratedBank) {
	      super(decoratedBank);		
	   }

	   @Override
	   public void interestRate() {
	      decoratedBank.interestRate();	       
	      setInterestRateInDecember(decoratedBank);
	   }

	   private void setInterestRateInDecember(Bank decoratedBank){
	      System.out.println("5%");
	   }
	}
