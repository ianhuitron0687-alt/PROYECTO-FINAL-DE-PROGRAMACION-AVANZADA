public class MagoElfo extends Mago {

    public MagoElfo(String nombre) {
        super(nombre, "Elfo", "Bola de fuego", 6, 30);
    }

    @Override
    public void atacar(Personaje oponente) {

        double dano;

        if(oponente instanceof MagoHumano) {
            dano = fuerza * 0.70;
        }
        else if(oponente instanceof MagoElfo) {
            dano = fuerza * 0.60;
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
