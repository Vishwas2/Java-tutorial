// write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
public class PracticeQuestion07 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);
        // the above code will print out J
        // Decrypting the grade
        char decryptedGrade;
        decryptedGrade = (char) (grade - 8);
        System.out.println("Decrypted grade is : " + decryptedGrade);
    }
}