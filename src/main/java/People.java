import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Create a People class.
The class should instantiate a List field of Person objects named personList.
The class should define a method named add which adds a Person to the personList.
The class should define a method named findById which makes use of a long id parameter to return a Person object with the respective id field.
The class should define a named contains which makes use of a Person person parameter to return true if the personList contains the respective Person object.
The class should define a method named remove which makes use of a Person person parameter to remove a respective Person object.
The class should define a method named remove which makes use of a long id parameter to remove a Person object with the respective id field.
The class should define a named removeAll which clears our personList field.
The class should define a method named count which returns the size of personList.
The class should define a method named toArray which returns an array representation of the personList field.
The class should implement Iterable<E> and define a method named iterator which makes use of the personList field to generate a new a Iterator<E>.

 */

public class People <E extends Person> implements Iterable<E> {

    private List<E> personList = new ArrayList<E>();

    public List<E> getPersonList() {
        return personList;
    }

    public void setPersonList(List<E> personList) {
        this.personList = personList;
    }
// //   public List<E> getPersonList() {
//        return personList;
//    }
//
//    public void setPersonList(List<E> personList) {
//        this.personList = personList;
//    }

    public void add(E people) {
        personList.add(people);
    }


    public Person findPersonById(Long id) {
        for (Person i : personList) {
            Long x = i.getId();
            if (x.equals(id)) {
                return i;
            }
        }
        return null;
    }

    public boolean PersonListContainsPersonObject(E person) {
        return personList.contains(person);
    }

    public void RemovePersonObjecttoPersontoPersonList(E person) {
        personList.remove(person);

    }

    public void removeId(long id) {
        for (Person i : personList) {
            if (i.getId() == id) {
                personList.remove((E) i);
            }
        }
    }

    public void RemoveAll() {
        personList.clear();
    }

    public int ArraylistSize() {
        return personList.size();
    }


    public E[] toArray() {

        return (E[]) personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }

}

