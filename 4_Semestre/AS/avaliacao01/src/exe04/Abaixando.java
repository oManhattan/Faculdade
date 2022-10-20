package exe04;

public class Abaixando implements EstadoPlayer {
    
    public Abaixando() {
        System.out.println("Estou abaixando");
    }

    @Override
    public EstadoPlayer abaixar() {
        System.out.println("Já estou abaixado");
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
    public EstadoPlayer pular() {
        return new Pulando();
    }
}
