

  class InheritanceP2 {
    public static void main(String[] args)
    {
        SavingAccount sa=new SavingAccount("Amaan","Hariphatak rajiv nagar","6531-987-789",982605218,18008965);
        System.out.println(sa);
        sa.setBalance(78789.232);
        System.out.println("bought forwarded balance is "+sa.getBalance());
        sa.setDeposite(8965.21);
        System.out.println("Deposited amount is "+sa.getDeposite());
        System.out.println("Current balance is "+sa.getBalance());
        sa.setWithdrawl(23000);
        System.out.println("Withdrawl amount "+sa.getWithdrawl());
        System.out.println("current balance is "+sa.getBalance());


    }
}
 class Account
{
    String name ,address,DOB,adhaar_nos,date_of_opning;
    int account_no,phone_no;
    public String getName()
    {
        return name ;
    }
    public String getAddress()
    {
        return address ;
    }
    public String getDOB()
    {
        return DOB ;
    }
    public String getAdhaar_nos()
    {
        return adhaar_nos;
    }
    public String getDate_of_opning()
    {
        return date_of_opning;
    }
    public void setAddress(String address )
    {
        this.address=address;
    }
    public void setPhone_no(int phoneNo)
    {
        this.phone_no=phone_no;
    }
   public Account(String name ,String address,String AdhaarNo,int phone_no,int account_no)
    {
        this.name=name;
        this.phone_no=phone_no;
        this.address=address;
        this.adhaar_nos=AdhaarNo;
        this.account_no=account_no;
    }
   public Account()
   {
       this.name=name;
       this.phone_no=phone_no;
       this.address=address;
       this.adhaar_nos=adhaar_nos;
       this.account_no=account_no;
   }
    public String toString ()
    {
        return "Account no. is "+account_no+" \nName of applicant :"+name+"\nAddress of applicant is "+address+" \nAdhaar number is "+adhaar_nos+"\nPhone number of applicant "+phone_no;
    }
}

  class SavingAccount extends Account
{
    double balance,withdrawl,deposite;
    public double  getbalance ()
    {
        return balance;
    }
    public double getWithdrawl()
    {
        return withdrawl;
    }
    public double getDeposite()
    {
        return  deposite;
    }
    public void setWithdrawl(double withdrawl)
    {
        this.withdrawl=withdrawl;
        balance =balance -withdrawl;

    }
    public void setDeposite(double deposite)
    {
        this.deposite=deposite;
        balance =balance+deposite;

    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    public SavingAccount(String name ,String address,String AdhaarNo,int phone_no,int account_no)
    {
        this.name=name;
        this.phone_no=phone_no;
        this.address=address;
        this.adhaar_nos=AdhaarNo;
        this.account_no=account_no;
    }

    public double getBalance() {
        return balance;
    }
}
class LoanAccount extends Account
{
    double balance ;
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}