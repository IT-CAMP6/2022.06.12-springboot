package pl.camp.it.first.app.model;

public class Product {
    private int cena;
    private String name;

    public Product(int cena, String name) {
        this.cena = cena;
        this.name = name;
    }

    public double getPriceWithVat() {
        return this.cena * 1.23;
    }

    public Product() {
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
