package hu.petrik;

public class Main {

    public static void main(String[] args) {
        // write your code here
        RealEstates realestates = new RealEstates("realestatetransactions.csv");
        System.out.println("Real estate count: " + realestates.getSalesCount());
        System.out.println("Largest real estate: " + realestates.getMax().toString());
    }
}
