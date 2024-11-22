package ArrayQuestions;

public class FindLength {

    public static void main(String[] args) {
        int arr[]={1,2,3,45,6,7};
        int length = findArrayLength(arr);
        System.out.println("Array lenght is = "+length);
    }

    public static int findArrayLength(int arr[])
    {
        //do not use predefine methods
        //return arr.length;
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            count++;
        }
        return count;
    }
}
