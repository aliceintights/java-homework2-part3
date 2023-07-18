public class BmiService {
    public int calculate(int BMIresult) {
        int weightKg = 55;
        System.out.println(weightKg);
        int heightMeter = 168;
        System.out.println(heightMeter);
        double d = (double) heightMeter / 100;
        double x = (double) d * (double) d;
        int BMI = 1;
        int BmiResult;
        int result = (int) BMI;
        result = (int) (weightKg / (double) x);
        return result;
    }
}
