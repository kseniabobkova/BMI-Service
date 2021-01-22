public class BMIService {
    public double calculate(double waightKg, double growthM) {
        double index = waightKg / (growthM * growthM) * 100;
        long it = Math.round(index);
        double indexFin = (double) it / 100;
        return indexFin;

    }
}