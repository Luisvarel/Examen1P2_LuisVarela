/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_luisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class LibroNoFicción extends libro{

    private String tipo;
    public LibroNoFicción(String titulo, String autor, double precio,String tipo) {
        super(titulo, autor, precio);
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
