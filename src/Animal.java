public abstract class Animal {
        protected static String nombre;

        public Animal(String nombre) {
            this.nombre = nombre;
        }

        public void sonido() {
            System.out.println("El animal hace un sonido genérico.");

    }
}