package com.acquisio.basic.java.question09;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * QUESTION 09: Streams (https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
 * Using JDK8 Streams, add the code to transform the input file to apply those rules.
 * 1- Filter out lines where the amount is lower than 50$
 * 2- Add a Taxes column right after the Amount column, which is 15% of the Amount.
 * 3- Add a Total column right after the Taxes column, which is the sum of Amount and Taxes.
 * 4- Remove the ShoppingCartTitle columns.
 * <p>
 * The input file contains those columns
 * User,Amount,ShoppingCartTitle,NbItems
 * <p>
 * IMPORTANT: Add all missing javadoc that you think is necessary.
 */
public class Streams {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Streams instance = new Streams();
        File input = new File(Thread.currentThread().getContextClassLoader().getResource("./carts.csv").toURI());
        File output = new File("./carts_output.csv");
        output.delete();

        instance.convertCarts(input, output);

        if (output.exists()) {
            Files.lines(output.toPath()).forEachOrdered(line -> System.out.println(line));
        }
    }

    /**
     * ConvertCarts 
     * @param input file to read from
     * @param output file to write to
     * @throws IOException
     */
    private void convertCarts(File input, File output) throws IOException {
        // TODO: Insert your code here.
    	
    	
    	Files.lines(input.toPath())
    	.map(line ->mapToItem(line))
    	.filter(data -> data.getAmount()<50.0)
    	.forEach(data->writeToFile(data,output));
    
    }

    /**
     * This method writes to the output file 
     * @param data input file data
     * @param output file to write to
     */
 public  void writeToFile(CartItems data, File output )
 {
	 
	 try(BufferedWriter write = new BufferedWriter(new FileWriter(output))) {
		write.write(data.getUser()+","+data.getAmount()+","+data.getNbItems()+","+data.getTaxes()+","+data.getTotal()+"\n");
	
		write.flush();
		write.close();
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
 }
 /**
  * To method maps each line to an item
  * @param line CSV record line
  * @return an object of item
  */
    public  CartItems mapToItem(String line){
    	String delimitor = ",";
    	  String[] p = line.split(delimitor);
    	  CartItems item = new CartItems();
    	  item.setUser(p[0]);
    	  item.setAmount(Double.parseDouble(p[1]));
    	  item.setNbItems(p[3]);
    	  item.setTaxes();
    	  item.setTotal();
    	  return item;
    	};

}

/**
 * iCartItem class to hold the line data 
 * @author Ekow-Daniels
 *
 */
 class CartItems {
	 private String User;
	 private double Amount;
	 private String NbItems;
	 private double taxes;
	 
	 private double Total;
	
	 
	 public double getTaxes() {
		return taxes;
	}
	public void setTaxes() {
		this.taxes = this.getAmount()*0.15;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
	public String getNbItems() {
		return NbItems;
	}
	public void setNbItems(String nbItems) {
		NbItems = nbItems;
	}
	public double getTotal() {
		return Total;
	}
	public void setTotal() {
		Total = this.getAmount()+this.getTaxes();
	}
	 
	 
	
}
