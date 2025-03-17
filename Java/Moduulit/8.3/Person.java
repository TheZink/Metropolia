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
        
        people.add(new Person("Ilkka", 33, "Helsinki"));
        people.add(new Person("Jukka", 66, "Helsinki"));
        people.add(new Person("Mikko", 55, "Vantaa"));
        people.add(new Person("Matti", 44, "Espoo"));
        people.add(new Person("Jussi", 22, "Helsinki"));

        
        people.sort(Comparator.comparing(Person::getAge)); // Sortataan iän mukaan
        people.removeIf(p -> !p.getCity().equals("Helsinki")); // Poistetaan kaikki muu paitsi Helsingissä asuvat
        people.forEach(p -> System.out.println(p.getName() + " " + p.getAge() + " " + p.getCity()));


    }
}
