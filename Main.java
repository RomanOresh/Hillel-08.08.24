public class Main {
    public static void main(String[] args) {
        GeometricFigure[] mass = {new Round(3),new Triangle(5,3), new Square(3)};


        double res = 0;
        for(GeometricFigure i: mass){
            res += i.countFigureArea();
        }
        System.out.printf("%.2f", res);
    }


}
