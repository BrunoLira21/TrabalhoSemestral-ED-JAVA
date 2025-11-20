package entity;

public class Professor {
    private String cpf;
    private String nome;
    private String area;
    private float ponto;

    public Professor() {
        this.cpf = "";
        this.nome = "";
        this.area = "";
        this.ponto = 0;
    }

    public Professor(String cpf, String nome, String area, float ponto) {
        this.cpf = cpf;
        this.nome = nome;
        this.area = area;
        this.ponto = ponto;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                ", ponto=" + ponto +
                '}';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public float getPonto() {
        return ponto;
    }

    public void setPonto(float ponto) {
        this.ponto = ponto;
    }
}
