package com.rsouza.cadastroveiculos.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String mascara = "dd.MM.yyyy 'as' HH:mm:ss z 'semana: 'w";
        String formatacao = "dd 'do' MM 'de' yyyy 'as' HH:mm:ss z 'semana: 'w ";
        SimpleDateFormat formatador =  new SimpleDateFormat(formatacao);
        System.out.println(formatador.format(calendar.getTime()));
    }

 // semana no ano = w
}
