package homework;
import com.mysql.jdbc.Connection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Queries {

    public static void createNewTable() throws IOException{

        File schemeFile = new File("resources/db_scheme");
        BufferedReader bfrS = new BufferedReader(new FileReader(schemeFile));
        String dataS;
        List<String> schemeContent = new ArrayList<>();

        while((dataS = bfrS.readLine()) != null){
            String[] getDataS = dataS.split("\\|");
                for(String s: getDataS){
                    schemeContent.add(s);
                    if(s == null) s.equals("NULL");
            }
        }
        System.out.println("Scheme: " + schemeContent);

        File dataFile = new File("resources/db_data");
        BufferedReader bfrD = new BufferedReader(new FileReader(dataFile));
        String dataD;
        List<String> dataContent = new ArrayList<>();

        while((dataD = bfrD.readLine()) != null){
            String[] getDataD = dataD.split("\\|");
            for(String d: getDataD){
                dataContent.add(d);
                if(d == null) d.equals("NULL");
            }
        }
        System.out.println("Data: " + dataContent);

        String url = "jdbc:mysql://localhost:3306/homework?"
                + "user=pauleo&password=CicinasRytis147";

        //sets table scheme values
        String createTable = new StringBuilder()
                .append("CREATE TABLE " + schemeContent.get(0) + " (")
                .append(schemeContent.get(2))
                .append(" " + schemeContent.get(3))
                .append(" " + schemeContent.get(4))

                .append(",")

                .append(" " + schemeContent.get(5))
                .append(" " + schemeContent.get(6))
                .append(" " + schemeContent.get(7))

                .append(",")

                .append(" " + schemeContent.get(8))
                .append(" " + schemeContent.get(9))

                .append(",")

                .append(" " + schemeContent.get(12))
                .append(");").toString();

        System.out.println(createTable);

        String insertFirstRowData = new StringBuilder()
                .append("INSERT INTO " + schemeContent.get(0))
                .append("(" + schemeContent.get(2) + ", " + schemeContent.get(5) + ", " + schemeContent.get(8) + ") VALUES(")
                .append(dataContent.get(0) + ",")
                .append(" '" + dataContent.get(5) + "',")
                .append(" " + dataContent.get(10))
                .append(");").toString();

        String insertSecondRowData = new StringBuilder()
                .append("INSERT INTO " + schemeContent.get(0))
                .append("(" + schemeContent.get(2) + ", " + schemeContent.get(5) + ", " + schemeContent.get(8) + ") VALUES(")
                .append(dataContent.get(1) + ",")
                .append(" '" + dataContent.get(6) + "',")
                .append(" " + dataContent.get(11))
                .append(");").toString();

        String insertThirdRowData = new StringBuilder()
                .append("INSERT INTO " + schemeContent.get(0))
                .append("(" + schemeContent.get(2) + ", " + schemeContent.get(5) + ", " + schemeContent.get(8) + ") VALUES(")
                .append(dataContent.get(2) + ",")
                .append(" '" + dataContent.get(7) + "',")
                .append(" " + dataContent.get(12))
                .append(");").toString();

        String insertFourthRowData = new StringBuilder()
                .append("INSERT INTO " + schemeContent.get(0))
                .append("(" + schemeContent.get(2) + ", " + schemeContent.get(5) + ", " + schemeContent.get(8) + ") VALUES(")
                .append(dataContent.get(3) + ",")
                .append(" '" + dataContent.get(8) + "',")
                .append(" " + dataContent.get(13))
                .append(");").toString();

        String insertFifthRowData = new StringBuilder()
                .append("INSERT INTO " + schemeContent.get(0))
                .append("(" + schemeContent.get(2) + ", " + schemeContent.get(5) + ", " + schemeContent.get(8) + ") VALUES(")
                .append(dataContent.get(4) + ",")
                .append(" '" + dataContent.get(9) + "',")
                .append(" " + dataContent.get(14))
                .append(");").toString();
        try (

                Connection conn = (Connection) DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            // creates table
            stmt.execute(createTable);
            stmt.execute(insertFirstRowData);
            stmt.execute(insertSecondRowData);
            stmt.execute(insertThirdRowData);
            stmt.execute(insertFourthRowData);
            stmt.execute(insertFifthRowData);
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}