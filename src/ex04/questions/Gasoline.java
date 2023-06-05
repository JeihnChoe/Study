package ex04.questions;

class Efficiency {
    double efficiency(double gasoline, double distance) {
        double efficiency = distance / gasoline;
        return efficiency;
    }
}

public class Gasoline {
    public static void main(String[] args) {
        Efficiency eff = new Efficiency();
        double answer = eff.efficiency(8.86, 182.736);

        System.out.printf("%.2f", answer);
    }
}