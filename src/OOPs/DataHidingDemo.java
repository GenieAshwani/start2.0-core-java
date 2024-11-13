package OOPs;


class Data{
    private String name="codeforsuccess";
    private String password="root1234";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkBal(String password)
    {
        if(password.equals(password))
        {
            System.out.println("login...");
        }
        else {
            System.out.println("pin not match");
        }
        return "";
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {
        Data data=new Data();


    }
}
