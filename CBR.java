// class named after the Honda CBR 1000rr with specs mirror'd off of the motorcycle

public class CBR extends RacingBike {

    // extended RacingBike parent class to inherit the methods
    //unique information to this sports bike are noted below

    public static void main(String[] args) {
        CBR cbr = new CBR();
        cbr.setManufacturer("Honda");
        cbr.setModel("CBR 1000rr");

        System.out.println("**** " + cbr.getManufacturer() + " " + cbr.getModel() + " ****");
        cbr.engine_size((int) 998.8);
        cbr.dry_weight((int) 390);
        cbr.price((int) 21200);
    }
}

