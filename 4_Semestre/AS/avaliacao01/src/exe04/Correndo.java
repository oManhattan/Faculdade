 
package exe04;
 
public class Correndo implements EstadoPlayer{

    public Correndo() {
        System.out.println("Correndo");
    }
 
    @Override
    public EstadoPlayer esperar() {
      return new Esperando();  
    }

    @Override
    public EstadoPlayer correr() {
        System.out.println("Já está correndo"); 
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
