package switchdemo;

public class SwitchDemo {

    public static void main(String[] args) {
        int a=9;

        switch (a)
        {
            case 10:
                System.out.println("10");
                return;
            case 9:
                System.out.println("9");
                break;
            case 7:
                System.out.println("7");
                break;
            default:
                System.out.println("default");
        }
    }


}
