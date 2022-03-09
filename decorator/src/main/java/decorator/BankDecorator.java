package decorator;

public abstract class BankDecorator implements Bank{
	   protected Bank decoratedBank;

	   public DecorateBank(Bank decoratedBank){
	      this.decoratedBank = decoratedBank;
	   }

	   public void interestRateforSaving(){
	      decoratedBank.interestRateforSaving();
	   }

	public void interestRate() {
		// TODO Auto-generated method stub
		
	}	
	}
