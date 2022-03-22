/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopoo;


public class Moto extends Vehiculo {
    int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int numero_registro, int cant_ruedas, String marca, String modelo) {
        super(numero_registro, cant_ruedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
    
}
