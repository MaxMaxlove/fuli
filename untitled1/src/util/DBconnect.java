package com.util;
import java.sql.*;
public class DBconnect
{
    static String url="jdbc:mysql://localhost:3306/DataTest?useSSL=false";
    static String user="root";
    static String pw = "12345678";
    static Connection conn=null;
    static PreparedStatement ps=null;
    static ResultSet rs=null;
    static Statement st=null;

    public static void init() throws SQLException, ClassNotFoundException {//SQl程序初始化
        try{
            Class.forName("com.mysql.jdbc.Driver");//注册驱动
            conn= DriverManager.getConnection(url, user, pw);  //建立连接
        }catch (Exception e){
            System.out.println("SQL程序初始化失败");
            e.printStackTrace();
        }
    }
