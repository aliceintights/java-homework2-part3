public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        int BMI = service.calculate(55,168);
        System.out.println("BMI " + BMI);
    }
}