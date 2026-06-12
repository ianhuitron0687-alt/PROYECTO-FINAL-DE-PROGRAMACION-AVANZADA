public class GuerreroElfo extends Guerrero {

    public GuerreroElfo(String nombre) {
        super(nombre, "Elfo", 8, 30);
        this.arma = "Ballesta";
    }

    public void atacar(Personaje oponente) {

        double dano;

        if(oponente instanceof GuerreroHumano) {
            dano = fuerza * 0.60;
        }
        else if(oponente instanceof Mago) {
            dano = fuerza * 0.50;
        }
        else {
            dano = fuerza * 0.40;
        }

        oponente.vitalidad -= dano;

        System.out.println(oponente.nombre +
                " ha recibido " + dano + " puntos de daño");
        oponente.mostrarVitalidad();
        System.out.println("--------------------------------------------");
    }
}
