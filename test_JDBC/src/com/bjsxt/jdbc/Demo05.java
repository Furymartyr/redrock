package com.bjsxt.jdbc;

import java.sql.*;

/**
 * PreparedStatement的基本用法
 */
public class Demo05 {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/textjdbc"
                    ,"root","");

            String sql = "insert into t_user1 (username,pwd,regTime) values (?,?,?)";// ？：占位符
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,"高淇5");//1指第一个？（参数索引不是从0开始算，是从1开始）
            ps.setString(2,"234567");
            //可以用setObject传参
            ps.setObject(3,new Date(System.currentTimeMillis()));

//            ps.setObject(1,"高淇2");
//            ps.setObject(2,"123456");
            ps.execute();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
