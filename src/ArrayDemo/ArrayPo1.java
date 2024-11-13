package ArrayDemo;

public class ArrayPo1 {

    public static void main(String[] args) {

        //create array
        int arr[]=new int[5];

        //insert data
        arr[0]=10;

        //print
        System.out.println(arr[1]);

        //insert using loop
        // 1 2 3 4 5
        for(int i=0;i<5;i++)
        {
            arr[i]=i;
        }

        //print using loop
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

        for(int a:arr)
        {
            System.out.println(a);
        }
    }
}
