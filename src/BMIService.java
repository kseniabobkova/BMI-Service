public class BMIService {
    public String calculate(double waightKg, double growthM) {
        double index = waightKg / (growthM * growthM);
        String result = String.format("%.2f", index);
        return result;

    }
}