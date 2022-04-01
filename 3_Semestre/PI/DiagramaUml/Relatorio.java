import java.util.Date;

public class Relatorio {
    
    private Usuario usuario;
    private Date dataInicio;
    private Date dataFim;

    public Relatorio(Usuario usuario, Date dataInicio, Date dataFim) {
        this.usuario = usuario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }
     
    public void gerar() {

    }

    public void exportar() {

    }

}
