import java.util.Date;

public class RelatorioFinanceiro extends Relatorio{
    
    private AcaoGenerica[] acaoGenerica;

    public RelatorioFinanceiro(Usuario usuario, Date dataInicio, Date dataFim, AcaoGenerica[] acaoGenerica) {
        super(usuario, dataInicio, dataFim);
        this.acaoGenerica = acaoGenerica;
    }

    public AcaoGenerica[] getAcaoGenerica() {
        return acaoGenerica;
    }

    public void setAcaoGenerica(AcaoGenerica[] acaoGenerica) {
        this.acaoGenerica = acaoGenerica;
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
