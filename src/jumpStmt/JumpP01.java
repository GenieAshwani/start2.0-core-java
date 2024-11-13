package jumpStmt;

public class JumpP01 {
    public static void main(String[] args) {

        //break
        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            if(i==2)
            {
                break;
            }
        }

        System.out.println("---------------------continue--------------");
        //continue
        for(int i=0;i<10;i++)
        {
            if(i==2) continue;
            System.out.println(i);
        }
    }
}
