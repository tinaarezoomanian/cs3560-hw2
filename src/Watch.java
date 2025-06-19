public class Watch {
    private int rating;
    private Person person;
    private Movie movie;

    public Watch(Person p, Movie m, int r) {
        rating = r;
        person = p;
        movie  = m;
        p.addWatch(this);
        m.addWatch(this);
    }

    public Person getPerson() {
        return person;
    }
    public Movie getMovie() {
        return movie;
    }
}
