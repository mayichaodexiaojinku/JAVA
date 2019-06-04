package computer;

public class test {
     public static void main(String[] agrs){
           CPU cpu = new Inter("intel-core i7","3.3GHZ");
           EMS ems = new DDREMS("8G","DDR3");
           HardDisk hd = new SSDHD("512G");
           Computer c = new Computer();
           c.setCpu(cpu);
           c.setEms(ems);
           c.setHd(hd);
           c.print();
     }
}
