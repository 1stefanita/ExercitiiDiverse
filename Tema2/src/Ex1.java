import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) 
	 {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Introduceti numarul n : ");
        int n = scanner.nextInt();

        
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduceti elementul " + (i + 1) + ": ");
            double element = scanner.nextDouble();
            suma += element;
            }


            int mediaAritmetica= suma / n;


            System.out.println("Media aritmetica a " + n + " numere este: " + mediaAritmetica);

            scanner.close();
        }
    }
