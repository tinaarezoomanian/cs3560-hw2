import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Watch> watches;

    public Person() {
        name    = "";
        watches = new ArrayList<>();
    }

    public void addWatch(Watch w) {
        watches.add(w);
    }

    public Movie[] getMovies() {
        Movie[] result = new Movie[watches.size()];
        for (int i = 0; i < watches.size(); i++) {
            result[i] = watches.get(i).getMovie();
        }
        return result;
    }
}
