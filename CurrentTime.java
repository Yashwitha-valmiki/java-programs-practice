public class CurrentTime {
    public static void main(String[] args) {
        // long time = System.currentTimeMillis();
        // System.out.println("Current time in milli seconds: "+ time);
        long nano = System.nanoTime();
        System.out.println("Current time in nano seconds: "+nano);
    }
    
}
