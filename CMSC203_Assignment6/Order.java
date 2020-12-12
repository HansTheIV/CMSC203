import java.util.ArrayList;

public class Order implements OrderInterface, Comparable{
    private int orderNumber = 0;
    private int alcoholicDrinksInOrder;
    private static int numOfOrders = 1;
    ArrayList<Beverage> orderList= new ArrayList<>();

    int orderTime;
    DAY orderDay;
    Customer customer;

    public int getAlcoholicDrinksInOrder() {
        int total = 0;
        for(Beverage o : orderList)
        {
            if((o.getType()) == TYPE.ALCOHOL)
            {
                total++;
            }
        }
        return total;
    }

    public int getOrderNumber() {
        return orderNumber;
    }


    public ArrayList<Beverage> getOrderList() {
        return orderList;
    }

    public int getOrderTime() {
        return orderTime;
    }

    public DAY getOrderDay() {
        return orderDay;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Order(int time, DAY day, String customerName, int customerAge) {
        this.orderTime = time;
        orderDay = day;
        customer = new Customer(customerName, customerAge);
        orderNumber = getRandomInt();
    }

    public int getOrderNo() {
        return orderNumber;
    }

    public void addNewBeverage(Beverage bev)
    {
        orderList.add(bev);
    }
    public static int getRandomInt()
    {
        return (int)(Math.random() * ((80000) + 1)) + 10000;
    }
    @Override
    public String toString()
    {
        String temp = "Order " + orderNumber +  " by " + getCustomer().toString() + ": " + orderList.toString();
        return temp;
    }

    @Override
    public boolean isWeekend() {
        if(orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Beverage getBeverage(int itemNo) {
        return orderList.get(itemNo);
    }

    @Override
    public void addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {

        Beverage tempBev = new Coffee(bevName, size, extraShot, extraSyrup);
        orderList.add(tempBev);

    }

    @Override
    public void addNewBeverage(String bevName, SIZE size) {
        Beverage tempBev = new Alcohol(bevName, size, true);
        orderList.add(tempBev);

    }

    @Override
    public void addNewBeverage(String bevName, SIZE size, int numOfFruits, boolean addProtein) {
        Smoothie tempBev = new Smoothie(bevName, size, numOfFruits, addProtein);
        orderList.add(tempBev);
    }

    @Override
    public double calcOrderTotal() {
        double totalPrice = 0.0;
        for(Beverage bev : orderList)
        {
            totalPrice += bev.calcPrice();
        }
        return totalPrice;
    }

    @Override
    public int findNumOfBeveType(TYPE type) {
        int total = 0;
        for(Beverage b : orderList)
        {
            if(b.getType() == type)
            {
                total++;
            }
        }
        return total;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getTotalItems() {
        return orderList.size();
    }

    public String getOrder_number() {
        return String.valueOf(orderNumber);
    }
}
