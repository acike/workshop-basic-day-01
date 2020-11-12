package workshop;

public class KBTGRule implements BusinessRule {
    @Override
    public boolean check(int input) {
        return input == 11;
    }

    @Override
    public String say() {
        return "KBTG";
    }
}
