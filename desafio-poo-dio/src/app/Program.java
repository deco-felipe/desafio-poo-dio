package app;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		
		curso1.setTitulo("Java");
		curso1.setDescricao("Curso de Java");
		curso1.setCargaHoraria(7);
		
		curso2.setTitulo("JS");
		curso2.setDescricao("Curso de Js");
		curso2.setCargaHoraria(10);
		
		Mentoria m1 = new Mentoria();
		Mentoria m2 = new Mentoria();
		
		m1.setTitulo("Java e Js");
		m1.setDescricao("Descricao1");
		m1.setData(LocalDate.now());
		
		BootCamp bootCamp = new BootCamp();
		bootCamp.setNome("Java");
		bootCamp.setDescricao("Descricao");
		bootCamp.getConteudos().add(curso1);
		bootCamp.getConteudos().add(curso2);
		bootCamp.getConteudos().add(m1);
		
		Dev dev1 = new Dev();
		Dev dev2 = new Dev();
		
		dev1.setNome("Deco");
		dev1.inscreverBootCamp(bootCamp);
		System.out.println("Conteudos inscritos " + dev1.getConteudosInscritos());
		System.out.println("Conteudos concluidos" + dev1.getConteudosConcluidos());
		
		dev2.setNome("Jefferson");
		dev2.inscreverBootCamp(bootCamp);
		System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
		dev2.progredir();
		
		System.out.println("Conteudos concluidos" + dev2.getConteudosConcluidos());
		System.out.println("Conteudos inscritos " + dev2.getConteudosInscritos());
		
		

	}

}
