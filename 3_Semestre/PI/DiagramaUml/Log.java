import java.util.Date;

public class Log {

    private Date date;
    private Usuario usuario;
    private AcaoGenerica acaoGenerica;
    private String acao;
    
    public Log(Date date, Usuario usuario, AcaoGenerica acaoGenerica, String acao) {
        this.date = date;
        this.usuario = usuario;
        this.acaoGenerica = acaoGenerica;
        this.acao = acao;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public AcaoGenerica getAcaoGenerica() {
        return acaoGenerica;
    }

    public void setAcaoGenerica(AcaoGenerica acaoGenerica) {
        this.acaoGenerica = acaoGenerica;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public void registrar() {

    }

    public void expira() {
        
    }
}
