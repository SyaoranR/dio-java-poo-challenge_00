import br.com.dio.chalenge.domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("---------------------Adicionando Cursos--------------------------------");

        Curso curso1 = new Curso();
        curso1.setTitulo("Introdução a Programação Java");
        curso1.setDescricao("Desenvolvendo com a Linguagem de Programação Java");
        curso1.setCargaHoraria(80);

        Curso curso2 = new Curso();
        curso2.setTitulo("Introdução a Programação Web PHP");
        curso2.setDescricao("Usando a linguagem PHP para Criar Sites");
        curso2.setCargaHoraria(80);

        Curso curso3 = new Curso();
        curso3.setTitulo("Introdução a Banco de Dados");
        curso3.setDescricao("Banco de Dados PostgresSQL");
        curso3.setCargaHoraria(60);

        Curso curso4 = new Curso();
        curso4.setTitulo("Programação Front-End");
        curso4.setDescricao("Desenvolvendo Layouts de Sites com React");
        curso4.setCargaHoraria(60);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("-----------------------Curso(s)----------------------------------------");
        System.out.println("-----------------------------------------------------------------------");


        System.out.println("-----------------------Curso 1-----------------------------------------");
        curso1.imprimirDados();

        System.out.println("-----------------------Curso 2-----------------------------------------");
        curso2.imprimirDados();

        System.out.println("-----------------------Curso 3-----------------------------------------");
        curso3.imprimirDados();

        System.out.println("-----------------------Curso 4-----------------------------------------");
        curso4.imprimirDados();


        System.out.println("---------------------Adicionando Mentorias-----------------------------");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Boas práticas de Programação com Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria PHP");
        mentoria2.setDescricao("Boas práticas de Programação Web com PHP");
        mentoria2.setData(LocalDate.now());

        Mentoria mentoria3 = new Mentoria();
        mentoria3.setTitulo("Mentoria de Banco de Dados");
        mentoria3.setDescricao("Aprendendo Comandos de SQL PostgresSQL");
        mentoria3.setData(LocalDate.now());

        Mentoria mentoria4 = new Mentoria();
        mentoria4.setTitulo("Mentoria sobre Front-End");
        mentoria4.setDescricao("Aprendendo a criar layouts com React, Angular");
        mentoria4.setData(LocalDate.now());

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("---------------------Mentoria(s)----------------------------------------");
        System.out.println("-----------------------------------------------------------------------");


        System.out.println("---------------------Mentoria 1----------------------------------------");
        mentoria1.imprimirDados();

        System.out.println("---------------------Mentoria 2----------------------------------------");
        mentoria2.imprimirDados();

        System.out.println("---------------------Mentoria 3----------------------------------------");
        mentoria3.imprimirDados();

        System.out.println("---------------------Mentoria 4----------------------------------------");
        mentoria4.imprimirDados();


        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
         */

        //System.out.println("-----------------------------------------------------------------------");
        //System.out.println("---------------------Adicionando Bootcamps-----------------------------");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Bootcamp direcionado para linguagem de programação Java");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria3);

        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp PHP Developer");
        bootcamp2.setDescricao("Bootcamp direcionado para linguagem de programação Web PHP");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso4);
        bootcamp2.getConteudos().add(mentoria2);
        bootcamp2.getConteudos().add(mentoria4);

        //System.out.println("-----------------------------------------------------------------------");
        //System.out.println("---------------------Adicionando Developers----------------------------");

        Dev dev1 = new Dev();
        dev1.setNome("Alessandro");
        dev1.inscreverBootcamp(bootcamp1);

        Dev dev2 = new Dev();
        dev2.setNome("Meriwska");
        dev2.inscreverBootcamp(bootcamp2);

        System.out.println("---------------------Bootcamps dos Developers--------------------------");
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Conteúdos Inscritos Alessandro: " + dev1.getConteudosInscritos());

        dev1.progredir();
        dev1.progredir();
        dev1.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Alessandro: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Alessandro: " + dev1.getConteudosConcluidos());
        System.out.println("XP Alessandro: " + dev1.calcularTotalXp());

        System.out.println("--------------------------------------------------------------------------------------------");

        System.out.println("Conteúdos Inscritos Meriwska: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Meriwska: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Meriwska: " + dev2.getConteudosConcluidos());
        System.out.println("XP Meriwska : " + dev2.calcularTotalXp());


    }
    
}
