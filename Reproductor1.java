package EjercicioInterfaz;

public class Reproductor1 implements ReproductorMusica{


    public String nombre;
    public boolean play=false;
    public boolean stop=true;
    public boolean pausa=false;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void reproducirMusica() {
        if(play==true){
            System.out.println("La musica ya está siendo reproducida");
        }else{
            System.out.println("La musica está siendo reproducida desde el reproductor "+nombre);
            play=true;
            stop=false;
            pausa=false;
        }
    }

    @Override
    public void pausarMusica() {
        if(pausa==true){
            System.out.println("La musica está pausada actualmente");
        }else{
            System.out.println("La musica está siendo pausada desde el reproductor "+nombre);
            pausa=true;
            play=false;
            stop=false;
        }

    }

    @Override
    public void detenerMusica() {
        if(stop==true){
            System.out.println("La musica está detenida actualmente");
        }else{
            System.out.println("La musica está siendo detenida desde el reproductor "+nombre);
            stop=true;
            play=false;
            pausa=false;
        }

    }

}
