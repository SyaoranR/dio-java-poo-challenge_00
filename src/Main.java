import br.com.dio.chalenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){ 
        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução a Programação");
        curso1.setDescricao("Linguagem de Programação Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Introdução a Banco de Dados");
        curso2.setDescricao("Banco de Dados PostgresSQL");
        curso2.setCargaHoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Dúvidas de Programação com Java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp direcionado para linguagem de programação Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Alessandro");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alessandro: " + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alessandro: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alessandro: " + dev1.getConteudosConcluidos());
        System.out.println("XP Alessandro: " + dev1.calcularTotalXp());

        System.out.println("--------------------------------------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Meriwska");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Meriwska: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Meriwska: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Meriwska: " + dev2.getConteudosConcluidos());
        System.out.println("XP Meriwska : " + dev2.calcularTotalXp());



    }
    
}
