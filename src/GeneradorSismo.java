public class Sismos {

    private String Region;
    private String Epicentro;
    private float Magnitud;

    public Sismos(String Region, String Epicentro, float Magnitud) {

        this.Region = Region;
        this.Epicentro = Epicentro;
        this.Magnitud = Magnitud;

    }

    public String getRegion() {
        return Region;
    }
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getEpicentro() {
        return Epicentro;
    }

    public void setEpicentro(String Epicentro) {
        this.Epicentro = Epicentro;
    }

    public float getMagnitud() {
        return Magnitud;
    }

    public void setMagnitud(float magnitud) {
        Magnitud = magnitud;
    }

}
