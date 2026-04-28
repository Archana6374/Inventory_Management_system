import java.util.Date;

class products {
    public int sku;
    public String name;
    public String category;
    public int unit;
    public int reorderlevel;
    public int current_stock;
    public int supplierid;

    //product catalog 

    public void print_supply() {
        System.out.println("youre now seeing ");
}

    //contrutor 
    public void create_products(int sku, String name, String category, int  unit, int reorderlevel, int supplierid) {
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.unit = unit;
        this.supplierid = supplierid;
        this.reorderlevel = reorderlevel;

    }

    //to update the current_stock

    //stock update code
    /*144- delete 
    143-add */
    public void updateStock(int stock_level, int update_code) {
        if (update_code == 143) {
            current_stock += stock_level;

        } else if (update_code == 144) {
            current_stock -= stock_level;
        }
        if (isLowStock()) {
            // call_for_reorder();

        }

    }

    Date f_date;

    //checked on everystocck update
    public boolean isLowStock() {
        if (current_stock <= reorderlevel) {
            return true;
        }
        return false;

    }

    //will it come here

    // public getStockHistory(){

    // }

}






