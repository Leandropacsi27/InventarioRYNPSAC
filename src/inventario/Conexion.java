package inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection cn;
    
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/rynpsac","root","");
            JOptionPane.showMessageDialog(null, "La conexion a la base de datos fue exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La conexion a la base de datos no fue exitosa"+ e.toString());
        }
        return cn;
    }
}
