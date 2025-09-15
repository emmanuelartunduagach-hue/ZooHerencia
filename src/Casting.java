public class Casting {
    public static void main(String[] args) {
        Animal a = new Perro("Rocky");

        if (a instanceof Perro) {
            Perro p = (Perro) a;
            p.ladrar();
        }
    }
}
