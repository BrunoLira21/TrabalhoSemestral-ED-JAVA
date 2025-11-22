package entity;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Inscrições {
    private String cpf;
    private int codigoDisciplina;
    private int codigoProcesso;

    public Inscrições() {
        this.cpf = "";
        this.codigoDisciplina = 0;
        this.codigoProcesso = 0;
    }

    public Inscrições(String cpf, int codigoDisciplina, int codigoProcesso) {
        this.cpf = cpf;
        this.codigoDisciplina = codigoDisciplina;
        this.codigoProcesso = codigoProcesso;
    }

    @Override
    public String toString() {
        return "Inscrições{" +
                "cpf='" + cpf + '\'' +
                ", codigoDisciplina=" + codigoDisciplina +
                ", codigoProcesso=" + codigoProcesso +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public int getCodigoProcesso() {
        return codigoProcesso;
    }

    public void setCodigoProcesso(int codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }
}
