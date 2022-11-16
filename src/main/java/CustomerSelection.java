import javax.sql.rowset.Predicate;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerSelection {
    Double shoppingCartTotal;
    HashMap<String,Integer> shoppingCart=new HashMap<String, Integer>();
    Scanner input = new Scanner(System.in);

    //to encapsulate variables
    public Double getShoppingCartTotal() {return shoppingCartTotal;    }
    public void setShoppingCartTotal(Double shoppingCartTotal) {this.shoppingCartTotal = shoppingCartTotal;    }
    public HashMap<String, Integer> getShoppingCart() {return shoppingCart;    }
    public void setShoppingCart(HashMap<String, Integer> shoppingCart) {this.shoppingCart = shoppingCart;    }
    public Scanner getInput() {return input;    }
    public void setInput(Scanner input) {this.input = input;    }


    //Money Formatter
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");



    private Double addingProductPrize (double prize, double amount) {
        shoppingCartTotal+=prize*amount;
        return shoppingCartTotal;
    }

    private Double substractProoductPrize (double prize, double amount) {
        shoppingCartTotal -= prize * amount;
        return shoppingCartTotal;
    }

    private HashMap addingProductToCart(String product, Integer amount){
        if (shoppingCart.get(product)!=0){
            shoppingCart.replace(product,shoppingCart.get(product)+amount);
        }
        shoppingCart.putIfAbsent(product, amount);

        return shoppingCart;
    }

    private HashMap removeProductToCart (String product, Integer amount){
        if (amount==shoppingCart.get(product)){
            shoppingCart.remove(product);
        }
        shoppingCart.replace(product,shoppingCart.get(product)-amount);

        return shoppingCart;
    }







}
