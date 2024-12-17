package ArrayQuestions;

import java.util.ArrayList;

public class SubArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int target=15;
        ArrayList<Integer> res = subarraySum(arr, target);
        System.out.println(res);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        ArrayList<Integer> res=new ArrayList<>();
        int l=0,r=0;
        boolean flag=false;
        int sum=arr[0];
        if(target==0)
        {
            res.add(-1);
            return res;
        }
        int n=arr.length;
        while(r<n)
        {
            if(sum==target)
            {
                flag=true;
                break;
            }
            else if(sum<target)
            {
                r++;
                if(r<n)
                {
                    sum+=arr[r];
                }
            }
            else{
                sum-=arr[l];
                if(l<n) l++;
            }

        }
        if(flag)
        {
            res.add(l+1);
            res.add(r+1);
            return res;
        }
        res.add(-1);
        return res;
    }
}
