package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;
import static java.sql.DriverManager.*;

/*
测试跟数据库建立连接
 */
public class Demo01 {
    public static void main(String[] args){
        //加载驱动类
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //建立连接
            Connection conn = getConnection("jdbc:mysql://localhost:3306/textjdbc","root","");
            System.out.println(conn);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
