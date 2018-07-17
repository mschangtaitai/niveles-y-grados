import java.util.Vector;

public class Colegio {
    private String name ;
    private Vector<Nivel> niveles ;

    public Colegio(String name) {
        this.name = name;
        this.niveles = new Vector<Nivel>();
    }
    public void addNivel(Nivel Nivel){
        niveles.add(Nivel);
    }
    public Vector<Nivel> getNiveles(){
        return this.niveles;
    }
}
