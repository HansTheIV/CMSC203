import java.text.DecimalFormat;

public class Function2 extends Function {

    @Override
    public String answerString(double optVal, double x, double y, double z) {
        String Y = new DecimalFormat("#.##").format(y);
        String X = new DecimalFormat("#.##").format(x);
        String Z = new DecimalFormat("#.##").format(z);
        String opt = new DecimalFormat("#.##").format(optVal);
        return "The minimum distance alogn the beach is " + X + " which takes a time of " + Y + " to get to the ball." +
                " This leads to a total distance run of " + opt + " meters.";
    }

    @Override
    public double fnValue(double x) {
        return (x/3) + (2 * (Math.sqrt((Math.pow(x, 2) - (8*x) + 25))));
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

    public String toString() {
        return "a dog running along the beach, optimizing when it should leave the beach and run into the water.";
    }

}