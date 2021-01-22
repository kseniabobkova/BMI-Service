public class BMIService {
    public double calculate(double waightKg, double growthM) {
        double index = waightKg / (growthM * growthM) * 100;
        long index2 = Math.round(index);
        double indexFin = (double) index2 / 100;
        return indexFin;

    }
}