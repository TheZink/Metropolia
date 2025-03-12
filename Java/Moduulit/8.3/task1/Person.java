import java.util.*;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        ArrayList<String> sortedP = new ArrayList<>();

        Runnable r = () -> { 
            people.add(new Person("Ilkka", 33, "Helsinki"));
            people.add(new Person("Jukka", 66, "Helsinki"));
            people.add(new Person("Mikko", 55, "Vantaa"));
            people.add(new Person("Matti", 44, "Espoo"));
            people.add(new Person("Jussi", 22, "Helsinki"));
        };

        Thread t = new Thread(r);
        t.start();

        Runnable r2 = () -> {
            for (Person p : people) { System.out.println(p.getName() + " " + p.getAge() + " " + p.getCity());}

            people.sort(Comparator.comparing(Person::getAge));

            people.removeIf(p -> !sortedP.add(p.getCity()));

            System.out.println("Sorted by age and removed duplicated city:");

            for (String p : sortedP) { System.out.println(p);}

            System.out.println("Sorted people-list:");
            
            for (Person p : people) { System.out.println(p.getName() + " " + p.getAge() + " " + p.getCity()); }
        };

        Thread t2 = new Thread(r2);
        t2.start();
    }

}
