/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;





/**
 *
 * @author pguid
 */
@Controller
@RequestMapping("/autor")
public class autorControlador {

//    @Autowired
//    private AutorService autorService;

    @GetMapping("/registrar")
    public String registrar() {
        return "autorform.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) String nombre){

//        try {
//            autorService.crearAutor(nombre, apellido, edad);
//            modelo.put("exito", "El Autor fue guardado exitosamente");
//
//        } catch (miException e) {
//            modelo.put("error", e.getMessage());
//            return "autor_form.html"; //si hay error se regarga la misma pagina
//        }

        return "index.html"; //si no hay errores me manda a la pagina main
    }
}
