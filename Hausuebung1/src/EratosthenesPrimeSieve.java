import java.util.ArrayList;

public class EratosthenesPrimeSieve implements EratosthenesInterface {
    public int limit;
    public ArrayList<Integer> primesList = new ArrayList<>();
    public ArrayList<Integer> numbersList = new ArrayList<>();

    @Override
    public boolean isPrime(int input) {
        upToo(numbersList);
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i)>1&& numbersList.get(i)%i == 0 ){
                numbersList.remove(numbersList.get(i));
                System.out.println(numbersList);
                return true;
            }
        }
return false;
    }

    @Override
    public void printPrimes() {

    }

    public EratosthenesPrimeSieve(int limit) {
        this.limit = limit;
    }
    public void upToo(ArrayList<Integer>list){
        for (int i = 0; i < limit; i++) {
            list.add(i);
        }
    }
}
