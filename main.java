import java.util.*;



public class main {
  

    public static void main(String args[]) {

        products p1 = new products();
        products p2 = new products();
        products p3 = new products();
        products p4 = new products();
       // products p5 = new products();

        p1.create_products(102, "tomato", "vegtables", 100, 25, 002);
        p2.create_products(100, "biscuits", "food", 100, 20, 001);
        p3.create_products(101,"coke","soft-drinks",100,20,001);
        p4.create_products(103, "potato", "vegtables", 100, 26, 002);
        
        warehouse wh1 = new warehouse();
        wh1.wh_id = 001;
        wh1.name = "warehouse1";
        wh1.location = "chennai";
       // p1.create_products( 102, "tomato", "vegtables", 100, 25, 002);
          Scanner in = new Scanner(System.in);
while (true) {
    System.out.println("enter the code of your access :\n1.warehouse staff\n2.supplier\n3.store manager\n4.exit");
    int u_code = in.nextInt();
    if (u_code == 1) {
        while(true){
        System.out.println("You're now logged in as warehouse staff.");
        System.out.println("Enter the sku code for the product to add:");
        int sku = in.nextInt();
        System.out.println("enter the stock increase amount: ");

        int s_inc = in.nextInt();
        if (p1.sku == sku) {
            
            p1.current_stock += s_inc;
            System.out.println("The increses amount is " + p1.current_stock);
        } 
        else if (p2.sku == sku)
        {
            p2.current_stock += s_inc;
            System.out.println("The increses amount is " + p2.current_stock);
            
           }
        else if (p3.sku == sku)
        {p3.current_stock += s_inc;
        System.out.println("The increses amount is " + p3.current_stock);}
        else if (p4.sku == sku)
        {p4.current_stock += s_inc;
        System.out.println("The increses amount is " + p4.current_stock);}
        else {
            System.out.println("The sku entered doesn't exsists");
        }

        System.out.println("The stock for product is increses by " + s_inc);
        System.out.println("Exit enter 1 or enter 0 to continue");
        int code = in.nextInt();
        if (code == 0) {
            break;
        }
    }

    }
    else {
        System.out.println("Thanks for engaging");
        return;
    }
}

    }
    
}
