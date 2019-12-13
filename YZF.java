// class named after the Yamaha YZF R1 with specs mirror'd off of the motorcycle

public class YZF extends RacingBike {

    //extended the RacingBike Parent class to inherit the methods
    //unique information to this sports bike are noted below

    public static void main(String[] args) {
        YZF yzf = new YZF();
        yzf.setManufacturer("Yamaha");
        yzf.setModel("YZF R1");

        System.out.println("**** " + yzf.getManufacturer() + " " + yzf.getModel() + " ****");
        //System.out.println(duc.getModel());
        yzf.engine_size(998);
        yzf.dry_weight((int) 414);
        yzf.speed(182);
        yzf.price((int) 17399);
    }
}

