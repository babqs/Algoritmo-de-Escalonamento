package rr;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Processo> listaProcessos = new ArrayList<>();
        ArrayList<Processo> listaProntos = new ArrayList<>();

        Processo p1 = new Processo("P1", 300);
        Processo p2 = new Processo("P2", 250);
        Processo p3 = new Processo("P3", 100);
        Processo p4 = new Processo("P4", 200);
        Processo p5 = new Processo("P5", 250);
        Processo p6 = new Processo("P6", 150);
        Processo p7 = new Processo("P7", 100);
        Processo p8 = new Processo("P8", 200);
        Processo p9 = new Processo("P9", 300);
        Processo p0 = new Processo("P0", 200);

        listaProcessos.add(p1);
        listaProcessos.add(p2);
        listaProcessos.add(p3);
        listaProcessos.add(p4);
        listaProcessos.add(p5);
        listaProcessos.add(p6);
        listaProcessos.add(p7);
        listaProcessos.add(p8);
        listaProcessos.add(p9);
        listaProcessos.add(p0);

//        for (int i = 0; i < listaProcessos.size(); i++) {
//            System.out.println(listaProcessos.toString());
//        }
        long quantum = 30;
        long tempoInicial = 0;
        long tempoFinal = 0;
        String executando = " ";
        long tempo = 0;
        int temp;

        for (int i = 0; i <= 400; i = i + 30) {
            for (Processo p : listaProcessos) {
                if (p.getDuracao() <= i) {
                    tempoInicial = System.currentTimeMillis();
                    listaProntos.add(p);
                }
            }
            if (quantum > 0) {
                if (!listaProntos.isEmpty()) {
                    //tempoInicial = System.currentTimeMillis();
                    executando = listaProntos.toString();
                    System.out.println("Processos executados: " + executando);
                    tempoFinal = System.currentTimeMillis();
                    quantum = quantum - 10;
                    tempo = (tempoFinal - tempoInicial);
                    System.out.println("Tempo de duracao: " + tempo);
                }

            } else {
                System.out.println(executando);
                quantum = quantum - 10;
                //System.out.println("Tempo Duracao: " + tempo);

                if (!listaProntos.isEmpty()) {
                    //tempoInicial = System.currentTimeMillis();
                    quantum = 30;
                    executando = listaProntos.toString();
                    tempoFinal = System.currentTimeMillis();
                    System.out.println("Processos executados: " + executando);
                    quantum = quantum - 10;
                    tempo = tempoFinal - tempoInicial;
                    System.out.println("Tempo Duracao: " + tempo);
                }
            }
        }
    }
}