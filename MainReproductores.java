package EjercicioInterfaz;

public class MainReproductores {
    public static void main(String[] args) {
        Reproductor1 r1 = new Reproductor1();
        Reproductor2 r2 = new Reproductor2();

        r1.setNombre("Spotify");
        r1.detenerMusica();
        r1.reproducirMusica();
        r1.pausarMusica();
        r1.detenerMusica();
        r2.setNombre("Apple Music");
        r2.reproducirMusica();
        r2.pausarMusica();
        r2.detenerMusica();
    }
}
