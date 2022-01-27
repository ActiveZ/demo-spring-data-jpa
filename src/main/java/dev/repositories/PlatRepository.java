package dev.repositories;

import dev.entities.Plat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PlatRepository extends JpaRepository<Plat, Integer> {

//    Optional<Plat> findByNom(String nom); // utilisation de optional si pas de résultat, retourne optional.empty
    Plat findByNom(String nom); // retourne null si pas de résultat
    List<Plat> findByPrix(Integer prix);
    List<Plat> findByNomAndPrix(String nom, Integer prix);

    @Query("SELECT p FROM Plat p WHERE p.prix > :prix ORDER BY p.prix")
    List<Plat> ListePlatsAvecPrixSuperieurA(@Param("prix") Integer prix);
}
