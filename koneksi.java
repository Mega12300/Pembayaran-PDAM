package koneksi_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
    private static Connection koneksi;

    public static Connection getkoneksi() {
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/pembayaran_pdam"; //url database
                String user = "root"; //user database
                String pass = ""; //password database
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url, user, pass);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "error koneksi"); //perintah menampilkan error pada koneksi
            }
        }
        return koneksi;
    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
