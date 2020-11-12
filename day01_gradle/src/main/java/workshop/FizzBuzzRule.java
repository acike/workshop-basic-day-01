package workshop;

public class FizzBuzzRule implements BusinessRule {
    public boolean check(int input) {
        return input % 15 ==0;
    }

    public String say() {
        return "FizzBuzz";
    }
}
