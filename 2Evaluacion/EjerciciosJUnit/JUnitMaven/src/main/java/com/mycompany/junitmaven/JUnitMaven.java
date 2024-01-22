
package com.mycompany.junitmaven;

public class JUnitMaven {

    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Coche myCar = new Coche("Audi A3", 3000f);
        Coche.impuesto = 21f;
        
        float precioFinal = myCar.precioFinal(21f);
        System.out.println("El precio final es: " + precioFinal);
    }
}

