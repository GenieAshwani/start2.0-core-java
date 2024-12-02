package ArrayQuestions;

public class SubArraySum {

    public static void main(String[] args) {
        int arr[]={1, 5, 7, -1, 5};
        int k=6;
        int res = countPair(arr, k);
        System.out.println(res);
    }

    public static int countPair(int arr[],int k)
    {
        int c=0;
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.println("i element k liy = "+arr[i]);
            for(int j=0;j<arr.length;j++)
            {
                System.out.println("j chal raha = "+arr[j]);
            }

        }*/

        for(int i=0;i<arr.length;i++)
        {

            for(int j=i+1;j<arr.length;j++)
            {
                int sum=arr[i]+arr[j];
                if(sum==k) c++;
            }
        }
        return c;
    }
}
