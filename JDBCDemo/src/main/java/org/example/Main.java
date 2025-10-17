package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Class.forName("org.postgresql.Driver");
        } catch(ClassNotFoundException e) {
            System.out.println("Postgressql Driver not found "+e);
        }

        String url = "jdbc:postgresql://localhost:5432/demo";
        String uname = "postgres";
        String pword = "7354023";
        String sql = "insert into student values (?,?,?)";

        Connection conn;

        try {
            conn = DriverManager.getConnection(url, uname, pword);
            PreparedStatement st = conn.prepareStatement(sql);

            st.setInt(1, 6);
            st.setString(2, "Noa");
            st.setInt(3, 1000);

            st.execute();
            conn.close();
        }catch(SQLException e) {
            System.out.println("Error while performing operations on sql "+e);
        }

    }
}