import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("obergrenze der zu Berechnenden Zahl eingeben");
        int input1 = scanner.nextInt();
        EratosthenesPrimeSieve primeSieve = new EratosthenesPrimeSieve(input1);
    }
}
