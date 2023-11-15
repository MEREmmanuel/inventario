package gm.Inventarios.repositorio;

import gm.Inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository <Producto, Integer> {
}
