import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(random.nextInt(1,100));
        }
        System.out.println(numbers);
        System.out.println(numbers.size());


        System.out.println("_____Even numbers_____");
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number%2==0){
                evenNumbers.add(number);
            }
        }
        for (Integer evenNumber : evenNumbers) {
            System.out.print(evenNumber  +" ");
        }


        System.out.println();
        System.out.println("____Odd numbers_____");
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (Integer number1: numbers) {
            if(number1%2==1){
                oddNumbers.add(number1);
            }
        }
        for (Integer oddNumber: oddNumbers) {

            System.out.print(oddNumber + " ");
        }
    }
}