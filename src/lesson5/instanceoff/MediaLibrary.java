package lesson5.instanceoff;

public class MediaLibrary {
    public void displayMediaDetails(Media[] mediaList) {
        for (Media media : mediaList) {
            if (media instanceof Movie movie) {
                System.out.println(STR."Movie: \{movie.getTitle()}, Directed by: \{movie.getDirector()}");
            } else if (media instanceof Song song) {
                System.out.println(STR."Song: \{song.getTitle()}, Performed by: \{song.getArtist()}");
            }
        }
    }
    public static void main(String[] args) {
        Media[] mediaList = {
                new Movie("Inception", "Christopher Nolan"),
                new Song("Someone Like You", "Adele"),
                new Movie("The Dark Knight", "Christopher Nolan")
        };
        MediaLibrary library = new MediaLibrary();
        library.displayMediaDetails(mediaList);
    }
}
