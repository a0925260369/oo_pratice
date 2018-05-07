package guitar;

public class Guitar {
	private String serialNumber;
	private GuitarSpec spec;
	private double price;
	public Guitar(String serialNumber,double price,GuitarSpec spec) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
		
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public GuitarSpec getSpec() {
		return spec;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
