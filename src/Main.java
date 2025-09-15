//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Veterinaria vet = new Veterinaria();
        Perro perro = new Perro("Muñeca", new Collar("rojo"));
        Gato gato = new Gato("Paca");
        vet.atender(perro);
        vet.atender(gato);
        Animal a = new Perro("Rocky", new Collar("azul"));
        if (a instanceof Perro) {
            Perro p = (Perro) a;
            p.ladrar();
        }
        Caja<Animal> caja = new Caja<>();
        caja.set(gato);
        Animal guardado = caja.get();
        vet.atender(guardado);
    }

}
// en definitiva creo que el run del main quedo mal a como creo que deberia quedar
