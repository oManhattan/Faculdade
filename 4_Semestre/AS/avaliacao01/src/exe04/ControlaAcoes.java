
package exe04;

public class ControlaAcoes {
    private EstadoPlayer estado;

    public ControlaAcoes() {
        estado = new Esperando();
    }
    
    public void esperar(){
      estado = estado.esperar();
    }
    
    public void correr(){
      estado = estado.correr();
    } 

    public void pular() {
      estado = estado.pular();
    }

    public void abaixar() {
      estado = estado.abaixar();
    }

    public EstadoPlayer getEstado() {
      return estado;
    }

    public void setEstado(EstadoPlayer estado) {
      this.estado = estado;
    }
}
