package two;

public class DemeritPointCalculator {

    private static int SPEED_LIMIT = 65;
    private static int KM_PER_DEMERIT_POINT = 5;

    public int calculateDemeritPoints(int speed) {
        if (speed <= SPEED_LIMIT) {
            return 0;
        }
        return (speed - SPEED_LIMIT) / KM_PER_DEMERIT_POINT;
    }

//    private int speedLimit;
//    private double speedOfDriver;
//    private int demeritPoints;
//    private int distanceInKm;
//
//    public DemeritPointCalculator(int speedLimit, double speedOfDriver, int distanceInKm) {
//        this.speedLimit = speedLimit;
//        this.speedOfDriver = speedOfDriver;
//        this.distanceInKm = distanceInKm;
//    }
//
//    public int calculateDemeritPoints() {
//        if (speedOfDriver <= speedLimit) {
//            demeritPoints = 0;
//        } else {
//            demeritPoints = distanceInKm / 5;
//        }
//        return demeritPoints;
//    }
//
//    public static void main(String[] args) {
//        DemeritPointCalculator demeritPointCalculator = new DemeritPointCalculator(65, 70, 98);
//        int i = demeritPointCalculator.calculateDemeritPoints();
//        System.out.println(i);
//    }

}
