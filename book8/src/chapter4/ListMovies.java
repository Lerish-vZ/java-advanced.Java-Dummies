package chapter4;

import java.sql.*;
import java.text.NumberFormat;

public class ListMovies {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        ResultSet movies = getMovies();

        try {
            while(movies.next()){
                Movie m = getMovie(movies);
                String msg = Integer.toString(m.year);
                msg += ": " + m.title;
                msg += " (" + cf.format(m.price + ")");
                System.out.println(msg);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static ResultSet getMovies() {
        Connection con = getConnection();

        try {
            Statement s = con.createStatement();
            String select = "Select title, year, price from movie order by year";
            ResultSet rows;
            rows = s.executeQuery(select);
            return rows;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    
}
