
public class Car {
	
	//required parameters
	private String Fuel;
	private String Battery;
	
	//optional parameters
	private boolean isAutoGireEnabled;
	private boolean isPowerSteering;
	

	public String getFuel() {
		return Fuel;
	}

	public String getBattery() {
		return Battery;
	}

	public boolean isAutoGireEnabled() {
		return isAutoGireEnabled;
	}

	public boolean isPowerSteering() {
		return isPowerSteering;
	}
	
	private Car(CarBuilder builder) {
		this.Fuel=builder.Fuel;
		this.Battery=builder.Battery;
		this.isAutoGireEnabled=builder.isAutoGireEnabled;
		this.isPowerSteering=builder.isPowerSteering;
	}
	
	//Builder Class
	public static class CarBuilder{

		// required parameters
		private String Fuel;
		private String Battery;

		// optional parameters
		private boolean isAutoGireEnabled;
		private boolean isPowerSteering;
		
		public CarBuilder(String Fuel, String Battery){
			this.Fuel=Fuel;
			this.Battery=Battery;
		}

		public CarBuilder setAutoGireEnabled(boolean isAutoGireEnabled) {
			this.isAutoGireEnabled = isAutoGireEnabled;
			return this;
		}

		public CarBuilder setPowerSteering(boolean isPowerSteering) {
			this.isPowerSteering = isPowerSteering;
			return this;
		}
		
		public Car build(){
			return new Car(this);
		}

	}

}