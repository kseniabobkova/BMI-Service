public class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();

        String indexObesity = service.calculate(94.3, 1.70);
        System.out.println(indexObesity);

        String indexNormal = service.calculate(60.1, 1.72);
        System.out.println(indexNormal);
    }
}
