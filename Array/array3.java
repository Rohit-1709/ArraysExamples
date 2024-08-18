public class array3 {
    public int insertion(int arr[])
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }System.out.println(arr[i]);
        }
        return 0;
    }
    public static void main(String args[])
    {
        int arr[]={3,1,9,6,3,4,8,4,0};
        array3 obj=new array3();
        obj.insertion(arr);
    }
}
