package org.generation.ecommerce.service;
import org.generation.ecommerce.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}// interface ProductoRepository