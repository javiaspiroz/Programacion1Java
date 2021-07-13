package week13;

import java.util.Scanner;

/**
 * 
 * @author Javier Aspiroz de la Calle & Borja Arán Tejada
 * @since December 2016
 * @version 1.0
 *
 */

public class Exercise4 {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int answer=0, cus=0, pro=0, sal=0, selectionPro=0, selectionCus;
		do{
			Database db=new Database();
			System.out.println("Select your option:");
			System.out.println("1. Add a new product.");
			System.out.println("2. Add a client.");
			System.out.println("3. Add a sale.");
			System.out.println("4. Print sales");
			System.out.println("5. Quit");
			answer=sc.nextInt();
			if(answer==1){
				System.out.println("Enter the name, stock and price of the product.");
				db.getProducts()[pro].setName(sc.next());
				db.getProducts()[pro].setPrice(sc.nextFloat());
				db.getProducts()[pro].setStock(sc.nextInt());
				pro++;
			}
			else if(answer==2){
				System.out.println("Enter the name, email, password and money of the client.");
				db.getCustomers()[cus].setName(sc.next());
				db.getCustomers()[cus].setEmail(sc.next());
				db.getCustomers()[cus].setPassword(sc.next());
				db.getCustomers()[cus].setMoney(sc.nextDouble());
				cus++;
			}
			else if(answer==3){
				int jj=0;
				System.out.println("The customers of the store are:");
				for(int ii=0; ii<db.getCustomers().length; ii++){
					System.out.println(ii+". "+db.getCustomers()[ii].toString());
				}
				System.out.println("The products of the store are:");
				for(int ii=0; ii<db.getProducts().length; ii++){
					System.out.println(ii+". "+db.getProducts()[ii].toString());
				}
				System.out.println("What do you want to buy and which one wants it? (with the numbers please)");
				selectionPro=sc.nextInt();
				selectionCus=sc.nextInt();
				for (int ii=0; ii<db.getCustomers().length; ii++){
					if (ii==selectionPro){
						if (db.getCustomers()[ii].getMoney()<db.getProducts()[selectionPro].getPrice()){
							System.out.println("You dont have enough money.");
						}
						else{
							db.getCustomers()[ii].setMoney(db.getCustomers()[ii].getMoney()-db.getProducts()[selectionPro].getPrice());;
						}
					}
				}
				db.getProducts()[selectionPro].setStock(db.getProducts()[selectionPro].getStock()-1);
				sal++;
			}
			else if(answer==4){
				for (int ii=0; ii<db.getSales().length; ii++){
					System.out.println(db.getSales()[ii].customer.getName()+" bougth a "+db.getSales()[ii].product.getName()+" by "+db.getSales()[ii].product.getPrice()+"€");
				}
			}			
			else if (answer==5){
				System.out.println("Thanks for using the program");
			}
			else{
				System.out.println("You didn't selected a suitable option. Choose another one, please.");
			}
		}
		while(answer!=5);		
		sc.close();
	}*/
	private static void addSale(Database database, int clientchoice, int productchoice) {
		if (clientchoice>=0 && clientchoice<database.getCustomers().length 
				&& productchoice>=0 && productchoice < database.getProducts().length) {
			if (database.getCustomers()[clientchoice].getMoney()
					>=database.getProducts()[productchoice].getPrice()){
				Customer cust = database.getCustomers()[clientchoice];
				Product pro = database.getProducts()[productchoice];
				Sale s = new Sale (pro,cust);
				database.addSale(s);
				cust.setMoney(cust.getMoney()-pro.getPrice());
			}
			else {
				System.out.println("The user has no money to buy the product!");
			}
		}
		else {
			System.out.println("No such product/customer");
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		Database database = new Database();
		int choice;
		do {
			System.out.println("\n1. Add a product.");
			System.out.println("2. Add a client.");
			System.out.println("3. Add a sale.");
			System.out.println("4. Print sales.");
			System.out.println("5. Quit.");
			System.out.println("\nWhat do you want to do?");
			choice = sc.nextInt();

			switch (choice) {
			case 1: System.out.println("Enter the name, price and stock of the product:");
			Product p = new Product(sc.next(), sc.nextInt(), sc.nextFloat());
			database.addProduct(p);
			break;
			case 2: System.out.println("Enter the name, email, password and money of the customer:");
			Customer c = new Customer(sc.next(), sc.next(), sc.next(), sc.nextDouble());
			database.addCustomer(c);
			break;
			case 3:	
				if (database.getCustomers().length > 0 && database.getProducts().length > 0) {
					System.out.println("Which client are you?:");
					for (int ii=0; ii<database.getCustomers().length; ii++)
						System.out.println(ii+":"+database.getCustomers()[ii]);
					int clientchoice = sc.nextInt();
					System.out.println("Which product do you want?:");
					for (int ii=0; ii<database.getProducts().length; ii++)
						System.out.println(ii+":"+database.getProducts()[ii]);
					int productchoice = sc.nextInt();
					addSale(database, clientchoice,productchoice);
				}
				else
					System.out.println("Error. No clients/products registered."); 
				break;
			case 4: 
				if (database.getSales().length > 0)
					for (int ii=0; ii<database.getSales().length; ii++)
						System.out.println(ii+":"+database.getSales()[ii]);
				else
					System.out.println("No sales registered.");
				break;
			case 5: System.out.println("Thanks for shopping.");;
			break;
			default: System.out.println("Only 1-5.");
			}
		} while (choice!=5);
		sc.close();
	}
}