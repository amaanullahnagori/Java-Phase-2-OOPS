

public class InheritanceP3 {
    public static void main(String[] args) {
        SmartPhone vivo=new SmartPhone();
        System.out.println("Emi number "+vivo.getEmiNo());
        System.out.println("Mac number "+vivo.getMacAddress());
        vivo.setPrice(12000);
        System.out.println("The price of phone is "+vivo.getPrice() );
        System.out.println(vivo.clickPhoto());
        System.out.println(vivo.calling());
        System.out.println(vivo.rejecting());
        System.out.println(vivo.socialMedia());
        System.out.println("The phone is working fine :)");


    }
}
class CellPhone {
 String emiNo="1321-98:97E-7L";
     int price;
    long phoneNo;

public String getEmiNo() // it will not have set method b/c it can not be change
    {return emiNo;}

    public int getPrice() {
        return price;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String calling() {
        return "calling is done ";
    }

    public String rejecting() {
        return "call is rejected ";
    }
}

    class SmartPhone extends CellPhone // inheritance cellphone is inheritated to smartphone
    {
        byte ram;
        short storage ;
        short size ;
        int batterySize;
        int macAddress=1239875656;
        public int getMacAddress()
        {return macAddress;}
        public byte getRam()
        {return ram ;}
        public short getStorage()
        {return storage;}
        public short getSize()
        {return size;}
        public void setRam(byte ram )
        {this.ram=ram;}
        public void setStorage(short storage )
        {this.storage=storage;}
        public void setBatterySize(int batterySize)
        {this.batterySize = batterySize;}
        public void setSize(short  size)
        {this.size=size;}
        public String clickPhoto()
        {return "Nice selfie";}
        public String socialMedia()
        {return "opning whatsapp";}


    }

