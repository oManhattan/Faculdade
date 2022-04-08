import java.util.Date;

public class Log {

    private Date date;
    private Usuario usuario;
    private AcaoGenerica acaoGenerica;
    private Produto produto;
    private Cliente cliente;
    private String acao;
    
    // Contrutor para registrar os processos de venda
    public Log(Date date, Usuario usuario, AcaoGenerica acaoGenerica, String acao) {
        this.date = date;
        this.usuario = usuario;
        this.acaoGenerica = acaoGenerica;
        this.acao = acao;
    }

    // Constutor para registrar os processos de produto/serviço
    public Log(Date date, Usuario usuario, Produto produto, String acao) {
        this.date = date;
        this.usuario = usuario;
        this.produto = produto;
        this.acao = acao;
    }
    
    // Construtor para registrar os processos de cliente
    public Log(Date date, Usuario usuario, Cliente cliente, String acao) {
        this.date = date;
        this.usuario = usuario;
        this.cliente = cliente;
        this.acao = acao;
    }
    
    // Construtor para registrar algum processo de usuário
    public Log(Date date, Usuario usuario, String acao) {
        this.date = date;
        this.usuario = usuario;
        this.acao = acao;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
