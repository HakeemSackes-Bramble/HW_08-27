package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */
/**
Write a method named calculateAge that takes two arguments: birth year and current year.
The method should then calculate the two possible ages based on that year,
 and return the result in the following format:
 (replacing 'NN' with the possible years) : "You are either NN or NN."
 */

public class Question_2 {
    public static void main(String[] args){
    System.out.println(calculateAge(1992, 2016));
    }
    public static String calculateAge(int birthYear, int CurrentYear) {
        int age = CurrentYear - birthYear;
        return "You are either " + (age - 1) + " or " + age + ".";
    }
}
