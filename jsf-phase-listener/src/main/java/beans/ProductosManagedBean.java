package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import model.Producto;

@ManagedBean(name="productosManagedBean", eager = true)
@ViewScoped
public class ProductosManagedBean implements Serializable {
	private List<Producto> productos;
	private Producto producto;
	
	@PostConstruct
	public void init() {
		System.out.println("ProductosManagedBean.init()");
		productos = new ArrayList<Producto>();
		producto = new Producto();
	}
	
	public String agregarProducto() {
		System.out.println("ProductosManagedBean.agregarProducto()");
		productos.add(producto);
		producto = new Producto();
		return "";
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
