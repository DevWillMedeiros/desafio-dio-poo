package com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Date;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(){

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * 20;
    }
}
