package poo;

import poo.dao.CharacterDAO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        CharacterDAO characterDAO = new CharacterDAO();

        // id, nome, forca, destreza, constituicao, sabedoria, inteligencia, carisma, raceName
//        System.out.println("Digite o nome: ");
//        String nome = scanner.nextLine();
//
//        System.out.println("\nDigite a força: ");
//        int forca = scanner.nextInt();
//
//        System.out.println("\nDigite a destreza: ");
//        int destreza = scanner.nextInt();
//
//        System.out.println("\nDigite a constituicao: ");
//        int constituicao = scanner.nextInt();
//
//        System.out.println("\nDigite a sabedoria: ");
//        int sabedoria = scanner.nextInt();
//
//        System.out.println("\nDigite a inteligencia: ");
//        int inteligencia = scanner.nextInt();
//
//        System.out.println("\nDigite a carisma: ");
//        int carisma = scanner.nextInt();
//
//        System.out.println("\nDigite o nome da raca: ");
//        String raca = scanner.next();
//
//        characterDAO.inserirPersonagem(nome, forca, destreza, constituicao, sabedoria, inteligencia, carisma, raca);
//        nome = "";
//        forca = 0;
//        destreza = 0;
//        constituicao = 0;
//        sabedoria  = 0;
//        inteligencia = 0;
//        carisma = 0;
//        raca = "";

//        System.out.println("Digite o nome do personagem que deseja atualizar: ");
//        String nome = scanner.nextLine();
//        System.out.println("Digite o novo nome do personagem: ");
//        String novoNome = scanner.nextLine();
//
//        characterDAO.atualizarPersonagem(nome, novoNome);
//        nome = "";
//        novoNome = "";

//        System.out.println("Personagem que deseja deletar: ");
//        String nome = scanner.nextLine();
//        characterDAO.deletarPersonagem(nome);
//        nome  = "";

        characterDAO.listar();

//        System.out.println("Nome");
//        String nome = scanner.nextLine();
//        characterDAO.listarPorNome(nome);
//        nome = "";

    }
}
