/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rr;

/**
 *
 * @author Uso Exclusivo
 */
public class Processo {

    private String nome;
    private int duracao;

    public Processo(String nome, int duracao) {
        this.setNome(nome);
        this.setDuracao(duracao);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return getNome() /*+ " " + getDuracao()*/;
    }
}
