
interface Mensaje {
    void enviar(String destinatario, String contenido);
}


class MensajeroEmail implements Mensaje {
    @Override
    public void enviar(String destinatario, String contenido) {
        System.out.println("Enviando correo a " + destinatario + ": " + contenido);
    }
}


class MensajeroSMS implements Mensaje {
    @Override
    public void enviar(String destinatario, String contenido) {
        System.out.println("Enviando SMS a " + destinatario + ": " + contenido);
    }
}


class MensajeroPush implements Mensaje {
    @Override
    public void enviar(String destinatario, String contenido) {
        System.out.println("Enviando notificación push a " + destinatario + ": " + contenido);
    }
}


class SistemaEnvio {
    private Mensaje mensajero;

    public SistemaEnvio(Mensaje mensajero) {
        this.mensajero = mensajero;
    }

    public void enviarMensaje(String destinatario, String contenido) {
        mensajero.enviar(destinatario, contenido);
    }
}


public class SistemaEnvioDeMensajes {
    public static void main(String[] args) {
        SistemaEnvio sistemaEmail = new SistemaEnvio(new MensajeroEmail());
        sistemaEmail.enviarMensaje("usuario@example.com", "Hola, este es un correo!");

        SistemaEnvio sistemaSMS = new SistemaEnvio(new MensajeroSMS());
        sistemaSMS.enviarMensaje("1234567890", "Hola, este es un SMS!");

        SistemaEnvio sistemaPush = new SistemaEnvio(new MensajeroPush());
        sistemaPush.enviarMensaje("usuarioPush", "Hola, esta es una notificación push!");
    }
}