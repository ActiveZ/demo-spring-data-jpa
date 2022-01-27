package dev;

import dev.entities.Plat;
import dev.repositories.PlatRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoSpringDataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoSpringDataJpaApplication.class, args);

        PlatRepository platRepository = context.getBean(PlatRepository.class);

        List<Plat> plats = platRepository.findAll();
        for (Plat p : plats) {
            System.out.println(p);
        }

        // ajoute un plat
        try {
            platRepository.save(new Plat("Sole meunière", 2000));
        } catch (Exception e) {
            System.out.println("Plat déjà dans la liste");
//            e.printStackTrace();
        }

        // recherche du plat "Couscous" (attention à la casse)
		System.out.println(platRepository.findByNom("Couscous"));

        // recherche des plats dont le prix est supérieur à 1500, et affichage en ordre croissant de prix
        System.out.println("plats dont le prix est supérieur à 1500: \n" + platRepository.ListePlatsAvecPrixSuperieurA(1500));
    }
}
