package model;

public class ServiceSale {

	public Product product;
	public Sale nsale;
	public int sale;
	public ServiceSale(Product product, int sale) {
		super();
		this.product = product;
		this.sale = sale;
	}
	public ServiceSale() {
		
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}
	
	public double calcIva() {
		if (product.isIva()== true) {
			
			double valIva = switch(product.geteTypeProduct()) {
			case ASEO -> nsale.calcDiscount() * 0.14;
			case VIVERES -> nsale.calcDiscount() * 0.8;
			case LICORES -> nsale.calcDiscount() * 0.19;
			case RANCHO -> nsale.calcDiscount() * 0.19;
			default -> nsale.calcDiscount();
			};
		}
		return 0;
		
	}
}