// Write a function that takes in an array of integer and an integer and checks if the integer is bigger than all the elements
// in the array. If atleast one of the elements is bigger print out true otherwise false.
// For example :
// existsHigher([5,6,3,4,9],10) -> false
// existsHigher([5,6,3,4,9],4) -> true

package All_Coding_Exercises.Easy;

public class q005 {
    static void existsHigher(int[] arr, int number){
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>number){
                System.out.println(true);
                break;
            }
            else if ((arr[i]!=number) && (i == arr.length-1)){
                System.out.println(false);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        existsHigher(arr,5);  // true
        existsHigher(arr,7);  // false
    }
}
