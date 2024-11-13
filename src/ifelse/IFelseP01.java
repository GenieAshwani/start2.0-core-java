package ifelse;

public class IFelseP01 {

    public static void main(String[] args) {
        // tumhare papa tumhe 10 diya
        //lays toffee biscut kurkure chips kitkat lolipop
        int rs=10;
        if(rs>2)
        {
            System.out.println("toffee leli...");
            rs=rs-2; //8
            if(rs>5)
            {
                System.out.println("munch bhi le li...");
                rs=rs-5; //3
                if(rs>5)
                {
                    System.out.println("Lays bhi le liy...");

                }
                else{
                    System.out.println("lays nhi le paya...");
                    if(rs>2)
                    {
                        System.out.println("orange wali toffee leli...");
                        rs=rs-2;
                        if(rs>=1)
                        {
                            System.out.println("kaccha mango le liya...");
                            rs=rs-1;
                            if (rs>=1)
                            {
                                System.out.println("bubelgum le liya...");
                            }
                            else {
                                System.out.println("ek bhi paisa nhi ha....");
                            }
                        }
                        else {
                            System.out.println("paise khtam...");
                        }

                    }
                    else {
                        System.out.println("Orange wali nhi le paya...");
                    }
                }
            }
            else{
                System.out.println("munch nhi le paya...");
            }

        }
        System.out.println("program ended....");
    }
}
