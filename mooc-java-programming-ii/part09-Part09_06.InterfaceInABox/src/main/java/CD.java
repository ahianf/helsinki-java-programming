public class CD implements Packable {

    private final String artist;
    private final String name;
    private final int year;
    private final double weight;

    public CD(String artist, String name, int year) {
        this.artist = artist;
        this.name = name;
        this.year = year;
        weight = 0.1;
    }

    @Override
    public String toString() {
        return artist + ": " + name + " (" + year + ")";
    }

    @Override
    public double weight() {
        return weight;
    }
}
