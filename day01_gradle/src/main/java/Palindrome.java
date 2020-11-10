public class Palindrome {
    final static int ONE = 1; // constant
    static int i = 0; // class
    private final String input; // instance

    public Palindrome(String input) {
        this.input = input;
    }

    public int length() {
        return this.input.length();
    }

    public boolean isEven() {
        return length() % 2 == 0;
    }

    public boolean compare() {
        // 1. Reverse input
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        // 2. Compare
        return sb.toString().equals(this.input);
    }

    void unwrap() {
        Integer.parseInt("1234");
    }
}
