package computer;

public class Computer {
    private CPU cpu;
    private EMS ems;
    private HardDisk hd;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public EMS getEms() {
		return ems;
	}
	public void setEms(EMS ems) {
		this.ems = ems;
	}
	public HardDisk getHd() {
		return hd;
	}
	public void print(){
		System.out.println("�������Ϣ��\n"+"cpuƷ��"+cpu.getBrand());
	}
	public void setHd(HardDisk hd) {
		this.hd = hd;
	}   
}
