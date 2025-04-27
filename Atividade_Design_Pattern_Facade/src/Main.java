package br_fastfood.app;

import java.util.Scanner;
import br_fastfood.facade.ComboFacade;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Master");
        System.out.println("2 – Super Combo");
        System.out.print("Sua escolha: ");
        int escolha = in.nextInt();

        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());

        in.close();
    }
}
