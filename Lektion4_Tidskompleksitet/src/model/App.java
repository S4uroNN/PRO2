package model;

public class App {
    public static void main(String[] args) {
        Nedboer nedboer = new Nedboer();
        System.out.println(nedboer.bedsteTreFerieUger());
        System.out.println(nedboer.bedsteFerieUgerStart(3));
    }
}
