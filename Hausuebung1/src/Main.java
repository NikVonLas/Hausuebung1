import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while ( loop== true){
            System.out.println("obergrenze der zu Berechnenden Zahl eingeben");
            System.out.print(">>");
            int input1 = scanner.nextInt();
            EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(input1);
            primeSieve.isPrime(input1);
            loop = false;
        }
    }
}
