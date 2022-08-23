public class CD implements Packable {

    private String artist;
    private String cdName;
    private int publicationYear;
    private double cdWeight;

    public CD(String artist, String cdName, int publicationYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        this.cdWeight = 0.1;
    }

    @Override
    public double weight() {
        return this.cdWeight;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.publicationYear + ")";
    }
}
