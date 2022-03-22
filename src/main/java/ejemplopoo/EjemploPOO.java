package ejemplopoo;

public class EjemploPOO {

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(46464, 4, "Renault","9");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto(1, "AA11JO", 5, "rojo", true, 65334, 4, "Volkswagen", "Gol Trend");
        Moto moto = new Moto(125, 15698, 2, "Yamaha", "Zr200");
        Camion camion = new Camion(6, true, 6788, 6, "Mercedes", "Modelo");

        Vehiculo vector[] = new Vehiculo [4];
        vector[0] = vehiculo;
        vector[1]= auto2;
        vector[2] = moto;
        vector[3] = camion;
        
        for (int i = 0;i < 4; i++ ){
            System.out.println("Registro N°" + i + vector[i].getMarca());
        }
         
        System.out.println(auto1.toString());
        System.out.println(auto2.toString());

        auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();
        System.out.println("El valor del id es: " + auto2.getId());
        auto2.setId(35000);
        System.out.println("El nuevo valor del id es: " + auto2.getId());
        auto1.setId(1500);
        auto1.setPatente("AB569PO");
        auto1.setCant_puertas(3);
        auto1.setColor("amarillo");
        auto1.setCaja_manual(false);
        System.out.println("El nueva id del auto1 es: " + auto1.getId());

        System.out.println("El color del auto1 es: " + auto1.getColor());
    }

}
