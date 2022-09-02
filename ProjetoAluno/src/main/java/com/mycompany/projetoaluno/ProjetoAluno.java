package com.mycompany.projetoaluno;

public class ProjetoAluno {

    public static void main(String[] args) {
        
        // Pessoa p1 = new Pessoa(); -> incorreto, não pode instanciar classe abstrata.
        
        Visitante v1 = new Visitante();
        v1.setNome("Carlos");
        v1.setIdade(25);
        v1.setSexo("Masculino");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setCurso("Engenharia de Software");
        a1.setNome("Ralf");
        a1.setIdade(23);
        a1.setMatricula(100);
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setBolsa(33f);
        b1.setMatricula(7931);
        b1.setCurso("Tecnologia da Informação");
        b1.setNome("Carla");
        b1.setIdade(19);
        b1.setSexo("Feminino");
        System.out.println(b1.toString());
        b1.renovarBolsa();
        System.out.println();
        b1.pagarMensalidade();
        
        Professor p1 = new Professor();
        p1.setNome("Guanabara");
        p1.setIdade(42);
        p1.setSexo("Masculino");
        p1.setEspecialidade("Programação");
        p1.setSalario(7500.00f);
        System.out.println(p1.toString());
        
        Tecnico t1 = new Tecnico();
        t1.setCurso("Automação");
        t1.setIdade(17);
        t1.setMatricula(731);
        t1.setNome("Gustavo");
        t1.setRegistroProfissional(true);
        t1.setSexo("Masculino");
        System.out.println(t1.toString());
        t1.praticar();
        
        
        
    }
}
