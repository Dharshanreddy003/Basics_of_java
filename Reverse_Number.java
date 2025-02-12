import java.util.*;
public class Reverse_Number
{
	public static void main(String[] args) {
		int a=596;
		int rem,rev=0;
		while(a>0){
		    rem=a%10;
		    a=a/10;
		    rev=(rev*10)+rem;
		}
		System.out.println(rev);
	}
}