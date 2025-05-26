package model;

public abstract class Dipendente {
    private String nome;
    private String ruolo;
    private int livello;
    protected static final double STIPENDIO_BASE = 1000.0;

    public Dipendente(String nome, String ruolo, int livello) {
        this.nome = nome;
        this.ruolo = ruolo;
        this.livello = livello;
    }

    public String getNome() { return nome; }
    public String getRuolo() { return ruolo; }
    public int getLivello() { return livello; }

    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        return nome + " - " + ruolo + " (Livello: " + livello + ")";
    }
}
