
package com.mycompany.junitmaven;

public class Coche {
    public String modelo;
    public float precioBase;
    public static float impuesto;
    
    public Coche(String modelo, float precioBase){
        this.modelo=modelo;
        this.precioBase=precioBase;
    }
    
    public float precioFinal(float descuento) throws Exception {
        float precioConDescuento = this.precioBase;
        if(descuento < 0) {
            throw new Exception("Descuento erróneo porque es menor que 0");
        }
        if(descuento > 100) {
            throw new Exception("Descuento erróneo porque es mayor que 100");
        }
        if(this.precioBase >= 6000f) {
            precioConDescuento = this.precioBase - (this.precioBase*descuento/100f);
        }
        return precioConDescuento + precioConDescuento*this.impuesto/100f;
    }
}
        