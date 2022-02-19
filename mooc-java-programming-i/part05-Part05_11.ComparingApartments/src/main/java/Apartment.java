
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return squares > compared.getSquares();
    }

    public int priceDifference(Apartment compared) {
        return Math.abs((this.squares * this.pricePerSquare) - compared.getPrice());
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return ((squares * pricePerSquare) - compared.getPrice()) > 0;

    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrice() {
        return squares * pricePerSquare;
    }

}
