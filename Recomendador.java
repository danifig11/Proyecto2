public class Recomendador {
    private BaseDeDatos bd;

    public Recomendador(BaseDeDatos bd) {
        this.bd = bd;
    }

    public void recomendarCarreras(Usuario usuario) {
        System.out.println("Recomendando carreras para: " + usuario.getNombre());
        bd.buscarCarrerasRelacionadas(usuario.getIntereses());
    }
}
