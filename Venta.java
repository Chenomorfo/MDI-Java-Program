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
public class Venta {
    private int Numero,Total;
    private String Nombre,Producto;

   public int getNumero(){
   return Numero;
   }
   
   public void setNumero(int num){
   this.Numero = num;
   }
    
   
   public int getTotal(){
   return Total;
   }
   
   public void setTotal(int tot){
   this.Total = tot;
   }
   
   public String getNombre()
   {
   return Nombre;
   }
   
   public String getProducto()
   {
   return Producto;
   }
   
    public Venta(int Numero, int Total, String Nombre, String Producto) {
        this.Numero = Numero;
        this.Total = Total;
        this.Nombre = Nombre;
        this.Producto = Producto;
    }
    
    
    
    
}
