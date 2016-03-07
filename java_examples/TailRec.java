package hijava;

public class TailRec {
    
    public static void main(String[] args) {
        int n = 100000;
        call1000Times(n);
    }
    
    /**
     * Tail recursion in Java. Tail call optimization is not implemented though!
     * It has been mentioned to be on the roadmap, though
     */
    private static void call1000Times(int calls) {
        if(calls == 1000) {
            return;
        } else {
            call1000Times(calls++);
        }
    }
}
