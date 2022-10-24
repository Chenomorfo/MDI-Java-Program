/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaMDI;

/**
 *
 * @author cheno
 */
public class Producto {
    
    private int _intNumero;
 
    public int getNumero(){
 return _intNumero;
 }
    public void setNumero(int Numero)
    {
    this._intNumero = Numero;
    }
   
     private String _strNombre;
 
    public String getNombre(){
 return _strNombre;
 }
    public void setNombre(String nombre)
    {
    this._strNombre = nombre;
    }
    
     private double _dblPrecio;
 
    public double getPrecio(){
 return _dblPrecio;
 }
    public void setPrecio(double Precio)
    {
    this._dblPrecio = Precio;
    }

    public Producto(int Numero, String nombre, double Precio) {
        setNombre(nombre);
        setNumero(Numero);
        setPrecio(Precio);
    }
    
}
