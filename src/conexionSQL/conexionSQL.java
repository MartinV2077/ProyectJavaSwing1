
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
      try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/redflix107","root","Admin123");
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
            
        }
      return conectar;
  }
}