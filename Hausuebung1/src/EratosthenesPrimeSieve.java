import java.util.ArrayList;

public class EratosthenesPrimeSieve implements EratosthenesInterface {
    public int limit;
    public ArrayList<Integer> primesList = new ArrayList<>();
    public ArrayList<Integer> numbersList = new ArrayList<>();

    @Override
    public boolean isPrime(int input) {
        upToo(numbersList);
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i)==2&& numbersList.get(i)%2 == 0 ){
                numbersList.remove(numbersList.get(i));
                System.out.println(numbersList);

            } else if (numbersList.get(i)>2) {
                for (int j = 0; j < numbersList.size(); j++) {
                    if(numbersList.get(i)%numbersList.get(j)== 0){
                        numbersList.remove(j);
                    }
                }

            }
        }
        return true;

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
