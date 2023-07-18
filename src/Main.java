public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int BmiResult = 1;
        int BMI = service.calculate(BmiResult);
        System.out.println("BMI " + BMI);
    }
}