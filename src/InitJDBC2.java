import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : cunyu
 * @version : 1.0
 * @className : InitJDBC
 * @date : 2021/4/23 10:56
 * @description : 初始化并建立连接
 */

public class InitJDBC2 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
//            初始化，注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
//            建立连接
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalearning?characterEncoding=UTF-8", "root", "root");
            System.out.println("连接成功！");
//            创建 Statement 用于执行 SQL 语句
            statement = connection.createStatement();
            System.out.println("Statement 对象：" + statement);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}