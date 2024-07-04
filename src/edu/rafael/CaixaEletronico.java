package edu.rafael;

public class CaixaEletronico {
    public static void main(String[] args) {
        double valorSolicitado = 17.0;
        double saldo = 25.0;

        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;

            String mensagem = String.format("\n\tSaque realizado !!\n\tNovo saldo : R$ %.2f\n", saldo);
            System.out.println(mensagem);

        } else {
            System.out.println("Saldo insuficiente para saque ...");
        }

        System.out.println("\nOperador Ternário ");

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    }
}
