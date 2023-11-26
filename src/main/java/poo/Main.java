package poo;

import poo.dao.CharacterDAO;
import poo.model.Character;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        CharacterDAO characterDAO = new CharacterDAO();

        System.out.println("Nome");
        String nome = scanner.nextLine();


        characterDAO.listar(nome);

    }
}
