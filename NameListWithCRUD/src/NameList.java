import java.util.ArrayList;
import java.util.Scanner;

public class NameList {

    private ArrayList<Person> people;

    public NameList() {
        people = new ArrayList<>();
    }

    private void printPeopleWithIndex() {
        for (int i = 0; i < people.size(); i++) {
            System.out.println((i + 1) + ") " + people.get(i).getName()+ " : " + " age " + people.get(i).getAge());
        }
    }

    private int indexChoise() {
        Scanner input = new Scanner(System.in);
        int index = input.nextInt() - 1;
        return index;
    }
    public void createPerson() {
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Chose a name for your person: ");
        person.setName(input.nextLine());

        System.out.print("Set an age for your person: ");
        person.setAge(input.nextInt());

        people.add(person);

    }

    public void printPeople() {

        System.out.println("People in list");

        for (Person person : people) {
            System.out.println(person.getName() + " : " + " age " + person.getAge());
        }

    }

    public Person updatePerson() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ange index på personen du vill ändra: ");
        printPeopleWithIndex();

        Person person = people.get(indexChoise());
        System.out.print("Ge personen ett nytt namn: ");
        person.setName(input.nextLine());

        System.out.print("Ge personen en ny ålder: ");
        person.setAge(input.nextInt());

        return person;
    }

    public void deletePerson() {
        System.out.print("Ange index på personen du vill ta bort: \n");
        printPeopleWithIndex();

        Person person = people.get(indexChoise());
        people.remove(person);
    }
}
