package model;

import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaFisicaRepo;
import model.PessoaJuridicaRepo;

public class Main {

    public static void main(String[] args) {
        String arquivoPessoasFisicas = "pessoasFisicas.dat";
        String arquivoPessoasJuridicas = "pessoasJuridicas.dat";

        PessoaFisicaRepo repoPessoaFisica = new PessoaFisicaRepo();
        repoPessoaFisica.inserir(new PessoaFisica(1, "Ana", "11111111111", 25));
        repoPessoaFisica.inserir(new PessoaFisica(2, "Carlos", "22222222222", 52));

        try {
            repoPessoaFisica.persistir(arquivoPessoasFisicas);
            System.out.println("Dados de Pessoa Fisica Armazenados.");

            PessoaFisicaRepo repoPessoaFisicaRecuperado = new PessoaFisicaRepo();
            repoPessoaFisicaRecuperado.recuperar(arquivoPessoasFisicas);
            System.out.println("Dados de Pessoa Fisica Recuperados.");
            repoPessoaFisicaRecuperado.obterTodos().forEach(PessoaFisica::exibir);
        } catch (Exception e) {
            e.printStackTrace();
        }

        PessoaJuridicaRepo repoPessoaJuridica = new PessoaJuridicaRepo();
        repoPessoaJuridica.inserir(new PessoaJuridica(3, "XPTO Sales", "33333333333333"));
        repoPessoaJuridica.inserir(new PessoaJuridica(4, "XPTO Solutions", "44444444444444"));

        try {
            repoPessoaJuridica.persistir(arquivoPessoasJuridicas);
            System.out.println("Dados de Pessoa Juridica Armazenados.");

            PessoaJuridicaRepo repoPessoaJuridicaRecuperado = new PessoaJuridicaRepo();
            repoPessoaJuridicaRecuperado.recuperar(arquivoPessoasJuridicas);
            System.out.println("Dados de Pessoa Juridica Recuperados.");
            repoPessoaJuridicaRecuperado.obterTodos().forEach(PessoaJuridica::exibir);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

