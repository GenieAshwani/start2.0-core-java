package UserInput;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any digit....");
        int a=sc.nextInt();
        System.out.println("digit enter by user : "+a);
        sc.nextLine();
        System.out.println("Enter yor name...");
        String name = sc.nextLine();
        char c=name.charAt(0);
        char cc=sc.next().charAt(0);
        System.out.println("user name : "+name);
        System.out.println("char at 0th index "+name.charAt(0));


        //boolean
        //float

        //HW

    }
}
