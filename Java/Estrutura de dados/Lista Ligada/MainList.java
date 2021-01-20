package Listas;

import Listas.ListaLigada;
import Listas.No;

public class MainList {
    public static void main(String[] args) {
        
        ListaLigada list = new ListaLigada();
        No novo = new No();
        
        int i = 5;

        novo.setInfo(i);
        list.inserirNoInicio(novo);
        list.exibe();

    }
}
