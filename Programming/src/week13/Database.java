package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Database {
	/*Customer [] customers;
	Product [] products;
	Sale [] sales;
	int dimCust=1, dimSal=1, dimPro=1;
	public int searchCustomer(Customer [] param){
		int result=0;
		for (int ii=0; ii<customers.length; ii++){
			if (customers[ii].getName()==param[ii].getName()){
				result=ii;
			}
			else result=-1;
		}
		return result;
	}
	public int searchProduct(Product [] param){
		int result=0;
		for (int ii=0; ii<products.length; ii++){
			if (products[ii].getName()==param[ii].getName()){
				result=ii;
			}
			else result=-1;
		}
		return result;
	}
	public Customer [] addCustomer(){
		customers=new Customer[dimCust];
		Customer [] newCust=new Customer[dimCust+1];
		System.arraycopy(customers, 0, newCust, 0, customers.length);
		return newCust;
	}
	public Sale [] addSales(){
		sales=new Sale[dimSal];
		Sale [] newSal=new Sale[dimSal+1];
		System.arraycopy(sales, 0, newSal, 0, sales.length);
		return newSal;
	}
	public Product [] addPro(){
		products=new Product[dimPro];
		Product [] newPro=new Product[dimPro+1];
		System.arraycopy(products, 0, newPro, 0, products.length);
		return newPro;
	}*/
	//By teacher
	private Customer[] customers;
	private Product[] products;
	private Sale [] sales;
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	//We don't provide set methods as we will use the add ones

	public Product[] getProducts() {
		return products;
	}

	public Sale[] getSales() {
		return sales;
	}
	
	public Database() {
		//We create arrays with 0 positions
		customers = new Customer [0];
		products = new Product [0];
		sales = new Sale [0];
	}
	
	public String toString() {
		String res = "Database [customers=";
		for (int ii=0; ii<customers.length;ii++) {
			res += customers[ii]+"\n";
		}
		res = res+"]\n[products=";
		for (int ii=0; ii<products.length;ii++) {
			res += products[ii]+"\n";
		}
		res = res+"]\n[sales=";
		for (int ii=0; ii<sales.length;ii++) {
			res += sales[ii]+"\n";
		}
		res = res+"]";
		return res;
	}
	public boolean equals(Database another) {
		return (customers.equals(another.customers) && products.equals(another.products)
				&& sales.equals(another.sales));
	}
	
	public int searchCustomer(Customer c) {
		for (int i = 0; i<customers.length; i++) {
			if (c.equals(customers[i]))
				return i;
		}
		return -1;
	}
	public int searchProduct(Product p) {
		for (int i = 0; i<products.length; i++) {
			if (p.equals(products[i]))
				return i;
		}
		return -1;
	}
	public void addCustomer(Customer c) {
		int found = searchCustomer(c);
		if (found == -1) {
			Customer [] customersaux = new Customer [customers.length+1];
			for (int i = 0; i<customers.length; i++) {
				customersaux[i] = customers[i];
			}
			customers = customersaux;
			customers[customers.length-1] = c;
		}
	}
	public void addProduct(Product p) {
		int found = searchProduct(p);
		if (found == -1) {
			Product [] productsaux = new Product [products.length+1];
			for (int i = 0; i<products.length; i++) {
				productsaux[i] = products[i];
			}
			products = productsaux;
			products[products.length-1] = p;
		}
	}
	public void addSale(Sale s) {
		boolean found = false;
		for (int i = 0; i<sales.length; i++) {
				if (s.equals(sales[i]))
					found = true;
		}
		if (!found) {
			Sale [] salesaux = new Sale [sales.length+1];
			for (int i = 0; i<sales.length; i++) {
				salesaux[i] = sales[i];
			}
			sales = salesaux;
			sales[sales.length-1] = s;
		}		
	}
}
