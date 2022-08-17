package pl.wiktorowski.rectangleapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FigureApi {

@GetMapping("/calculate")
    public int calculate (@RequestParam){




}}
