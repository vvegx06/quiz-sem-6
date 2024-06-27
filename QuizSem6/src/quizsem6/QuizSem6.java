/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizsem6;
/**
 *
 * @author andre
 */
public class QuizSem6 {

    public static void main(String[] args) {
        
    // aqui cree la instancia de la clase spotify
    
        spotify cancion = new spotify ("777", "si preguntas por mi", "Tainy, Kris Floyd y Judeine", "3:35 minutos", "2023");
        
    // aqui use los getters para mostrar los valores 
    
        System.out.println("id: " + cancion.getId());
        System.out.println("Titulo: " + cancion.getTitulo());
        System.out.println("Autor: " + cancion.getAutor());
        System.out.println("Duracion: " + cancion.getDuracion());
        System.out.println("Anioo de Creacion: " + cancion.getAnodecreacion());
        
    // y por ultimo aunque no se si esta de mas, voy a usar lo setters para modificar algunos valores
    
        cancion.setTitulo("si preguntas por mi instrumental");
        cancion.setAutor("Tainy");     
        System.out.println("Nuevo titulo: " + cancion.getTitulo());
        System.out.println("Nuevo Autor " + cancion.getAutor());
        
    }
    
}
