public class BMIService {
    public double calculate(double waightKg, double growthM) {
        double index = waightKg / (growthM * growthM);
        long indexRound = Math.round(index);
        return indexRound;

    }
}