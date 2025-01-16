package BinarySearch;

public class FindRotated {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        System.out.println(search(arr,0));
    }
    public static int search(int[] arr, int target) {
        int l=0;
        int h=arr.length-1;

        while(l<=h)
        {
            int m=(l+h)/2;
            if(arr[m]==target)
                return m;

                //check for left sorted array
            else if(arr[l]<=arr[m])
            {
                if(target>=arr[l] && target<=arr[m])
                {
                    h=m-1;
                }
                else
                {
                    l=m+1;
                }
            }
            else
            {
                if(target>=arr[m] && target<=arr[h])
                {
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }

        }
        return -1;
    }
}
