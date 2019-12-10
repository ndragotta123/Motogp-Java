public class Hon extends RacingBike {
    public static void main(String[] args) {
        Hon hon = new Hon();
        hon.setManufacturer("Honda");
        hon.setModel("RC213V");

        System.out.println("**** " + hon.getManufacturer() + " " + hon.getModel() + " ****");
        hon.engine_size( 1000);
        hon.dry_weight((int) 346.12);
        hon.speed(220);
        hon.price((int) 2000000);
    }
}
