public class GuerreroHumano extends Guerrero {

    public GuerreroHumano(String nombre) {
        super(nombre, "Humano", 12, 20);
        this.arma = "Espada";
    }

    public void atacar(Personaje oponente) {

        double dano;

        if(oponente instanceof Mago) {
            dano = fuerza * 0.60;
        }
        else if(oponente instanceof GuerreroElfo) {
            dano = fuerza * 0.40;
        }
        else {
            dano = fuerza * 0.30;
        }

        oponente.vitalidad -= dano;

        System.out.println(oponente.nombre +
                " ha recibido " + dano + " puntos de daño");
        oponente.mostrarVitalidad();
        System.out.println("--------------------------------------------");
    }
}
