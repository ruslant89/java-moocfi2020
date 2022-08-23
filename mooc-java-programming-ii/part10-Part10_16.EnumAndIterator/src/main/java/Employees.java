import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private ArrayList<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        this.people.addAll(peopleToAdd);
    }

    public void print() {
        Iterator<Person> personIterator = people.iterator();

        while (personIterator.hasNext()) {
            System.out.println(personIterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> personIterator = people.iterator();

        while (personIterator.hasNext()) {
            Person person = personIterator.next();
            if (person.getEducation() == education) {
                System.out.println(person);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> personIterator = people.iterator();

        while (personIterator.hasNext()) {
            if (personIterator.next().getEducation() == education) {
                personIterator.remove();
            }
        }
    }
}
