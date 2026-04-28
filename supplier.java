
import java.util.*;
public class supplier {
    public int supplierid;
    public String name;
    public int contact;
    public String email;
    public int lead_time_days;
    public List<products> product_list = new ArrayList<>();
    // products p1=new products(102,"tomato","vegtables",100,25,002);

    public void create_supplier(supplier e, int su_id, String name, int contact, String email, int lead_time_days,
            List<products> p_list) {
        e.supplierid = su_id;
        e.name = name;
        e.contact = contact;
        e.email = email;
        e.lead_time_days = lead_time_days;
        e.product_list = p_list;

    }
   
    public void create_po(int po_id, int supplier_id, String items[], Date created_date, Date approved_date) {

        

    }
    
    public void get_delivery_history() {
        
    }

    


}
