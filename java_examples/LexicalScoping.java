package hijava;

public class LexicalScoping {

    public static String text = "Hello world!";
    private static int number = 42;
    
    public static void main(String[] args) {
        // text and number are both accessible:
        System.out.println(text);
        number++;
        
        for(int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i)); // i is available inside the for-loop
        }
//        i++; // <-- Compilation error. It is not available here. It's outside the scope of the for-loop, where it was defined
        
    }
}

class Bar {
    private static String text;
    private static int number;
    
    Bar() {
        this.text = LexicalScoping.text;
//        this.number = LexicalScoping.number; // Compilation error: LexicalScoping.number is private
    }
}
