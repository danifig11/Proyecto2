public class Main {
    public static void main(String[] args) {
        // Lanzar la GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new InterfazGrafica().setVisible(true);
        });
    }
}