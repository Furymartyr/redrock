package com.bjsxt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo04 {
    public static void main(String[] args){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/textjdbc","root","");

            Statement stmt = conn.createStatement();
            //String sql = "insert into t_user (id,username,pwd,regTime) values (5,'赵四',66666,now())";
            //stmt.execute(sql);

            //测试SQL注入
            String sql = "delete from t_user where id=5";
            stmt.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
