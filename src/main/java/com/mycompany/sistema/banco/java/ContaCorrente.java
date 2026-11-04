package com.mycompany.sistema.banco.java;

public class ContaCorrente extends Conta implements FechamentoMensal {
    private double taxaManutencao;

    public ContaCorrente(int numero, String titular, double taxaManutencao) {
        super(numero, titular);
        this.taxaManutencao = taxaManutencao;
    }
    
    public void cobrarManutencao() {
        if (sacar(taxaManutencao)) {
            System.out.println("Manutenção de R$ " + String.format("%.2f", taxaManutencao) + " cobrada da conta " + getNumero() + ".");
        }
        
    }
    @Override
    public void fecharMes() {
        cobrarManutencao();
    }
}