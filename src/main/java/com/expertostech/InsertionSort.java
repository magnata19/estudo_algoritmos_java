package com.expertostech;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {
        25,15,3,2,97,4,65,3452,32,1
        };

        //lista nao ordenada
        for(int number: numbers) {
            System.out.println(number);
        }

        System.out.println("************");

        int menorr = buscaMenor(numbers, 0, numbers.length);
        System.out.println(menorr);

        //lista ordenada
//        selectionSort(numbers);
        insertionSort(numbers, numbers.length);
        for(int number: numbers) {
            System.out.println(number);
        }
    }

    private static void insertionSort(int[] numbers, int quantidadeDeItens) {
        for(int atual = 1; atual < quantidadeDeItens; atual ++) {
            int anterior = atual;
            while (anterior > 0 && numbers[anterior] < numbers[anterior - 1]) {
                troca(numbers, anterior, anterior - 1);
                anterior--;
             }
        }
    }

    private static void selectionSort(int[] numbers) {
        for(int atual = 0; atual < numbers.length - 1; atual ++) {
            int menor = buscaMenor(numbers, atual, numbers.length);
            troca(numbers ,numbers[atual], numbers[menor]);
        }
    }

    private static void troca(int[] numbers,int primeiro, int segundo) {
        int numeroAtual = numbers[primeiro];
        int numeroMenor = numbers[segundo];
        numbers[primeiro] = numeroMenor;
        numbers[segundo] = numeroAtual;
    }

    private static int buscaMenor(int[] numbers, int inicio, int termino) {
        int menor = inicio;
        for(int atual = inicio; atual < termino; atual++) {
            if(numbers[atual] < numbers[menor]) {
                menor = atual;
            }
        }
        return menor;
    }
}
