public class EratosthenesPrimeSieve implements EratosthenesInterface {
    public int limit;

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean isPrime(int input) {
        if (input <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return false;
    }

    @Override
    public void printPrimes() {

    }

}
