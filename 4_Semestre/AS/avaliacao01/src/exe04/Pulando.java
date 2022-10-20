package exe04;

public class Pulando implements EstadoPlayer {
    
    public Pulando() {
        System.out.println("Estou pulando");
    }  

    @Override
    public EstadoPlayer pular() {
        System.out.println("Já estou pulando");
        return this;
    }

    @Override
    public EstadoPlayer correr() {
        return new Correndo();
    }

    @Override
    public EstadoPlayer esperar() {
        return new Esperando();
    }

    @Override
    public EstadoPlayer abaixar() {
        return new Abaixando();
    }
}
