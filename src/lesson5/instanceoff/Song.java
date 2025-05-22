package lesson5.instanceoff;

class Song extends Media {
    private String artist;
    public Song(String title, String artist) {
        super(title);
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
}