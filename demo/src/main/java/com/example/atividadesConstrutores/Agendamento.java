package com.example.atividadesConstrutores;

public class Agendamento {


    
    public String nomePet;
    public String servico;
    public String horario;
    public boolean perfume;
    public boolean laco;
    public boolean hidratacao;
    public String observacao;
    public double desconto;

    private Agendamento(Builder builder) {
        this.nomePet = builder.nomePet;
        this.servico = builder.servico;
        this.horario = builder.horario;
        this.perfume = builder.perfume;
        this.laco = builder.laco;
        this.hidratacao = builder.hidratacao;
        this.observacao = builder.observacao;
        this.desconto = builder.desconto;
    }

    public static class Builder {
        private String nomePet;
        private String servico;
        private String horario;
        private boolean perfume;
        private boolean laco;
        private boolean hidratacao;
        private String observacao;
        private double desconto;

        public Builder nomePet(String v){ this.nomePet=v; return this; }
        public Builder servico(String v){ this.servico=v; return this; }
        public Builder horario(String v){ this.horario=v; return this; }
        public Builder perfume(boolean v){ this.perfume=v; return this; }
        public Builder laco(boolean v){ this.laco=v; return this; }
        public Builder hidratacao(boolean v){ this.hidratacao=v; return this; }
        public Builder observacao(String v){ this.observacao=v; return this; }
        public Builder desconto(double v){ this.desconto=v; return this; }
        public Agendamento build(){ return new Agendamento(this); }
    }

    @Override
    public String toString() {
        return "Pet: " + nomePet + " | Serviço: " + servico + " | Horário: " + horario +
               " | Perfume: " + perfume + " | Laço: " + laco + " | Hidratação: " + hidratacao +
               " | Obs: " + observacao + " | Desconto: " + desconto + "%";
    }
}