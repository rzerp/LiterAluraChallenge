package com.mixidev.literalurachallenge;

import com.mixidev.literalurachallenge.principal.MenuPrincipal;
import com.mixidev.literalurachallenge.repositorio.AutorRepository;
import com.mixidev.literalurachallenge.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiterAluraChallengeApplication implements CommandLineRunner {
    @Autowired
    private LibroRepository libroRepository;
    @Autowired
    private AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(LiterAluraChallengeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MenuPrincipal menu = new MenuPrincipal(libroRepository, autorRepository);
        menu.showMenu();
    }
}
