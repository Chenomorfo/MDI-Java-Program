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
public class Cliente {

private int Numero;
private String Nombre,RFC,Dir;

 public int getNumero(){
 return Numero;
 }
    public void setNumero(int Numero)
    {
    this.Numero = Numero;
    }
    
     public String getNombre(){
 return Nombre;
 }
    public void setNumero(String nom)
    {
    this.Nombre = nom;
    }
    
      public String getRFC(){
 return RFC;
 }
    public void setRFC(String rfc)
    {
    this.RFC = rfc;
    }
    
      public String getDir(){
 return Dir;
 }
    public void setDir(String dir)
    {
    this.Dir = dir;
    }
    
    public Cliente(int Numero, String Nombre, String RFC, String Dir) {
        this.Nombre=Nombre;
        this.Numero = Numero;
        this.RFC = RFC;
        this.Dir = Dir;
    }

}
