package org.generation.ecommerce.controller;
import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path="/api/productos/")
//@CrossOrigin (origins = "https://github.io/my-app", methods = {RequestMethod.GET, RequestMethod.POST})
public class ProductoController {
	private final ProductoService productoService;

	@Autowired
	public ProductoController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}// constructor
	
	@GetMapping
	public List<Producto> getAllProductos(){
		return productoService.getProductos();
	}// getAllProductos
	
	@GetMapping (path="{prodId}")  // http://localhost:8080/api/productos/1
	public Producto getProducto(@PathVariable("prodId") Long id){
		return productoService.getProducto(id);
	}// getAllProductos

	@DeleteMapping(path="{prodId}")  // http://localhost:8080/api/productos/1
	public Producto deleteProducto(@PathVariable("prodId") Long id){
		return productoService.deleteProducto(id);
	}//deleteProducto
	
	@PostMapping
	public Producto addProducto(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}//addProducto
	
	@PutMapping(path="{prodId}")  // http://localhost:8080/api/productos/1?nombre=n&precio=50
	public Producto updateProducto (@PathVariable("prodId") Long id, 
			@RequestParam (required = false) String nombre,
			@RequestParam (required = false) String descripcion,
			@RequestParam (required = false) String URL_imagen,
			@RequestParam (required = false) Double precio) {
		return productoService.updateProducto(id, nombre, descripcion, URL_imagen, precio);
	}//updateProducto
		
} //class ProductoController