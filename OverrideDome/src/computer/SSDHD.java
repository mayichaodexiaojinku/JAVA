package computer;

public class SSDHD implements HardDisk{
    private String capacity;    
	public SSDHD(String capacity) {
		super();
		this.capacity = capacity;
	}
	@Override
	public String getCap() {
		return capacity;
	}
     
}
