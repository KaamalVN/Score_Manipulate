import java.util.Scanner;

public class Score_Manipulate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(score_manipulate(input));
    }

    static int score_manipulate(int input) {
        int score=1;
        while(input>1){
            if(input%2==0){
                //System.out.print(input);
                input/=2;

            }
            else{
                score++;
                //System.out.print(input);
                input-=1;
            }
        }
        return score;
    }
}
