package ArrayQuestions;

import java.util.Arrays;

public class SecondMaxMin {
    public static void main(String[] args) {
        int arr[]={10,2,3,11,15};
        secondMinMax(arr);
    }

    public static void defaultMaxMin(int arr[])
    {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second max "+ arr[arr.length-2]);
        System.out.println("Second min "+ arr[1]);
    }

    public static void secondMinMax(int arr[])
    {
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int data:arr)
        {
            if(data>max)
            {
                smax=max;
                max=data;
            }
            else if(data>smax && data!=max)
            {
                smax=data;
            }

            if(data<min)
            {
                smin=min;
                min=data;
            }
            else if(data<smin && data!=min)
            {
                smin=data;
            }

        }

        System.out.println("Max Value = "+max);
        System.out.println("Second Max Value = "+smax);
        System.out.println("Min Value = "+min);
        System.out.println("Second min Value = "+smin);

    }
}
