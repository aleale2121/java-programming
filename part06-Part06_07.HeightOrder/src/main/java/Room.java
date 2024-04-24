
import java.util.ArrayList;
import static java.lang.Integer.MAX_VALUE;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alefew
 */
public class Room {

    private ArrayList<Person> people = new ArrayList<>();

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (people.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }

        Person shortestPerson = new Person("", MAX_VALUE);
        for (Person person : people) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }

        }
        return shortestPerson;
    }

    public Person take() {
        if (people.isEmpty()) {
            return null;
        }

        Person shortestPerson = new Person("", MAX_VALUE);
        for (Person person : people) {
            if (person.getHeight() < shortestPerson.getHeight()) {
                shortestPerson = person;
            }

        }
        people.remove(shortestPerson);
        return shortestPerson;
    }
}
