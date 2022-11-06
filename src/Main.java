public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float bmi = service.index(105, 197);
        System.out.println(bmi);
    }
}