package workshop;

public class FizzRule implements BusinessRule {
    public boolean check(int input) {
        return input % 3 == 0;
    }

    public String say() {
        return "Fizz";
    }
}
