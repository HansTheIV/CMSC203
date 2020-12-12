import java.util.ArrayList;

public class BevShop implements BevShopInterfce{


    private ArrayList<Order> orderList= new ArrayList<>();
    private int currentOrderIndex;
    @Override
    public boolean validTime(int time) {
        return ((time <= 23) && (time >= 8));
    }

    @Override
    public boolean eligibleForMore() {
        return getCurrentOrder().getAlcoholicDrinksInOrder() < MAX_ORDER_FOR_ALCOHOL;
    }

    @Override
    public boolean validAge(int age) {
        return age > MIN_AGE_FOR_ALCOHOL;
    }

    @Override
    public void startNewOrder(int time, DAY day, String customerName, int customerAge) {
        orderList.add(new Order(time, day, customerName, customerAge));



    }

    @Override
    public void processCoffeeOrder(String bevName, SIZE size, boolean extraShot, boolean extraSyrup) {
        orderList.get(orderList.size()-1).addNewBeverage(bevName, size, extraShot, extraSyrup);

    }

    @Override
    public void processAlcoholOrder(String bevName, SIZE size) {
        orderList.get(orderList.size()-1).addNewBeverage(bevName, size);
    }

    @Override
    public void processSmoothieOrder(String bevName, SIZE size, int numOfFruits, boolean addProtien) {

        orderList.get(orderList.size()-1).addNewBeverage(bevName, size, numOfFruits, addProtien);
    }

    @Override
    public int findOrder(int orderNo) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNo() == orderNo) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public double totalOrderPrice(int orderNo) {
        Order o = orderList.get(findOrder(orderNo));
        return o.calcOrderTotal();
    }

    @Override
    public double totalMonthlySale() {
        double total = 0.0;
        for(Order o : orderList)
        {
            total += o.calcOrderTotal();
        }
        return total;
    }

    @Override
    public void sortOrders() {
        int minimum = 90001;
        for(Order o : orderList)
        {
            if(o.getOrderNo() < minimum)
            {
                minimum = o.getOrderNo();
                int index = orderList.indexOf(o);
                Order temp = orderList.get(0);
                orderList.set(index, temp);
                orderList.set(0, o);

            }
        }

    }

    @Override
    public Order getOrderAtIndex(int index) {
        return orderList.get(index);
    }

    public Order getCurrentOrder() {
        return orderList.get(orderList.size()-1);
    }

    public int totalNumOfMonthlyOrders() {
        return orderList.size();
    }

    public int getNumOfAlcoholDrink() {
        int total = 0;
        for(Order o : orderList)
        {
            total += o.getAlcoholicDrinksInOrder();
        }
        return total;
    }

    public boolean isMaxFruit(int i) {
        return i > MAX_FRUIT;
    }

    public String toString()
    {
    StringBuilder temp = new StringBuilder("");
        for(Order o : orderList)
        {

            temp.append(o.toString()).append("\n");
        }
        return "Bevshop containing: " + temp + "\n\nSold: " + totalMonthlySale();
    }

    public int getMaxOrderForAlcohol() {
        return MAX_ORDER_FOR_ALCOHOL;
    }

    public int getMinAgeForAlcohol() {
        return MIN_AGE_FOR_ALCOHOL;
    }
}
