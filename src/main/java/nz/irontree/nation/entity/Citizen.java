package nz.irontree.nation.entity;

public class Citizen {

    private final int id;
    private final String name;
    private final String surname;
    private final int age;
    private final Nation citizenship;

    public Citizen(int id, String name, String surname, int age, Nation citizenship) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.citizenship = citizenship;
    }

    public final String getName() {
        return name;
    }

    public final String getSurname() {
        return surname;
    }

    public final int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", citizenship=" + citizenship.getNameNation() +
                '}';
    }
}
