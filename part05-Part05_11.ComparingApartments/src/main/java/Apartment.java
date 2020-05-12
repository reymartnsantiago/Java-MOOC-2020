
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

        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
       int diff=(this.squares*this.princePerSquare) - (compared.squares*compared.princePerSquare);
        return diff<0?diff*-1:diff;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.princePerSquare>compared.princePerSquare){
            return true;
        }
        return false;
    }

}
