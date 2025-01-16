package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={10,2,4,56,6};
        int arr1[]={10,20,30,40,50,60,70};
        int res = linear(arr, 6);
        System.out.println(res);
        int binary = binary(arr1, 60);
        System.out.println(binary);

    }

    public static int linear(int arr[],int val)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(val==arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static int binary(int[] arr,int val)
    {
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==val) return mid;
            else if(arr[mid]<val) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
