public class GradeCalculation {
    public static void main(String[] args) {

        int marks = 85;
        int grade = marks / 10;

        switch (grade) {
            case 10:
                System.out.println("Grade: O");
                break;
            case 9:
                System.out.println("Grade: A+");
                break;
            case 8:
                System.out.println("Grade: A");
                break;
            case 7:
                System.out.println("Grade: B+");
                break;
            case 6:
                System.out.println("Grade: B");
                break;
            case 5:
                System.out.println("Grade: C");
                break;
            default:
                System.out.println("Fail");
        }
    }
}