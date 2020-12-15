import java.text.DecimalFormat;

public class Function1 extends Function {

    @Override
    public String answerString(double optVal, double x, double y, double z) {
        String Y = new DecimalFormat("#.##").format(y);
        String X = new DecimalFormat("#.##").format(x);
        String opt = new DecimalFormat("#.##").format(optVal);
        return "Minimum cost is $" + Y + " with height = " + X + " and radius " + opt ;
    }

    @Override
    public double fnValue (double x) {
        if (x == 0.0)
            return Double.MAX_VALUE;
        else
            return ((((0.8) * Math.PI) * (x*x)) + (800/x));
    }

    @Override
    public double getXVal(double x) {
        return x;
    }

    @Override
    public double getYVal(double x) {
        return fnValue(x);
    }

    @Override
    public double getZVal(double x) {
        return -1.0;
    }

    @Override
    public String toString()
    {
        return "Minimize the cost of a can holding 2 liters of liquid.";
    }

}