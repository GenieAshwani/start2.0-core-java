package recursion;

public class FirstIndex {

    public static void main(String[] args) {

        int arr[]={3,1,2,4,5,6,4,1,1};
        System.out.println(fi(arr,4,0));
        System.out.println(li(arr,4,0));
    }

    public static int fi(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }

        if(arr[index]==target)
        {
            return index;
        }
        else {
            int res=fi(arr,target,index+1);
            return res;
        }
    }

    public static int li(int arr[],int target,int index)
    {
        if(index==arr.length)
        {
            return -1;
        }
        int res=li(arr,target,index+1);
        if(res==-1)
        {
            if(arr[index]==target)
            {
                return index;
            }
            else {
                return -1;
            }
        }
        else {
            return res;
        }
    }
}
