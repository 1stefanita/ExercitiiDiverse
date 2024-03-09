import java.util.Scanner;
public class Exercitiu4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		if(x<y && x<z)
			System.out.println(x);
		if(y<x &&y<z)
			System.out.println(y);
		if(z<x && z<y)
			System.out.println(z);
	}

}
