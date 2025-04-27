package br_fastfood.facade;

import br_fastfood.model.Burger;
import br_fastfood.model.Bebida;
import br_fastfood.model.Sobremesa;
import br_fastfood.model.Combo;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {
        if (codigo == 1) {
            combo = new Combo(
                    new Burger("Big Cheddar", 15.00),
                    new Bebida("Refrigerante", 6.00),
                    new Sobremesa("Sundae", 7.00)
            );
        } else if (codigo == 2) {
            combo = new Combo(
                    new Burger("Chicken Crispy", 17.00),
                    new Bebida("Suco Natural", 8.00),
                    new Sobremesa("Torta de Maçã", 6.50)
            );
        } else {
            System.out.println("Código inválido! Nenhum combo criado.");
        }
    }

    public void exibirItens() {
        if (combo != null) {
            System.out.println("--- Itens do seu Combo ---");
            System.out.println("Burger: " + combo.getBurger());
            System.out.println("Bebida: " + combo.getBebida());
            System.out.println("Sobremesa: " + combo.getSobremesa());
        } else {
            System.out.println("Nenhum combo selecionado.");
        }
    }

    public double getPrecoTotal() {
        if (combo != null) {
            return combo.getBurger().getPreco() +
                    combo.getBebida().getPreco() +
                    combo.getSobremesa().getPreco();
        }
        return 0.0;
    }
}
