public class Main {

    public static void main(String[] args) {

        GuerreroElfo kiyoelfo =
                new GuerreroElfo("Kiyoelfo");

        MagoElfo mithrandir =
                new MagoElfo("Mithrandir");

        kiyoelfo.mostrarPersonaje();
        mithrandir.mostrarPersonaje();

        while(kiyoelfo.vitalidad > 0 &&
              mithrandir.vitalidad > 0) {

            kiyoelfo.atacar(mithrandir);

            if(mithrandir.vitalidad <= 0) {
                break;
            }

            mithrandir.atacar(kiyoelfo);

            kiyoelfo.verificarOponentes(mithrandir);
        }

        kiyoelfo.verificarOponentes(mithrandir);
    }
}
