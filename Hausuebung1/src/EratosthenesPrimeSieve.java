import java.util.ArrayList;

public class EratosthenesPrimeSieve implements EratosthenesInterface {
    public int limit;
    public ArrayList<Integer> examples = new ArrayList<>();
    public ArrayList<Integer> numbersList = new ArrayList<>();

    @Override
    public boolean isPrime(int input) {
        upToo(examples);
        upToo(numbersList);
        for (int i = 1; i < numbersList.size(); i++) {
            if (numbersList.get(i)==2){
                numbersList.remove(2);
                System.out.println(numbersList);

            } else if (numbersList.get(i)>2) {
                for (int j = 1; j < examples.size(); j++) {
                    if(numbersList.get(i)%examples.get(j)== 0){
                        numbersList.remove(examples.get(j));
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
