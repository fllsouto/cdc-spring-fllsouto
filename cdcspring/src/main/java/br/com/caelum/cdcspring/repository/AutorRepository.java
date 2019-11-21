package br.com.caelum.cdcspring.repository;

import br.com.caelum.cdcspring.model.Autor;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AutorRepository extends Repository<Autor, Long> {
    Autor save(Autor autor);
    List<Autor> findAll();
}
