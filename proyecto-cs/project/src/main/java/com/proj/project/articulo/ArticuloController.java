package com.proj.project.articulo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/articulo")
public class ArticuloController {
    @GetMapping
    public List<Articulo> getArticulos(){
        return List.of(
                new Articulo(
                     "m1",
                     "maleta",
                     "targus",
                     "20231",
                     "negro",
                     "unidades",
                     1,
                     2
                )
        );
    }

}
