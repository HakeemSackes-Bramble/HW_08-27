package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */

/*
Write a method named add that takes in two numbers as arguments.
The function should return the sum of the two numbers.
 */
public class Question_1 {
    public static void main(String[] args){
        int sum = add(1,2);
        System.out.println(sum);
    }

    public static int add(int value1, int value2){
        return value1 + value2;
    }
}
