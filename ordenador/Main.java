package poo.ordenador;

public class Main{
    public static void main(String[] args){
        Ordenador pc1 = new Ordenador("Asus", "TUF Gaming","Intel Core i7", 16, 518);
        Ordenador pc2 = new Ordenador("HP", "Pavilion5995", "Intel Dual-Core", 2, 512);
        Ordenador pc3 = new Ordenador("MSI", "Dragon", "AMD Ryzen 9", 32, 1000);

        System.out.println("En estos momentos se está ejecutando el IDE IntelliJ - Cargando...");

        System.out.println("MARCAS REGISTRADAS: ");
        System.out.println(pc1.getMarca());
        System.out.println(pc2.getMarca());
        System.out.println(pc3.getMarca());

        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println(pc3);

        pc2.setRam(12);
        pc2.setProcesador("AMD Ryzen 5");
        System.out.println("Cambios actualizados en el 2ºpc");
        System.out.println(pc2);
    }
}
