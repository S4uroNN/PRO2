package personopgave;

public class Person<T extends Comparable<T>> implements Comparable<Person<T>> {

    private T navn;

    public Person(T navn) {
        this.navn = navn;
    }

    public T getNavn() {
        return this.navn;
    }

    public void setNavn(T navn) {
        this.navn = navn;
    }

    public String toString() {
        return navn.toString();
    }

    @Override
    public int compareTo(Person<T> o) {
        return this.navn.compareTo(o.navn);
    }
}
