
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisAptPrice = this.squares * this.princePerSquare;
        int comparedAptPrice = compared.squares * compared.princePerSquare;

        if (thisAptPrice > comparedAptPrice) {
            return thisAptPrice - comparedAptPrice;
        } else {
            return comparedAptPrice - thisAptPrice;
        }
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisAptPrice = this.squares * this.princePerSquare;
        int comparedAptPrice = compared.squares * compared.princePerSquare;

        if (thisAptPrice > comparedAptPrice) {
            return true;
        }

        return false;
    }
}
