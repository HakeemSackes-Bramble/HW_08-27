package nyc.c4q.hakeemsackesbramble;
import java.util.Scanner;
/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */
public class Question_6 {

    public static void main(String[] args){
        hungryhippo();
    }

    public static void hungryhippo(){
        String foodLowCase = "";
        String response = "";
        while((foodLowCase.equals("end"))==false){
            System.out.println("Enter a food: ");
            Scanner scanner = new Scanner(System.in);
            String food = scanner.next();
            foodLowCase = food.toLowerCase();
            char foodLetter = foodLowCase.charAt(0);
            if(foodLetter == 'h'){
                response = "Mmmm yummy!!";
                System.out.println(response);
            }else{
                response = "yuck!! you call that food??";
                System.out.println(response);
            }
        }
    }
}
