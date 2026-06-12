public class MagoHumano extends Mago {

    public MagoHumano(String nombre) {
        super(nombre, "Humano", "Rayo", 8, 25);
    }

    @Override
    public void atacar(Personaje oponente) {

        double dano;

        if(oponente instanceof MagoHumano) {
            dano = fuerza * 0.60;
        }
        else if(oponente instanceof MagoElfo) {
            dano = fuerza * 0.50;
        }
        else {
            dano = fuerza * 0.80;
        }

        oponente.vitalidad -= dano;

        System.out.println(oponente.nombre +
                " ha recibido " + dano + " puntos de daño");
        oponente.mostrarVitalidad();
        System.out.println("--------------------------------------------");
    }
}
