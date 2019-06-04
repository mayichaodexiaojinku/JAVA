package computer;

public class Inter implements CPU{
    private String brand;
    private String frequency;
    
	public Inter(String brand, String frequency) {
		super();
		this.brand = brand;
		this.frequency = frequency;
	}

	@Override
	public String getBrand() {
		return brand;
	}

	@Override
	public String getBre() {
		// TODO Auto-generated method stub
		return frequency;
	}
    
}
