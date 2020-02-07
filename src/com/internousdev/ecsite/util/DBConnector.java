package com.internousdev.ecsite.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
// JDBCのドライバーの名前を変数に代入
	private static String driverName = "com.mysql.jdbc.Driver";

	private static String url =
"jdbc:mysql://localhost/ecsite?autoReconnect=true&useSSL=false";

	private static String user = "root";
	private static String  password = "";

public Connection getConnection() {
	Connection con = null;

try {
Class.forName(driverName);
con = DriverManager.getConnection(url,user,password);
}
//クラスが見つからない場合の例外
catch (ClassNotFoundException e) {
e.printStackTrace();
}
//データベース処理に関する例外?
catch (SQLException e){
e.printStackTrace();
}
return con;
}
}
