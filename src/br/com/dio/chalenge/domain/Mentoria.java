package br.com.dio.chalenge.domain;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    /*
    public Mentoria() {
    }
    */

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return " Mentoria {" + " Título = '" + getTitulo() + '\'' + ", Descrição = '" +
            getDescricao() + '\'' + ", Data = '" + data + "' }";
        /*
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria{");
        sb.append("titulo=").append(titulo);
        sb.append(", descricao=").append(descricao);
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
        */
    }

    public void imprimirDados() {
        //System.out.println("---------------------Mentoria(s)----------------------------------------");
        System.out.println("Nome da Mentoria: " + this.getTitulo());
        System.out.println("Descrição da Mentoria: " + this.getDescricao());
        System.out.println("Data: " + this.getData());
        System.out.println("-----------------------------------------------------------------------");
    }

}
