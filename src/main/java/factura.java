/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lab21
 */
public class factura {
    
    private float total;
    public cliente micliente;
    public producto miproducto;

    public factura() {
    }

    public factura(float total, cliente micliente, producto miproducto) {
        this.total = total;
        this.micliente = micliente;
        this.miproducto = miproducto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public cliente getMicliente() {
        return micliente;
    }

    public void setMicliente(cliente micliente) {
        this.micliente = micliente;
    }

    public producto getMiproducto() {
        return miproducto;
    }

    public void setMiproducto(producto miproducto) {
        this.miproducto = miproducto;
    }
    
    public void generarFactura(cliente cliente, producto producto)
    {
        micliente=cliente;
        miproducto=producto;
    }
    
    
    
}
