package sem6.z3;

public class Cube implements Shape{
    private int edge;
    private double cubeVol;

    public Cube(int edge, double cubeVol) {
        this.edge = edge;
        this.cubeVol = cubeVol;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    public double calculateCubeVolume(int edge){
        cubeVol = edge * edge * edge;
        return cubeVol;
    }   

}
