/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_luisvarela;

/**
 *
 * @author Luis Andres Varela
 */
public class libro_texto extends libro {

    private String Curso;
    private String Facultad;

    public libro_texto(String titulo, String autor, double precio, String Curso, String Facultad) {
        super(titulo, autor, precio);
        this.Curso=Curso;
        this.Facultad=Facultad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getFacultad() {
        return Facultad;
    }

    public void setFacultad(String Facultad) {
        this.Facultad = Facultad;
    }

}
