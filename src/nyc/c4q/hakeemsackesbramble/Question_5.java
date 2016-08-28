package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/28/16.
 */
public class Question_5 {

    public static void main(String[] args){
        System.out.println(chessboard(1000));

    }
    public static String chessboard(int number){
        String board = "";
        int swap = 0;

        for(int i = 0; i < number; i++){
            board += "\n";
            swap = i % 2;
            for(int j = 0; j < number; j++){
                if(j % 2 == swap){
                    board += "_";
                }else{
                    board += "#";
                }
            }

        }
        return board;
    }

}
