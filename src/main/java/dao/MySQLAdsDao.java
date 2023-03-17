package dao;


import models.Ad;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {

    // PROPERTIES //
    private Connection connection;

    // CONSTRUCTORS //
    public MySQLAdsDao() {

    }

    public MySQLAdsDao(Config config) {
        try {
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // INTERFACE METHODS FROM Ads //
    @Override
    public List<Ad> all() {
        String query = "SELECT * FROM ads";
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Ad ad = new Ad(
                        rs.getInt("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")

                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            String query = String.format("INSERT INTO ads (user_id, title, description) VALUES, (%d, %s, %s)",
                    ad.getUserId(),
                    ad.getTitle(),
                    ad.getDescription()
            );
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0L;
    }

    public static void main(String[] args) {
        MySQLAdsDao adsDao = new MySQLAdsDao(new Config());
        System.out.println(adsDao.all());
    }
}
