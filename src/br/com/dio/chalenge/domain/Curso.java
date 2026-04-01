package br.com.dio.chalenge.domain;

public class Curso extends Conteudo{
    private int cargaHoraria;

    /*
    public Curso() {
    }
    */

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo = '" + getTitulo() + '\'' + ", descricao = '" +
            getDescricao() + '\'' + ", cargaHoraria = " + cargaHoraria + '}';
        /* 
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("titulo=").append(titulo);
        sb.append(", descricao=").append(descricao);
        sb.append(", cargaHoraria=").append(cargaHoraria);
        sb.append('}');
        return sb.toString();
        */
    }

}
