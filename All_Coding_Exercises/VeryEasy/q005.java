// Create a function that takes in the number of upvotes and downvotes and display the total number of votes after
// subtracting downvotes from upvotes.

package All_Coding_Exercises.VeryEasy;

public class q005 {
    static void totalVotes(int upvotes,int downvotes){
        System.out.println("The total number of votes after subtracting downvotes from upvotes are : "+(upvotes-downvotes));
    }
    public static void main(String[] args) {
        totalVotes(15,5);
    }
}
