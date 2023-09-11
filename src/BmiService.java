public class BmiService {
    public int calculate(int weightKg, int heightMeter) {
        double d = (double) heightMeter / 100;
        double x = (double) d * (double) d;
        int result = (int) (weightKg / (double) x);
        return result;
    }
}
