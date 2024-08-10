public class Round implements GeometricFigure{
    private int radius;

    public Round(int radius) {
        this.radius = radius;
    }

    public double countFigureArea(){
        return Math.PI * radius * radius ;
    }

}
