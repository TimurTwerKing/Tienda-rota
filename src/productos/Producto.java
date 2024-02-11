/**
 * 
 */
package productos;

/**
 * @author Timur Bogach
 * @date 11 feb 2024
 * 
 * 
 *       Clase Producto: Contiene métodos para la gestion de productos.
 */

public class Producto {
	private String nombre;
	private Float precioUn;
	private Integer cantidad;
	private Boolean stock;

	public void mostrarDatos() {
		System.out.println(
				"\t[nombre=" + nombre + ", precioUn=" + precioUn + ", cantidad=" + cantidad + ", stock=" + stock + "]");
	}

	/**
	 * @param nombre
	 * @param precioUn
	 * @param cantidad
	 * @param stock
	 */
	public Producto(String nombre, Float precioUn, Integer cantidad, Boolean stock) {
		this.nombre = nombre;
		this.precioUn = precioUn;
		this.cantidad = cantidad;
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPrecioUn() {
		return precioUn;
	}

	public void setPrecioUn(Float precioUn) {
		this.precioUn = precioUn;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	/**
	 * TODO implementar si la cantidad es 0 el stock sea null y viceversa
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Boolean getStock() {
		return stock;
	}

	public void setStock(Boolean stock) {
		this.stock = stock;
	}
}
