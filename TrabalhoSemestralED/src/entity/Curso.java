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
    public void limparCamposCurso(){
        this.setArea("");
        this.setCodigoCurso(0);
        this.setNomeCurso("");
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

    public Object getAreaConhecimento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
