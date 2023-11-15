package gm.Inventarios.servicio;

import gm.Inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
    public List<Producto> listarProductos();
    public Producto buscarProductoPorId(Integer idProducto);
    public Producto guardarProducto(Producto producto);
    public void eliminarProductoPorId(Integer idProducto);
}
