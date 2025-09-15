
public class Veterinaria {
    private Consultorio consultorio;

    public Veterinaria() {
        // Constructor vacío
    }

    public Veterinaria(Consultorio consultorio) {
        this.consultorio = consultorio;
    }

    public void atender(Animal a) {
        a.sonido();
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }
}


