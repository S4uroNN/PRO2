package opgave3;

import java.util.HashSet;
import java.util.Set;

public class PersonAdmin {
    private final Set personSet = new HashSet();
    private static PersonAdmin uniqueInstance;

    private PersonAdmin() {

    }

    public static PersonAdmin getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new PersonAdmin();
        }
        return uniqueInstance;
    }

    public void add(Person person){
        personSet.add(person);
    }
    public Set getPersonSet(){
        return new HashSet(personSet);
    }
    public void remove(Person person){
        personSet.remove(person);
    }
}
