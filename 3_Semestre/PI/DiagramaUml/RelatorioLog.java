import java.util.Date;

public class RelatorioLog extends Relatorio{
    
    private Log[] log;

    public RelatorioLog(Usuario usuario, Date dataInicio, Date dataFim, Log[] log) {
        super(usuario, dataInicio, dataFim);
        this.log = log;
    }

    public Log[] getLog() {
        return log;
    }

    public void setLog(Log[] log) {
        this.log = log;
    }

    @Override
    public void exportar() {
        // TODO Auto-generated method stub
        super.exportar();
    }

    @Override
    public void gerar() {
        // TODO Auto-generated method stub
        super.gerar();
    }  

}
