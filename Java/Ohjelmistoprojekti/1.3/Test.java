
public class Test {
    public static void main(String[] args) {
        Clock clock1 = Clock.getInstance();
        Clock clock2 = Clock.getInstance();

        System.out.println(clock1);
        System.out.println(clock2);

        System.out.println("clock1 hash-koodi on: " + clock1.hashCode());
        System.out.println("clock2 hash-koodi on: " + clock2.hashCode());

        if (clock1 == clock2) {
            
            System.out.println("Clock-luokka noudattaa Singletonin-mallia");
        } else {
            System.out.println("Clock-luokka ei noudata Singleton-mallia");
        }
    }

}
