public class Alcohol extends Beverage{
    private SIZE size;
    private boolean offeredWeekend;
    private final double weekendCharge = 0.60;
    public Alcohol(String name, SIZE size, boolean b) {
        super(TYPE.ALCOHOL, name, size);
        this.size = size;
        offeredWeekend = b;
    }

    @Override
    public double calcPrice() {
        double base = getBasePrice();
        if (size == SIZE.MEDIUM) {
            base += getSizeUpPrice();
            System.out.println("med");
        }
        if (size == SIZE.LARGE) {
            base += (2 * (getSizeUpPrice()));
            System.out.println("large");
        }
        if (offeredWeekend) {
            base += weekendCharge;
        }

        return base;
    }
    @Override
    public String toString()
    {
        return  getSize() + " alcoholic drink - " + super.getName() + " - costs $" + String.valueOf(calcPrice());
    }

    @Override
    public boolean equals(Object b) {
        boolean s = super.equals(b);
        Alcohol al  = (Alcohol) b;
        return (s && (this.offeredWeekend == (al.offeredWeekend)));
    }


    @Override
    public String getBevName() {
        return getName();
    }

}
