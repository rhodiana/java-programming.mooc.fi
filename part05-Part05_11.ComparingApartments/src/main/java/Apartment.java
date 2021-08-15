
import static java.lang.Math.abs;


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.getSquares()) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        return abs(this.getSquares()*this.getPricePerSquare() - compared.getSquares()*compared.getPricePerSquare());
    }  
    
    public boolean moreExpensiveThan(Apartment compared) {
        if(this.getSquares()*this.getPricePerSquare() - compared.getSquares()*compared.getPricePerSquare() > 0) {
            return true;
        }
        return false;
    }

}
