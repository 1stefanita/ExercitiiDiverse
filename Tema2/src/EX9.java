import java.util.Scanner;
public class EX9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.println("Introdu un nr:");
		int n = scanner.nextInt();
if (n<2)
	System.out.println("nu e prim : ");
if (n%2 ==0 && n>2)
	System.out.println("nu e prim:");
 for (int i = 1; i*i<=n && n==1 ;i++)
	 if(n%i==0)
		 System.out.println("nu e prim  ");
 
 
 scanner.close();

	}

}
