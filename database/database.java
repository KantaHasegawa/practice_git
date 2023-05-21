package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
    // ドライバーのクラス名
    private static final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    // JDMC接続先情報
    private static final String JDBC_CONNECTION = "jdbc:mysql://localhost:3306/test";
    // ユーザー名
    private static final String USER = "root";
    // パスワード
    private static final String PASS = "";
    // 接続先の情報を null
    Connection connection = null;
    // 問い合わせ取得結果を null
    Statement statement = null;
    // 実行結果のデータを　null
    ResultSet resultSet = null;
    public void connect() {
      // データベースに接続する準備。
      // Class.forName()メソッドにJDBCドライバ名を与えJDBCドライバをロード
      Class.forName(MYSQL_DRIVER);
      // 接続先の情報。引数:「JDMC接続先情報」,「ユーザー名」,「パスワード」
      // connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
    }
}
