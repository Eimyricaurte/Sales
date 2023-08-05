package model;

public class Product {

	private String name;
	private double value;
	private int stock;
	private boolean iva;
	public ETypeProduct eTypeProduct;
	
	public static final int STOCK_MIN=10;
	public Product(String name, double value, int stock, boolean iva) {
		super();
		this.name = name;
		this.value = value;
		this.stock = stock;
		this.iva = iva;
	}
	public Product() {

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isIva() {
		return iva;
	}
	public void setIva(boolean iva) {
		this.iva = iva;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + ", stock=" + stock + ", iva=" + iva + "]";
		
	}
	
	public ETypeProduct geteTypeProduct() {
		return eTypeProduct;
	}
	public void seteTypeProduct(ETypeProduct eTypeProduct) {
		this.eTypeProduct = eTypeProduct;
	}
}

