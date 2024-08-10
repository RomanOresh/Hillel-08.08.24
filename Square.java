public class Square implements GeometricFigure{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public double countFigureArea(){
        return a * a;
    }
}
