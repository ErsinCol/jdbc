import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    static String userName="root";
    static String password="Ersin1905.";
    static String dbUrl="jdbc:mysql://localhost:3306/world";
    public static void main(String[] args) throws SQLException {
        Connection connection=null;
        try {
            connection=DriverManager.getConnection(dbUrl,userName,password);
            System.out.println("Bağlantı sağlandı...");
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            connection.close();
        }



	/*
	        jdbc java database connectivity
	            bir pakettir
	            hemen hemen tüm veritabanlarına sorgular gönderilir
	            jdbc ile db arasına driver eklenir oracle mysql sqlserver gibi
	            java programlama dili ile yazılmış uygulamaların veritabanı ile etkileşime girmesini sağlayan
	            bir arayüzdür

                external harici demektir dışardan veritabanımızı entegre etmemiz gerekiyor
                file->project structers->modules->dependencies->...........
                menüsünden eklememiz lazım jar dosyasını java arşiv dosyası

                veritabanına bağlantı sağlamamız için driver manager sınıfının getConnection methodunu kullanıcaz
                bu method bizden üç bilgi ister kullanıcı adı şifre bağlatı url i bu bağlantıyı tutması için connection sınıfından
                bir değişken oluşturcaz

	            crud
	            create  insert
	            read    select
	            update
	            delete
	 */



    }
}
