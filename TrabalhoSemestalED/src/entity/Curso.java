package entity;

public class Curso {
    private int codigoCurso;
    private String nomeCurso;
    private String area;

    public Curso(){
        this.codigoCurso = 0;
        this.nomeCurso = "";
        this.area = "";
    }
    public Curso(int cc, String nc, String a){
        this.codigoCurso = cc;
        this.nomeCurso = nc;
        this.area = a;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigoCurso=" + codigoCurso +
                ", nomeCurso='" + nomeCurso + '\'' +
                ", area='" + area + '\'' +
                '}';
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
