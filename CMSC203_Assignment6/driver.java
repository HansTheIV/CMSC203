public class driver {
    public static void main(String[] args)
    {
        BevShop b = new BevShop();
        b.startNewOrder(12, DAY.THURSDAY, "john", 24);
        b.processCoffeeOrder("americano", SIZE.SMALL, true, false);//2.5
        System.out.println(b.getCurrentOrder().calcOrderTotal());
        b.processCoffeeOrder("Cappuccino", SIZE.LARGE, false, false);//4.0
        System.out.println(b.getCurrentOrder().calcOrderTotal());
        b.processCoffeeOrder("Latte", SIZE.LARGE,true, true);//5.0
        System.out.println(b.getCurrentOrder().calcOrderTotal());

        b.processSmoothieOrder("Detox", SIZE.SMALL, 1, false);//2.5
        System.out.println(b.getCurrentOrder().calcOrderTotal());
        b.processAlcoholOrder("Mohito", SIZE.SMALL); //2.0 ****------------------------------------
        System.out.println(b.getCurrentOrder().calcOrderTotal());

        b.processSmoothieOrder("Detox", SIZE.MEDIUM, 4, true); //5.5
        System.out.println(b.getCurrentOrder().calcOrderTotal());
        b.processCoffeeOrder("Latte", SIZE.SMALL,false, false); //2
        System.out.println(b.getCurrentOrder().calcOrderTotal());
    }
}
