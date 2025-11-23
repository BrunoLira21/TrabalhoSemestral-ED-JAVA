
package controller;

import entity.Professor;

public class Quick {

    public int[] Quick(int[] vetor, int inicio, int fim){
        if(inicio < fim){
            int indice = particionar(vetor, inicio, fim);
            Quick(vetor, inicio, indice -1);
            Quick(vetor, indice + 1, fim);
        }
        
        return vetor;
    }
    
    public int particionar(int[] vetor, int inicio, int fim){
        int pivo = vetor[fim];
        int i = inicio - 1;
        for (int j = inicio; j <= fim - 1; j++){
            if (vetor[j] >= pivo){
                i++;
                troca(vetor, i, j);
            }  
        }
        
        troca(vetor, fim, i + 1);
        
        return i + 1;
    }
    
    public void troca(int[] vetor, int i, int j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    
    public Professor[] quickSortProfessores(Professor[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indice = particionarProfessores(array, inicio, fim);
            quickSortProfessores(array, inicio, indice - 1);
            quickSortProfessores(array, indice + 1, fim);
        }
        return array;
    }

    private int particionarProfessores(Professor[] array, int inicio, int fim) {
        Professor pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j <= fim - 1; j++) {

            if (array[j].getPonto() >= pivo.getPonto()) {
                i++;
                trocaProfessores(array, i, j);
            }
        }
        trocaProfessores(array, fim, i + 1);
        return i + 1;
    }

    private void trocaProfessores(Professor[] array, int i, int j) {
        Professor aux = array[i];
        array[i] = array[j];
        array[j] = aux;
    }
    
}
