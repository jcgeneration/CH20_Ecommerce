package org.generation.ecommerce.service;
import java.util.List;
import org.generation.ecommerce.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductoService {
	private final ProductoRepository productoRepository;
	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		super();
		this.productoRepository = productoRepository;
	}//constructor
	public List<Producto> getProductos(){
		return productoRepository.findAll();
	}//getProductos
	
	public Producto getProducto(Long id){
		return productoRepository.findById(id).orElseThrow(
			()->new IllegalArgumentException("El Producto con el id " + id +" no existe.")
		);
	}//getProducto
	
	public Producto deleteProducto (Long id) {
		Producto tmpProd = null;
		if (productoRepository.existsById(id)) {
			tmpProd = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}//if exist
		return tmpProd;
	}//deleteProducto
	public Producto addProducto(Producto producto) {
		return productoRepository.save(producto);
	}//addProducto
	public Producto updateProducto(Long id, String nombre, String descripcion, 
		String URL_imagen, Double precio) {
		Producto tmpProd = null;
		if (productoRepository.existsById(id)) {
			tmpProd = productoRepository.findById(id).get();
			if (nombre!=null) tmpProd.setNombre(nombre);
			if (descripcion!=null) tmpProd.setDescripcion(descripcion);
			if (URL_imagen!=null) tmpProd.setURL_imagen(URL_imagen);
			if (precio!=null) tmpProd.setPrecio(precio.doubleValue());
			productoRepository.save(tmpProd);
		} else {
			System.out.println("Update - El Producto con el id " + id + "no existe.");
		}//if exist
		return tmpProd;
	}// updateProducto
}//class ProductoService
