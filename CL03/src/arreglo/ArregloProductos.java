package arreglo;

import java.util.ArrayList;
import clase.Producto;



public class ArregloProductos {
	
	private ArrayList <Producto> pro;
	
	public ArregloProductos() {
		pro = new ArrayList<Producto>();
	}
	
	public void adicionar(Producto x) {
		pro.add(x); 
		
	}
	
	public int tamanio() {
		return pro.size();
				
	}
	
	public Producto obtener(int i) {
		return pro.get(i);
	}
	
	public Producto buscar(int codigo) {
		for (int i = 0; i < tamanio(); i++) {
			if(obtener(i).getCodigo() == codigo)
				return obtener(i);
		}
		return null;
	}
	
	public void  eliminar(Producto x) {
		pro.remove(x); 		
	}
	
	
	public int pMayorStock() {
		int mayor = obtener(0).getStock();
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getStock() > mayor )
				mayor = obtener(i).getStock();
		}
		return mayor;		
	}
	
	
	//Espara que salga la descripcion del producto
	public String productoMayorStock() {
		int psMayor = obtener(0).getStock();
		String desc = obtener(0).getDescripcion();
		for (int i = 0; i < tamanio(); i++) {
			if(obtener(i).getStock() > psMayor) {
				psMayor = obtener(i).getStock();
				desc = obtener(i).getDescripcion();
			}			
		}
		return desc;
	}
		
		
		
	
	public int pMenorStock() {
		int menor = obtener(0).getStock();
		for (int i = 0; i < tamanio(); i++) {
			if (obtener(i).getStock() < menor )
				menor = obtener(i).getStock();
		}
		return menor;
	}
	
	//Espara que salga la descripcion del producto
	public String productoMenorStock() {
		String desc = obtener(0).getDescripcion();
		int psMenor = obtener(0).getStock();
		for (int i = 0; i < tamanio(); i++) {
			if(obtener(i).getStock() < psMenor) {
				psMenor = obtener(i).getStock();
				desc = obtener(i).getDescripcion();
			}	
		}
		return desc;
	}
	
	public double sumaPrecioProducto() {
		double precio = obtener(0).getPrecio();
				return precio * tamanio();
		
	}
	
	public double promedioPrecioProducto() {
		double promedio = 0;
		for (int i = 0; i < tamanio(); i++) {
			promedio = promedio + obtener(i).getPrecio();
		}
		return promedio / tamanio();
		
		
		
	}






}
