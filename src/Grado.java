import java.util.Vector;

public class Grado {
    private String name;
    private Vector<Estudiante> studs;

    //Constantes
    public static final int max_studs = 30;

    public Grado(String name){
        this.name = name;
        this.studs = new Vector<Estudiante>();
    }

    public String getName(){
        return this.name;
    }
    public Vector<Estudiante> getStuds(){
        return this.studs;
    }
    public void addStud(Estudiante estudiante) {
        studs.add(estudiante);
    }
}
