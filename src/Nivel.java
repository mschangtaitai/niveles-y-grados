import java.util.Vector;

public class Nivel {
    private String name ;
    private Vector<Grado> grades ;

    public Nivel(String name){
        this.name = name;
        this.grades = new Vector<Grado>();
    }
    public String getName(){
        return this.name;
    }
    public Vector<Grado> getGrades(){
        return this.grades;
    }
    public void addGrado(Grado grado){
        grades.add(grado);
    }
}
