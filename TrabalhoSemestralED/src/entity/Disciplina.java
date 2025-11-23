package entity;

public class Disciplina {
    private int codigoDisciplina;
    private String nomeDisciplina;
    private String diaSemana;
    private String horarioInicial;
    private int quantidadeHoras;
    private int codigoCurso;
    private String codigoProcesso;
    // private boolean status; // Não usado

    public Disciplina() {
        this.codigoDisciplina = 0;
        this.nomeDisciplina = "";
        this.diaSemana = "";
        this.horarioInicial = "";
        this.quantidadeHoras = 0;
        this.codigoCurso = 0;
        this.codigoProcesso = "";
        // this.status = true; // Não usado
    }

    @Override
    public String toString() {
        return codigoDisciplina + ";" + 
               nomeDisciplina + ";" + 
               diaSemana + ";" + 
               horarioInicial + ";" + 
               quantidadeHoras + ";" + 
               codigoCurso + ";" + 
               codigoProcesso;
    }


    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorarioInicial() {
        return horarioInicial;
    }

    public void setHorarioInicial(String horarioInicial) {
        this.horarioInicial = horarioInicial;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public void setQuantidadeHoras(int quantidadeHoras) {
        this.quantidadeHoras = quantidadeHoras;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    public String getCodigoProcesso() { return codigoProcesso; }
    
    public void setCodigoProcesso(String codigoProcesso) {
        this.codigoProcesso = codigoProcesso;
    }

    public Disciplina(int codigoDisciplina, String nomeDisciplina, String diaSemana, String horarioInicial, int quantidadeHoras, int codigoCurso, String codigoProcesso) {
        this.codigoDisciplina = codigoDisciplina;
        this.nomeDisciplina = nomeDisciplina;
        this.diaSemana = diaSemana;
        this.horarioInicial = horarioInicial;
        this.quantidadeHoras = quantidadeHoras;
        this.codigoCurso = codigoCurso;
        this.codigoProcesso = codigoProcesso;
    }

}
