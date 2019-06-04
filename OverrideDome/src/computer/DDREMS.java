package computer;

public class DDREMS implements EMS{
    private String size;
    private String type;
    public DDREMS(String size, String type) {
		super();
		this.size = size;
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public String getType() {
		return type;
    }
}
