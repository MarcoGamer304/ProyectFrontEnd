/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.api.models;

import jakarta.persistence.*;
import lombok.*;

/**
 *
 * @author Marco
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    
    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String apellidos;
    
    @Column(nullable = false)
    private String correo_electronico;
    
    @Column(nullable = false)
    private String nombre_usuario;
    
    @Column(nullable = false)
    private String contrasena;
    
    @Column(nullable = false)
    private String tipo_usuario;
    
    @Column(nullable = false)
    private String telefono;
    
    @Column(nullable = false)
    private String carne;
}
