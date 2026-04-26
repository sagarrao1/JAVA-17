package com.sagar.jdbc;

import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hibdb";
        String username= "root";
        String password = "admin";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Driver loaded successfully");
            } catch (ClassNotFoundException e) {
                System.out.println("Failed to load driver: " + e.getMessage());
            }
        Connection con = DriverManager.getConnection(url, username, password);
            if (con != null) {
                System.out.println("Connection established successfully");
            } else {
                System.out.println("Failed to establish connection");
            }
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM hibdb.student;");
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String technology = rs.getString("technology");
            System.out.println("ID: " + id + ", Name: " + name + ", technology: " + technology);
        }
        // insert data into table using prepared statement

        String insertQuery = "INSERT INTO hibdb.student (id, name, technology) VALUES (?, ?,?)";
        PreparedStatement ps = con.prepareStatement(insertQuery);
        ps.setInt(1, 5);
        ps.setString(2, "sagar");
        ps.setString(3, "java");
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Data inserted successfully");
        } else {
            System.out.println("Failed to insert data");
        }


        con.close();
    }
}
