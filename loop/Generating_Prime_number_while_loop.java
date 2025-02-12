import java.util.*;
public class Generating_Prime_number_while_loop
{
	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int i=2;
        while(i<=n)
        {
            boolean prime=false; 
            if(i==2)
                prime=true;
            else{
            for(int j=2;j<i;j++)
            {
                if(i%j==0){
                    prime = false;
                    break;
                }
                else
                    prime = true;
            }
            }
            if(prime)
            {
                System.out.println(i);
            }
            i++;
        }
	}
}