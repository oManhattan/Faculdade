package exe03;

public enum CalculadoraTaxa {
    
    BancoX(new BancoX()),
    BancoY(new BancoY()),
    BancoZ(new BancoZ());

    private final Taxa taxa;

    private CalculadoraTaxa(Taxa taxa) {
        this.taxa = taxa;
    }

    public Taxa getBanco() {
        return taxa;
    }
}
