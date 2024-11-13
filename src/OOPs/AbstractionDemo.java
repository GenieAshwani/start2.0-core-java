package OOPs;

class ATMDemo
{
    private String bal="10000";
    private int lastTran=100;
    private String password="123";
    private String account="A1S23";

    public String getBal(String password,String account) {
        if (this.password.equals(password) && this.account.equals(account))
        {

            return "Your account balance is : "+bal;
        }
        else {
            return "details not matched";
        }
    }

    public void setBal(String  bal) {
        this.bal = bal;
    }

    public int getLastTran() {
        return lastTran;
    }

    public void setLastTran(int lastTran) {
        this.lastTran = lastTran;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        ATMDemo atmDemo=new ATMDemo();
        String res = atmDemo.getBal("123212", "A1S23");
        System.out.println(res);
    }
}
