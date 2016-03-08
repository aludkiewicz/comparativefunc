package hijava;

public class TailRec {
    
    public static void main(String[] args) {
        int n = 100000;
        call1000Times(n);
    }
    
    /**
     * Tail recursion in Java. Tail call optimization is not implemented though!
     * Some old JDK code used to rely on counting stack frames, which has been called
     * "A stupid reason". Tail call optimization has been mentioned to be on the roadmap
     */
    private static void call1000Times(int calls) {
        if(calls == 1000) {
            return;
        } else {
            call1000Times(calls++);
        }
    }
}
