import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class CustomerSelection {
    Double shoppingCartTotal;







    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    private Double addingProduct (double prize){
        Double amount = 0.0;
        shoppingCartTotal+=prize*amount;
        return shoppingCartTotal;
    }

    private Double substractProoduct (double prize, double amount) {
        shoppingCartTotal -= prize * amount;
        return shoppingCartTotal;
    }

}
