package lesson5.instanceoff;

public class Movie extends Media {
    private String director;
    public Movie(String title, String director) {
        super(title);
        this.director = director;
    }
    public String getDirector() {
        return director;
    }
}