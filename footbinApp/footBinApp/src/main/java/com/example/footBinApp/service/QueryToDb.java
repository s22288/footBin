package com.example.footBinApp.service;

import com.example.footBinApp.entities.League;
import com.example.footBinApp.entities.Player;
import com.example.footBinApp.service.interfaces.QueryToDbMethods;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class QueryToDb implements QueryToDbMethods {
    // driver do bazy danych


  // url do bazy danych
 private final String myUrl = "jdbc:mysql://localhost/footBin";

    @Override
    public List<League> getLeagues() {
        try {


            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
            // zapytanie do bazy danych

            String query = "SELECT * FROM League";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // iterate through the java resultset
            while (resultSet.next()) {
                int leagueId = resultSet.getInt("leagueId");
                String firstName = resultSet.getString("name");
                String country = resultSet.getString("country");
                Date dateCreated = resultSet.getDate("creationDate");
                int numberOfTeams = resultSet.getInt("numberOfTeams");
                String lastTeam = resultSet.getString("lastwinner");
                String logo = resultSet.getString("leagueLogo");

                // print the results
                System.out.println(leagueId + " " + firstName + " " + country + " " + dateCreated + " " + numberOfTeams + " " + lastTeam + " " + logo);
            }
            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
        return null;

    }

    @Override
    public List<Player> geyPlayers() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Player> listaGraczy= new ArrayList<>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
            // zapytanie do bazy danych

            String query = "SELECT * FROM Player";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // iterate through the java resultset
            while (resultSet.next())
            {

                Player player = new Player();

                int playerId = resultSet.getInt("playerId");
                player.setPlayerId(playerId);
                String firstName = resultSet.getString("Firstname");
                player.setFirstName(firstName);
                String lastName = resultSet.getString("LastName");
                player.setLastName(lastName);
                int price = resultSet.getInt("price");
                player.setPrice(price);
                String position = resultSet.getString("position");
                player.setPosition(position);
                int  age = resultSet.getInt("age");
                player.setAge(age);
                String country = resultSet.getString("country");
                player.setCountry(country);
                int height = resultSet.getInt("height");
                player.setHeight(height);
                int number = resultSet.getInt("number");
                player.setNumber(number);
                String photo = resultSet.getString("photo");
                player.setPhoto(photo);
                int clubId = resultSet.getInt("Club_clubId");
                player.setClub_clubId(clubId);


                //
                listaGraczy.add(player);
                // print the results
            }
            statement.close();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaGraczy;
    }
    @Override
    public List<Player> geyPlayersByName(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Player> listaGraczy= new ArrayList<>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
            // zapytanie do bazy danych

            String query = "SELECT * FROM Player where FirstName = ?";

            System.out.println(name);

            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1,name);

            ResultSet resultSet = statement.executeQuery();
            // iterate through the java resultset
            while (resultSet.next())
            {

                Player player = new Player();

                int playerId = resultSet.getInt("playerId");
                player.setPlayerId(playerId);
                String firstName = resultSet.getString("Firstname");
                player.setFirstName(firstName);
                String lastName = resultSet.getString("LastName");
                player.setLastName(lastName);
                int price = resultSet.getInt("price");
                player.setPrice(price);
                String position = resultSet.getString("position");
                player.setPosition(position);
                int  age = resultSet.getInt("age");
                player.setAge(age);
                String country = resultSet.getString("country");
                player.setCountry(country);
                int height = resultSet.getInt("height");
                player.setHeight(height);
                int number = resultSet.getInt("number");
                player.setNumber(number);
                String photo = resultSet.getString("photo");
                player.setPhoto(photo);
                int clubId = resultSet.getInt("Club_clubId");
                player.setClub_clubId(clubId);


                //
                listaGraczy.add(player);
                // print the results
            }
            statement.close();




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaGraczy;
    }

//    @Override
//    public List<Player> getByManyParameters(List<String> parameters) {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        List<Player> listaGraczy= new ArrayList<>();
//
//        try {
//
//            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
//            // zapytanie do bazy danych
//
//            String query = "SELECT * FROM Player where FirstName = ?";
//
//            System.out.println(name);
//
//            PreparedStatement statement = conn.prepareStatement(query);
//            statement.setString(1,name);
//
//            ResultSet resultSet = statement.executeQuery();
//            // iterate through the java resultset
//            while (resultSet.next())
//            {
//
//                Player player = new Player();
//
//                int playerId = resultSet.getInt("playerId");
//                player.setPlayerId(playerId);
//                String firstName = resultSet.getString("Firstname");
//                player.setFirstName(firstName);
//                String lastName = resultSet.getString("LastName");
//                player.setLastName(lastName);
//                int price = resultSet.getInt("price");
//                player.setPrice(price);
//                String position = resultSet.getString("position");
//                player.setPosition(position);
//                int  age = resultSet.getInt("age");
//                player.setAge(age);
//                String country = resultSet.getString("country");
//                player.setCountry(country);
//                int height = resultSet.getInt("height");
//                player.setHeight(height);
//                int number = resultSet.getInt("number");
//                player.setNumber(number);
//                String photo = resultSet.getString("photo");
//                player.setPhoto(photo);
//                int clubId = resultSet.getInt("Club_clubId");
//                player.setClub_clubId(clubId);
//
//
//                //
//                listaGraczy.add(player);
//                // print the results
//            }
//            statement.close();
//
//
//
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        return listaGraczy;
//    }

    public static void main(String[] args) {
        QueryToDb queryToDb = new QueryToDb();
        List<Player> bruno = queryToDb.geyPlayersByName("Neymar");
        System.out.println(bruno);
    }
}
