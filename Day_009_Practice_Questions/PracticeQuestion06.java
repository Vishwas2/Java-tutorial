// what will be the result of the following expression : float a = 7/4 * 9/2

public class PracticeQuestion06 {
    public static void main(String[] args) {
        float a = 7 / 4 * 9 / 2;
        // since / and * have the same precedence so we have to check associativity
        // this expression will be evaluated left to right
        // first 7/4 will give 1 as result as both are integers
        // then 1 will be multiplied by 9 which equals to 1
        // then 9 will be devided by 2 which will give 4 as answer
        System.out.println(a);
    }
}
