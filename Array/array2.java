//Array Sorting using Bubble Sort
public class array2 {
    public static void bubble(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String args[])
    {
        int arr[]={4,2,8,6,1,0,57,34,768};
        array2.bubble(arr);
    }
}
