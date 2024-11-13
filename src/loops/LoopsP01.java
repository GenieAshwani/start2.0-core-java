package loops;

public class LoopsP01 {
    public static void main(String[] args) {


            //why ?
        // print 10 line 1----->10
       /* System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");

        is kam ko easy krne k liy loop aya
*/

        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }


        System.out.println("------------------while loop------------------");
        //while loop
        int i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------do while---------------------");
        //do while
        int k=5;
        do {
            System.out.println(k);
        }
        while (k>10);


    }
}
