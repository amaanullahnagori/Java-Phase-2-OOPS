

 class constructor05 {
    public static void main(String[] args) {
        Customer c=new Customer("Rahul",982603125,"rajiv nagar","rt-898");
        System.out.println(c.getName());
        System.out.println(c.getAddress());
        System.out.println(c.getId());
        System.out.println(c.getPhoneNo());
        c.setPhoneNo(982602312);
        c.setAddress("Shanti nagar");
        System.out.println("the new no. is "+c.getPhoneNo());
        System.out.println("the new address is "+c.getAddress());
    }
}
class Customer
{
    private String id,name ;
    private int phoneNo;
    private String Address;
    public Customer (String name,int pn,String address,String id )
    {
        this.name =name;
        this.id =id;
        this.phoneNo=pn;
        this.Address=address;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getId()
    {
        return id;
    }
    public int getPhoneNo()
    {
        return phoneNo;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.Address=address;
    }
    public void setPhoneNo(int phoneNo)
{
    this.phoneNo=phoneNo;
}
}    
