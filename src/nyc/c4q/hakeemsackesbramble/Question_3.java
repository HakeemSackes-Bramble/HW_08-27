package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */
public class Question_3 {
    public static void main(String[] args){

    }
    public static Boolean XO(String arg1){
        int Ocount = 0;
        int Xcount = 0;
        String arg2 = arg1.toLowerCase(); //lowercase version of arg1
        for(int i = 0; i < arg1.length(); i++){

            if(arg2.charAt(i) == 'x'){
                Xcount += 1;
            }else if(arg2.charAt(i) == 'o'){
                Ocount += 1;
            }
        }
        return (Ocount == Xcount);
    }
}

