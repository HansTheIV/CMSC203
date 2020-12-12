public class Coffee extends Beverage {
    private SIZE size;
    private final double shotCost = 0.5;
    private final double syrupCost = 0.5;
    private boolean extraShot,
            extraSyrup;
    private double price;


    public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
        super(TYPE.COFFEE, name, size);
        this.size = size;
        this.extraShot = extraShot;
        this.extraSyrup = extraSyrup;

    }

    @Override
    public double calcPrice() {

        double base = getBasePrice();
        if (size == SIZE.MEDIUM) {
            base += getSizeUpPrice();
        }
        if (size == SIZE.LARGE) {
            base += (2 * (getSizeUpPrice()));
        }
        if (extraSyrup) {
            base += syrupCost;
        }
        if (extraShot) {
            base += shotCost;
        }
        return base;
    }
        @Override
        public String getBevName () {
            return super.getName();
        }

        @Override
        public String toString ()
        {
            return getSize() + " Coffee drink - " + super.getName() + " - costs $" + String.valueOf(calcPrice());
        }

    public boolean getExtraShot() {
        return extraShot;
    }

    public boolean getExtraSyrup() {
        return extraSyrup;
    }
}

