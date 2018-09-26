package DatabaseManager;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DBMain {
        public static void main(String[] args) throws SQLException {

            DBManager db = new DBManager();

//            System.out.println("Deleted " + db.deleteProductById("1") + " records.");
//
//            Map<String, String> queryParams = new HashMap<>();
//            queryParams.put("product_name", "arbata");
//            queryParams.put("product_price", "3.79");
//            System.out.println("Updated " + db.updateProductName("3", queryParams));

            db.insertValues();
            System.out.println("Done");

    }
}
