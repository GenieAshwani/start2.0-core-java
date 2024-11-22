package ArrayQuestions;

public class AlternativeSum {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int sum=0;
        /*for (int i = 0; i <arr.length ; i=i+2) {
            sum=sum+arr[i];
        }*/

        for (int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum=sum+arr[i];
            }
        }
        System.out.println(sum);

    }
}
