package model;

public class Sale {

	private static final int ASEO = 0;
	private static final int VIVERES = 0;
	private static final boolean LICORES = false;
	public Product produc;
	public int cont;
	
	public Sale(Product produc, int cont) {
		this.produc = produc;
		this.cont = cont;
	}

	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Product getProduc() {
		return produc;
	}

	public void setProduc(Product produc) {
		this.produc = produc;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public double calcDiscount() {
		
		double discount=0;
		if (cont<5 && cont>0) {
			return	produc.getValue();
		}else if (cont >=5 && cont <= 10) {
		   discount = (produc.getValue()* cont)*0.05;
			
		}else if (cont>=11 && cont <=20) {
			discount = (produc.getValue()* cont)*0.1;
			
		}else if (cont>=21 && cont<=50) {
			discount=(produc.getValue()*cont)*0.15;
			
		}else if(cont>=50) {
			discount = (produc.getValue()*cont )* 0.3;
		}
		return (produc.getValue()*cont)- discount;
	}

	private static double getValue() {
		return 0;
	}

	private static int getTypeProduct() {
		return 0;
	}
	
	
	
}

