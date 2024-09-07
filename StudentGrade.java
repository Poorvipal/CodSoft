import java.util.*;
class Calculate{
        void calculate() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter number of subjects:");
            int Sub = in.nextInt();

        if (Sub <= 0) {
            System.out.println("Enter proper number of subjects");
            return;
        }
        int Total = 0;
        int MarksperSubject = 100;

        for (int i = 1; i <= Sub; i++) {
            System.out.println("Enter marks obtained in subject " +i);
            int marks = in.nextInt();

            if (marks < 0 || marks > MarksperSubject) {
                System.out.println("The marks should be in the range of 1 to 100");
                i--;
            } else {
                Total += marks;
            }
        }
        double Average = (double) Total / (Sub);
        System.out.println("Total Marks:" + Total);
        System.out.println("Average:" + Average + "%");

            String grade;
            if (Average >= 95) {
                grade = "A+";
            } else if (Average >= 90) {
                grade = "A";
            } else if (Average >= 80) {
                grade = "B+";
            } else if (Average >= 70) {
                grade = "B";
            } else if (Average >= 50) {
                grade = "P";
            } else {
                grade = "F";
            }
            System.out.println("Grade :" + grade);
        }
    }
class StudentGrade{
    public static void main(String[] args){
        Calculate c=new Calculate();
        c.calculate();

    }
}

