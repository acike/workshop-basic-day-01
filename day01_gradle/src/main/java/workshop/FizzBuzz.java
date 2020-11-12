package workshop;



public class FizzBuzz {
    public String say(int input) {
        BusinessRule[] rules = new BusinessRule[]{
                new FizzBuzzRule(),
                new FizzRule(),
                new BuzzRule(),
                new KBTGRule()
        };

        for (BusinessRule rule : rules) {
            if(rule.check(input)) {
                return rule.say();
            }
        }

        return String.valueOf(input);
    }

    public String say2(int input) {
        String result = "";
        if(input % 3 == 0) {
            result += "Fizz";
        }
        if(input % 5 == 0) {
            result += "Buzz";
        }
        if("".equals(result)) {
            result = String.valueOf(input);
        }
        return result;
    }
}
