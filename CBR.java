public class CBR extends RacingBike {
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

