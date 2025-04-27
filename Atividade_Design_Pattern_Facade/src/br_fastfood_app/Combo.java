package br_fastfood.model;

public class Combo {
    private final Burger burger;
    private final Bebida bebida;
    private final Sobremesa sobremesa;

    public Combo(Burger burger, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public Burger getBurger() {
        return burger;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Sobremesa getSobremesa() {
        return sobremesa;
    }
}
