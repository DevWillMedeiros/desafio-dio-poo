package com.dio.desafio.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){

    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public StringBuffer exibir(){
        StringBuffer sb = new StringBuffer();
        sb.append("[ ").
                append("Título: "+getTitulo()).
                append(" / Descrição: "+getDescricao()).
                append(" / Carga Horária: "+getCargaHoraria()).
                append(" ]");
                System.out.println(sb);
        return sb;
    }
}
