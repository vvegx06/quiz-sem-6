/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizsem6;

/**
 *
 * @author andre
 */
public class spotify {
    public String id;
    public String titulo;
    public String autor;
    public String duracion;
    public String anodecreacion; 

// constructor
//Todo el codigo lo hice mediante clic derecho y insert code por si acaso 
    
    public spotify(String id, String titulo, String autor, String duracion, String anodecreacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anodecreacion = anodecreacion;
    }
    
// setters y getters

        public String getId() {
            return "El id esta bajo derechos de autor de "+  autor;
    }

        public void setId(String id) {
            this.id = id;
    }

        public String getTitulo() {
            return titulo;
    }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
    }

        public String getAutor() {
            return autor;
    }

        public void setAutor(String autor) {
            this.autor = autor;
    }

        public String getDuracion() {
            return duracion;
    }

        public void setDuracion(String duracion) {
            this.duracion = duracion;
    }

        public String getAnodecreacion() {
            return anodecreacion;
    }

        public void setAnodecreacion(String anodecreacion) {
            this.anodecreacion = anodecreacion;
    }
    
    
}

   

