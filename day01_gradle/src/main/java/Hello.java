public class Hello {
    public String echo(String name) {
//        return "Hello " + name;
//        return String.format("Hello %s", name);
//        StringBuffer buffer = new StringBuffer("Hello ");
        StringBuilder builder = new StringBuilder("Hello ");
        builder.append(name);
        return builder.toString();
    }
}
