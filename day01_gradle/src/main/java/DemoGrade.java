public class DemoGrade {

    public static final int MIN_SCORE_FOR_GRADE_A = 80;

    public static void main(String[] args) {

    }

    private String calculate(int score) {
        // Guard :: Fail
        if (!(score >= 0 && score <= 100)) {
            return "S";
        }

        // Ok
        // Rule 1
        if (score >= MIN_SCORE_FOR_GRADE_A) {
            return "A";
        }
        // Rule 2
        if (score >= 70) {
            return "B";
        }
        return "F";

    }
}
