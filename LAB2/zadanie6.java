/* Damian Berendt - zadanie 6
Zaimplementuj klasę Invoice reprezentującą fakturę dla sklepu. Klasa przechowuje następujące informacje: product_number (typ String),
 prodcut_description (typ String), quantity(typ int) ipricePerItem(typ double). Klasa powinna mieć konstruktor, który umożliwi podanie
  wszystkich 4 parametrów. Zaimplementuj metody set i get dla każdej zmiennej. Dodaj metodę: -Amount, które zwraca iloczyn quantity i
  pricePerItem. Jeżeli pricePerItem nie jest dodatnia,Amountpowinien zwrócić 0. Jeżeli quantity nie jest dodatnie,Amount` powinna zwrócić 0. Przetestuj zaimplementowany program. */

import java.sql.SQLOutput;

class Invoice {
    String product_number;
    String product_description;
    int quantity;
    double pricePerItem;

    public Invoice(String product_number, String product_description, int quantity, double pricePerItem) {
        setProductNumber(product_number);
        setProductDescription(product_description);
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public double Amount() {
        if (quantity > 0 && pricePerItem > 0) {
            return quantity * pricePerItem;
        } else {
            return 0;
        }
    }

    public String getProductNumber() {
        return product_number;
    }

    public void setProductNumber(String product_number) {
        this.product_number = product_number;
    }

    public String getProductDescription() {
        return product_description;
    }

    public void setProductDescription(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }


}


public class zadanie6 {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("FF15", "Czapka", 100, 15);
        System.out.println("Wyświetlenie stworzonego invoice: ");
        System.out.println(invoice1.getProductNumber() + " " + invoice1.getProductDescription() + " " + invoice1.getQuantity() + " " + invoice1.getPricePerItem());
        System.out.println("Wyświetlenie Amount: ");
        System.out.println(invoice1.Amount());
        invoice1.setPricePerItem(-10);
        System.out.println("Wyświetlenie invoice z zmienionym price per item i wyświetlenie amount:");
        System.out.println(invoice1.getProductNumber() + " " + invoice1.getProductDescription() + " " + invoice1.getQuantity() + " " + invoice1.getPricePerItem());
        System.out.println(invoice1.Amount());
        invoice1.setPricePerItem(10);
        invoice1.setQuantity(-1);
        System.out.println("Wyświetlenie invoice z zmienionym price per item oraz quantity, wyświetlenie amount: ");
        System.out.println(invoice1.getProductNumber() + " " + invoice1.getProductDescription() + " " + invoice1.getQuantity() + " " + invoice1.getPricePerItem());
        System.out.println(invoice1.Amount());

    }

}
