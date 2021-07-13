package week13;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Sale {
	Product product;
	Customer customer;
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Sale(Product product, Customer customer) {
		setProduct(product);
		setCustomer(customer);
	}
	public String toString() {
		return "Sale [" + product + ",\n" + customer + "]";
	}
	public boolean equals(Sale another) {
		return (product.equals(another.product) && customer.equals(another.customer));
	}
}