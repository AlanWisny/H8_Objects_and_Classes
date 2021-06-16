
// P8.4 Implement a class Address.

public class Address {
    private int houseNr;
    private int optNr;
    private String street;
    private String city;
    private String state;
    private int postalCode;

    public Address(int houseNr, int optNr, String street, String city, String state, int postalCode) {
        this.houseNr = houseNr;
        this.optNr = optNr;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

//    public Address(int optNr, String street, String city, String state, int postalCode) {
//        this.optNr = optNr;
//        this.street = street;
//        this.city = city;
//        this.state = state;
//        this.postalCode = postalCode;
//    }

    public void print() {
        System.out.println(street +" "+ houseNr);
        System.out.println(city +" "+ state +" "+ postalCode);
    }

    public boolean comesBefore(Address other) {
        if(other.postalCode > postalCode) {
            System.out.println(postalCode);
        } else{
            System.out.println(other.postalCode);
        }
        return true;
    }



}
