public class Counting_No_of_Values
{
public static void main(String[] args)
{
   int arr[]={0,1,1,1,1,0,0,1,0,1,1,1,0,0,0,0,2,2,3,3,4,4,4,4,4};
   int count=0;
   for(int i=0;i<arr.length;i++)
   {
       count=0;
       if(arr[i]!=-1)
       {
           count++;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[i]==arr[j])
               {
                   count++;
                   arr[j]=-1;
               }
           }
           System.out.println(arr[i]+":"+count);
       }
   }

}
}