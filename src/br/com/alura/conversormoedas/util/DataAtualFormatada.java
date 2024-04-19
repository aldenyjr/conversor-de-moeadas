package br.com.alura.conversormoedas.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataAtualFormatada {

    public String dataHoraAtual(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return now.format(formatter);
    }
}
