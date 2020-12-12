public class Smoothie extends Beverage{
    private final int BASE_FRUITS = 2;
    private String name;
    private SIZE size;
    private boolean protein;
    private int numOfFruits;
    private int numOfExtraFruits;

    private final double costOfExtraFruit = 0.50;
    private final double costOfProtein = 1.50;
    public Smoothie(String name, SIZE size, double price) {
        super(TYPE.SMOOTHIE, name, size);
    }

    public Smoothie(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
        super(TYPE.SMOOTHIE, bevName, size);
        this.protein = addProtein;
        this.numOfFruits = numOfFruits;
        this.size = size;
        this.name = bevName;
    }

    @Override
    public double calcPrice() {

        double base = getBasePrice();
        if(size == SIZE.MEDIUM)
        {
            base+= getSizeUpPrice();
        }
        if(size == SIZE.LARGE)
        {
            base += ( 2 * (getSizeUpPrice()));
        }
        if(protein)
        {
            base += 1.50;
        }
        if (numOfFruits > 0)
        {
            base += (0.5 * numOfFruits);
        }

        return base;
    }


    @Override
    public String getBevName() {
        return name;
    }

    public int getNumOfFruits()
    {
        return numOfFruits;
    }
    @Override
    public String toString()
    {
        return  getSize() + " smoothie drink - " + super.getName() + " - costs $" + String.valueOf(calcPrice());
    }

    public boolean getAddProtien() {
        return protein;
    }
}
