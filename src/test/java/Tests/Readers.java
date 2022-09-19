package Tests;

public class Readers {
    private String PIP;
    private int card;
    private int tel;
    private int tookbooks;
    private int takingbooks;
    private int returnbooks;

    public Readers(String PIP, int card, int tel) {
        this.PIP = PIP;
        this.card = card;
        this.tel = tel;
    }

    public void takeBooks(int tookbooks, int takingbooks) {
        if (tookbooks > 5) {
            int shtraf = (tookbooks - 5) * 50;
            System.out.println("Limit perevisheno. Suma shtrafy " + shtraf + "grn");}
            System.out.println("Chitach " + PIP + " vzyav syogodny " + takingbooks);
        }

    public void returnBooks(int tookbooks, int returnbooks) {
        int zalishok = tookbooks - returnbooks;
        int shtraf = zalishok * 50;
        int shtraf2 = (tookbooks-5)*50;
        if (tookbooks > 5) {
            System.out.println(PIP + " narahovano " + shtraf2 + "grn");
        }
        if (zalishok > 5) {
            System.out.println("Takozh " + PIP + " narahovano dodatkovo " + shtraf + "grn");}
            System.out.println(PIP + " orel");
        }
    }
