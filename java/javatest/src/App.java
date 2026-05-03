public class App {
    public static void main(String[] args) throws Exception {

        String greeting = "Hello";

        int greetLength = greeting.length();
    
        for (int i = 0; i < greetLength; i++){
            System.out.println(greeting.charAt(i));
        }
    }
}
