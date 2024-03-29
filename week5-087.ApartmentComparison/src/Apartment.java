
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment){
        if (this.squareMeters > otherApartment.squareMeters){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment){
        int thisApp = (this.squareMeters * this.pricePerSquareMeter);
        int otherApp = (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        int priceDiff = thisApp - otherApp;
        return Math.abs(priceDiff);
    }
    
    public boolean moreExpensiveThan(Apartment otherApartment){
        int thisApp = (this.squareMeters * this.pricePerSquareMeter);
        int otherApp = (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
        if (thisApp > otherApp){
            return true;
        } else{
            return false;
        }
    }
    
}
