import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        //return  -1;

       // return Integer.parseInt(numbers);

//        String[] tokens = numbers.split(",");
//        int sum = 0;
//        for (String token : tokens) {
//            sum += Integer.parseInt(token.trim());
//        }
//        return sum;

        String delimiter = ",|\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }


//        String[] tokens = numbers.split(delimiter);
//        int sum = 0;
//        for (String token : tokens) {
//            sum += Integer.parseInt(token.trim());
//        }
//        return sum;

        String[] numArray = numbers.split(delimiter);
        int sum = 0;
        List<Integer> negatives = new ArrayList<>();

        for (String num : numArray) {
            int number = Integer.parseInt(num.trim());
            if (number < 0) {
                negatives.add(number);
            }
            sum += number;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;



    }

}



