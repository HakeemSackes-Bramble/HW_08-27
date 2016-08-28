package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */
public class Question_4 {
    public static void main(String[] args){
        System.out.println(endsly("hvfdibsdl"));
    }
    public static Boolean endsly(String strvalue) {
        int strEnd = strvalue.length() - 1;
        String strval = strvalue.toLowerCase();
        return (strval.endsWith("ly"));
    }
}
