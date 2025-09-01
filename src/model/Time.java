package model;

public class Time {
	
    private int quantidadeDeDevs;
    private int consumoTotalPorDia;
	
    public static final int ESTOQUE = 100;
    public static final int DIAS_SEMANA = 5;
	
    public Time(int quantidadeDeDevs, int consumoTotalPorDia) {
        this.quantidadeDeDevs = quantidadeDeDevs;
        this.consumoTotalPorDia = consumoTotalPorDia;
    }

    public int getQuantidadeDeDevs() {
        return quantidadeDeDevs;
    }

    public int getConsumoTotalPorDia() {
        return consumoTotalPorDia;
    }

    public int getConsumoSemanalEquipe() {
        return consumoTotalPorDia * DIAS_SEMANA;
    }
    
    public boolean estoqueSuficiente() {
        return getConsumoSemanalEquipe() <= ESTOQUE;
    }
    
    public int cafeFaltante() {
        if (estoqueSuficiente()) {
            return 0;
        } else {
            return getConsumoSemanalEquipe() - ESTOQUE;
        }
    }
}
