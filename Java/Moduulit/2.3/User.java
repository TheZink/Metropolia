public class User {
    private String name;
    private int age;

    Library library = new Library();

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    String getName(){
        return name;
    }

    int getAge(){
        return age;
    }
}
