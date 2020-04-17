package com.xll.juc.tl;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *  ThreadLocal使用方法案列
 */
public class UserDao {

    private ThreadLocal<Connection> connectionThreadLocal = new ThreadLocal<>();

    public Connection getConnection() {

        Connection connection = connectionThreadLocal.get();

        if (connection == null) {
            connection = ConnectionManager.getConnection();
            connectionThreadLocal.set(connection);
        }
        return connection;
    }
}


/**
 *  模拟连接数据库
 */
class ConnectionManager {
    static String url = "";
    static String user = "";
    static String password = "";
    public static Connection getConnection() {
        try {
            DriverManager.getConnection(url, user, password);
        } catch (Exception e) {

        }
        return null;
    }


}
