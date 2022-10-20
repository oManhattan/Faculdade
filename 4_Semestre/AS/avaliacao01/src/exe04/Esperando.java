package exe04;

public class Esperando implements EstadoPlayer {
    
    public Esperando() {
        System.out.println("Esperando");
    }

    @Override
    public EstadoPlayer correr() {
        return new Correndo();
    }

    @Override
    public EstadoPlayer esperar() {
        System.out.println("Já estou esperando.");
        return this;
    }

    @Override
    public EstadoPlayer abaixar() {
        return new Abaixando();
    }

    @Override
    public EstadoPlayer pular() {
        return new Pulando();
    }
}
