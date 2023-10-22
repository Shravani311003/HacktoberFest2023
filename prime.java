import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int num, flag=0;
	System.out.println("Enter the number :");
	Scanner r = new Scanner (System.in);
	num=r.nextInt ();
	for(int i=2;i<(num-1);i++){
			if (num%i==0)
			{		
			  flag=1;
			  break;
			}
	}
	if (flag==0)
		System.out.println("It is a PRIME number");
	else
		System.out.println("It is NOT a prime number");}
}
