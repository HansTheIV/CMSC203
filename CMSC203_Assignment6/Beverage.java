public abstract class Beverage implements Comparable{
    private TYPE type;
    private String name;
    private SIZE size;
    private double price;
    private final double basePrice = 2.0;
    private static final double sizeUpPrice = 1.0;
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public TYPE getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public SIZE getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public Beverage(TYPE type, String name, SIZE size) {
        this.type = type;
        this.name = name;
        this.size = size;
    }
    public abstract  double calcPrice();
    @Override
    public String toString()
    {
        return (this.size + " " + this.type + " beverage: " + this.name + ". Costs $" + String.valueOf(price));
    }
    @Override
    public boolean equals(Object b)
    {
        if(this == b) return true;
        if(b == null) return false;
        Beverage bev = (Beverage) b;
        if((bev.type == this.type) && (bev.size == this.size) && (bev.name == this.name))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double getBasePrice()
    {
        return basePrice;
    };
    public double getSizeUpPrice()
    {
        return  sizeUpPrice;
    }

    public abstract String getBevName();

}
