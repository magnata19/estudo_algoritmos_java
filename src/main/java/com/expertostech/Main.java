package com.expertostech;

public class Main {
    public static void main(String[] args) {
        Cartas[] cartas = {
                new Cartas("Copas", 5),
                new Cartas("Espadas", 9),
                new Cartas("Ouro", 3),
                new Cartas("Paus", 6),
                new Cartas("Paus", 7)
        };

        //lista nao ordenada
        for(Cartas carta: cartas) {
            System.out.println(carta);
        }
        System.out.println("************");

        //lista ordenada
        //selectionSort(cartas, cartas.length);
        insertionSort(cartas, cartas.length);
        for(Cartas carta: cartas) {
            System.out.println(carta);
        }
    }

    private static void insertionSort(Cartas[] cartas, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos; atual++) {
            int analise = atual;
            while (analise > 0 && cartas[analise].getNumero() < cartas[analise - 1].getNumero()) {
                Cartas cartaAnalise = cartas[analise];
                Cartas cartaAnaliseMenor1 = cartas[analise - 1];
                cartas[analise] = cartaAnaliseMenor1;
                cartas[analise - 1] = cartaAnalise;
                analise--;
            }
        }
    }

    private static void troca(Cartas[] cartas, int primeiro, int segundo) {
        Cartas cartaAnalise = cartas[primeiro];
        Cartas cartaAnaliseMenos1 = cartas[segundo];
        cartas[primeiro] = cartaAnaliseMenos1;
        cartas[segundo] = cartaAnalise;
    }

    private static void selectionSort(Cartas[] cartas, int quantidadeDeElementos) {
        for(int atual = 0; atual < quantidadeDeElementos; atual++) {
            int menor = buscaMenorNipe(cartas, atual, cartas.length);
            troca(cartas, atual, menor);
        }
    }

    private static int buscaMenorNipe(Cartas[] cartas, int inicio, int termino) {
        int menor = inicio;
        for(int atual = inicio; atual < termino; atual++) {
            if(cartas[atual].getNumero() < cartas[menor].getNumero()) {
                menor = atual;
            }
        }
        return menor;
    }
}