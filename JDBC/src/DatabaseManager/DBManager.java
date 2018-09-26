package DatabaseManager;

import java.sql.*;
import java.util.Map;

public class DBManager {
    private Connection connect = null;

    public DBManager() throws SQLException {
        connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?"
                +"user=pauleo&password=CicinasRytis147");
    }
    public void insertValues() throws SQLException {
        Statement st = connect.createStatement();
        st.executeUpdate("INSERT INTO supplier VALUES (6, 'Antonas');");
        st.executeUpdate("INSERT INTO product VALUES (9, 'penktas', 2.89, 5);");
    }
    public int deleteProductById(String id) throws SQLException{
        PreparedStatement ps = connect.prepareStatement("DELETE DROM product WHERE product_id = ?;");
        ps.setString(1, id);
        return ps.executeUpdate();
    }
    public int updateProductName(String id, Map<String, String> columns) throws SQLException{
        int i = 0;
        if(!(columns == null || columns.isEmpty())){
            StringBuilder sb = new StringBuilder("UPDATE product SET ");
            columns.forEach((k,v) -> sb.append(k).append("= '" + v + "',"));
            String query = sb.substring(0, sb.length() - 2).concat(" WHERE product_id = '" + id + "';");
            Statement st = connect.createStatement();
            i = st.executeUpdate(query);
        }
        return i;
    }
}
