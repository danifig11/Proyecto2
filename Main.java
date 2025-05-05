public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Daniel", "U001", "Tecnología, lógica", "Matemática, Física");
        Recomendador r = new Recomendador();
        r.recomendarCarreras(u1);
    }
}