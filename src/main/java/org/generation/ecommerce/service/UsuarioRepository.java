package org.generation.ecommerce.service;
import java.util.Optional;
import org.generation.ecommerce.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	@Query("SELECT u FROM Usuario u WHERE u.username=?1")  // JPQL
	Optional<Usuario> findByUsername(String username);
}// interface Usuario Repository