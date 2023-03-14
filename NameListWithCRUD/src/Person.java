public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
            throw new RuntimeException("Name cannot be left empty");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0)
            throw new RuntimeException("Age cannot be less or equal to 0");
        this.age = age;
    }
}
