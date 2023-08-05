package presenter;
import model.*;
public class Presenter {
	
	public ETypeProduct etp;
	public ServiceSale service;
	public Presenter(){
		
	}
	
	public Presenter(ETypeProduct etp, ServiceSale service) {
		super();
		this.etp = etp;
		this.service = service;
	}

	public String p1() {
	
		Product milk = new Product();
		milk.setName("Milk");
		milk.setValue(1.500);
		milk.seteTypeProduct(etp.VIVERES);
		return "Product: "+ milk.getName() + "value: " + service.calcIva();
	}
	
	public String p2() {
		
		Product whisky = new Product();
		whisky.setName("Whisky");
		whisky.setValue(80.000);
		whisky.seteTypeProduct(etp.LICORES);
		return "Product: "+ whisky.getName() + "value: " + service.calcIva();
	}
	
	public String p3() {
		
		Product aspirin = new Product();
		aspirin.setName("Aspirin");
		aspirin.setValue(1.000);
		aspirin.seteTypeProduct(etp.MEDICINAS);
		return "Product: "+ aspirin.getName() + "value: " + service.calcIva();
	}
	
	public String p4() {
		
		Product deodorant = new Product();
		deodorant.setName("Deodorant");
		deodorant.setValue(16.000);
		deodorant.seteTypeProduct(etp.ASEO);
		return "Product: "+ deodorant.getName() + "value: " + service.calcIva();
	}
	
	public String p5() {
		
		Product bread = new Product();
		bread.setName("Bread");
		bread.setValue(500);
		bread.seteTypeProduct(etp.VIVERES);
		return "Product: "+ bread.getName() + "value: " + service.calcIva();
	}
	
	public String p6() {
		
		Product pancake = new Product();
		pancake.setName("Pancake");
		pancake.setValue(8.000);
		pancake.seteTypeProduct(etp.VIVERES);
		return "Product: "+ pancake.getName() + "value: " + service.calcIva();
	}
}

