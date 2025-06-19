import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private String genre;
    private List<Watch> watches;

    public Movie() {
        name    = "";
        genre   = "";
        watches = new ArrayList<>();
    }

    public void addWatch(Watch w) {
        watches.add(w);
    }

    public Person[] getPersons() {
        Person[] result = new Person[watches.size()];
        for (int i = 0; i < watches.size(); i++) {
            result[i] = watches.get(i).getPerson();
        }
        return result;
    }
}
