
public class MobilePhone {
	private String manufacturer;
	private String model;
	private String price;
	private String carrier;
	
	public MobilePhone(String manufacturer, String model, String price, String carrier) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	
	public String call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	public String text(String message) {
		return message;
		
	}
	public String toString() {
		return "Manufacturer:" + manufacturer + "\n"
				+ "Model:" + model + "\n"
				+ "Price:" + price + "\n"
				+ "Carrier:" + carrier;
		
	}
	}

