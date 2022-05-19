package com.example.footBinApp.service;

import com.example.footBinApp.entities.League;
import com.example.footBinApp.entities.Player;
import com.example.footBinApp.service.interfaces.QueryToDbMethods;
import com.example.footBinApp.servlets.Query;

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

        List<Player> listaGraczy = new ArrayList<>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
            // zapytanie do bazy danych

            String query = "SELECT * FROM Player";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // iterate through the java resultset
            while (resultSet.next()) {

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
                int age = resultSet.getInt("age");
                player.setAge(String.valueOf(age));
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
    public List<Player> geyPlayersByName(Player player) {
        System.out.println(player);
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        List<Player> listaGraczy = new ArrayList<>();

        try {

            Connection conn = DriverManager.getConnection(myUrl, "root", "password12");
            // zapytanie do bazy danych

            String name = player.getFirstName();
//
//            String query = "SELECT * FROM Player where FirstName = ?";
            Query query = createQuery(player);
//            System.out.println(query);



            PreparedStatement statement = conn.prepareStatement(query.getQuerystring());
            statement.setString(1, query.getUnknown());

            ResultSet resultSet = statement.executeQuery();
            // iterate through the java resultset
            while (resultSet.next()) {

                Player playerData = new Player();

                int playerId = resultSet.getInt("playerId");
                playerData.setPlayerId(playerId);
                String firstName = resultSet.getString("Firstname");
                playerData.setFirstName(firstName);
                String lastName = resultSet.getString("LastName");
                playerData.setLastName(lastName);
                int price = resultSet.getInt("price");
                playerData.setPrice(price);
                String position = resultSet.getString("position");
                playerData.setPosition(position);
                int age = resultSet.getInt("age");
                playerData.setAge(String.valueOf(age));
                String country = resultSet.getString("country");
                playerData.setCountry(country);
                int height = resultSet.getInt("height");
                playerData.setHeight(height);
                int number = resultSet.getInt("number");
                playerData.setNumber(number);
                String photo = resultSet.getString("photo");
                playerData.setPhoto(photo);
                int clubId = resultSet.getInt("Club_clubId");
                playerData.setClub_clubId(clubId);


                //
                listaGraczy.add(playerData);
                // print the results
            }
            statement.close();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaGraczy;
    }

//
    public Query createQuery(Player player) {
        Query query = new Query();
        query.setQuerystring( "SELECT * FROM Player where playerId = ?");
        query.setUnknown("-1");


// wyszukiwanie po imieniu tylko
        if (!player.getFirstName().isEmpty() && player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
            query.setQuerystring( "SELECT * FROM Player where FirstName = ?");
            query.setUnknown(player.getFirstName());
        }
        // wyszukiwanie po nazwisku tylko
        if (player.getFirstName().isEmpty() && !player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
           query.setQuerystring( "SELECT * FROM Player where LastName = ?");
           query.setUnknown(player.getLastName());
        }
        // wyszukiwanie po max Value
        if (player.getFirstName().isEmpty() && player.getLastName().isEmpty() && !String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
           query.setQuerystring("SELECT * FROM Player where price <= ?");
           query.setUnknown(String.valueOf(player.getMaxPrice()));

        }
        // wyszukiwanie po Min Value
        if (player.getFirstName().isEmpty() && player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && !String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
            query.setQuerystring("SELECT * FROM Player where price >= ?");
            query.setUnknown(String.valueOf(player.getMinPrice()));
        }
        // wyszukiwanie po pozycji
        if (player.getFirstName().isEmpty() && player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && !String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
            query.setQuerystring("SELECT * FROM Player where position = ?");
            query.setUnknown(player.getPosition());
        }
        // wyszukiwanie po karju
        if (player.getFirstName().isEmpty() && player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && !String.valueOf(player.getCountry()).isEmpty()) {
            query.setQuerystring("SELECT * FROM Player where country = ?");
            query.setUnknown(player.getCountry());
        }

        if (!player.getFirstName().isEmpty() && !player.getLastName().isEmpty() && String.valueOf(player.getMaxPrice()).isEmpty() && String.valueOf(player.getMinPrice()).isEmpty() && String.valueOf(player.getPosition()).isEmpty() && String.valueOf(player.getCountry()).isEmpty()) {
            query.setQuerystring( "SELECT * FROM Player where FirstName = ?");
            query.setUnknown(player.getFirstName());
        }


        return query;
    }
}
