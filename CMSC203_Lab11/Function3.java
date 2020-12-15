import java.text.DecimalFormat;

public class Function3 extends Function {

    @Override
    public String answerString(double optVal, double x, double y, double z) {
        String Y = new DecimalFormat("#.##").format(y);
        String X = new DecimalFormat("#.##").format(x);
        String opt = new DecimalFormat("#.##").format(optVal);
        return "Minimum distance is " + Y + " at x = " + X;
    }

    @Override
    public double fnValue(double x) {
        return Math.sqrt((Math.pow(x, 4)) - (Math.pow(x, 2)) + (1));
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
        return 0;
    }

    public String toString () {
        return "The closest x value of a parabola to a given point";
    }

}