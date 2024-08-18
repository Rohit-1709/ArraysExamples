//Array Sorting using Insertion Sort
public class array1{
    public static int largest(int arr[])
    {
        int temp=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
            if(arr[i]<=arr[j])
            {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            }
            }

            System.out.println(arr[i]);
        }

    return 0;
    }
    public static void main (String args[])
    {
        int arr[]={3,1,7,9,4,6,8};
        //array1 obj=new array1();
        largest(arr);
        System.out.println("Top three largest no. are :-  " + arr[0]+" "+ arr[1]+" "+arr[2]);
    }
}