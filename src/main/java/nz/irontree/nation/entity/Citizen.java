package nz.irontree.nation.entity;

public class Citizen {

    private int id;
    private String name;
    private String surname;
    private int age;
    private final Nation citizenship;

    public Citizen(int id, String name, String surname, int age, Nation citizenship) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.citizenship = citizenship;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
