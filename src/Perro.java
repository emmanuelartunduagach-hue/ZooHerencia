
public class Perro extends Animal {
    private static Collar collar;

    public Perro(String nombre, Collar collar) {
        super(nombre);
        this.collar = collar;
    }

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void sonido() {
        System.out.println("WOF WOF");
    }

    public void ladrar() {
        System.out.println(nombre + " Hace WOF WOUF");
    }

    public Collar getCollar() {
        return collar;
    }
}


