package poo.ordenador;

public class Ordenador {
    private String marca;
    private String modelo;
    private String procesador;
    private int ram;
    private int hdd;

    public Ordenador(String marca, String modelo, String procesador, int ram, int hdd){
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.ram = ram;
        this.hdd = hdd;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getProcesador(){
        return this.procesador;
    }

    public int getRam(){
        return this.ram;
    }

    public int getHdd(){
        return this.hdd;
    }

    public String toString(){
        return "Características técnicas: \n" +
                "Marca: " +marca+ ", \n" +
                "Modelo: " +modelo+ ", \n" +
                "Procesador: " +procesador+ ", \n" +
                "Memoria RAM(Gb): " +ram+ ", \n" +
                "Capacidad(Gb): " +hdd+ ".\n" +
                "----------------------";

    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public void setHdd(int hdd){
        this.hdd = hdd;
    }

    /*
    * Podríamos crear una clase para catalogar las marcas con un ArrayList, y almacenarlas
    * con un metodo addMarcas(), y para añadirlas al instanciar objetos
    * Si no, con un ArrayList con las marcas que ya tuviéramos y sólo sacar un sout con el nombre del array*/


}
