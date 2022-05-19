package com.example.footBinApp.servlets;

import com.example.footBinApp.entities.League;
import com.example.footBinApp.entities.Player;
import com.example.footBinApp.service.QueryToDb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@WebServlet(name = "playerServlet", value = "/players")

public class PlayersServlet extends HttpServlet {


    private final QueryToDb queryToDb = new QueryToDb();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Player requestPlayer = new Player();
        String fname = req.getParameter("fname");
        if (fname != null && !fname.isEmpty()) {
            requestPlayer.setFirstName(fname);
        }else {
            requestPlayer.setFirstName("");
        }
//
        String Lastname = req.getParameter("lname");
        if (Lastname != null && !Lastname.isEmpty()) {
            requestPlayer.setLastName(Lastname);
        }else {
            requestPlayer.setLastName("");

        }


        String MinPrice = req.getParameter("lmin");
        if (MinPrice != null && !MinPrice.isEmpty()) {
            requestPlayer.setMinPrice(MinPrice);
        }else {
            requestPlayer.setMinPrice("");

        }

        String MaxPrice = req.getParameter("lmax");
        if (MaxPrice != null && !MaxPrice.isEmpty()) {
            requestPlayer.setMaxPrice(MaxPrice);
        }else {
            requestPlayer.setMaxPrice("");

        }
        String Position = req.getParameter("lpos");
        if (Position != null && !Position.isEmpty()) {
            requestPlayer.setPosition(Position.trim());

        }else {
            requestPlayer.setPosition("");

        }
        String Age = req.getParameter("lage");
        if (Age != null && !Age.isEmpty()) {
            requestPlayer.setAge((Age));
        }else {
            requestPlayer.setAge("");

        }

        String Country = req.getParameter("lcou");
        if (Country != null && !Country.isEmpty()) {
            requestPlayer.setCountry(Country.trim());
        }else {
            requestPlayer.setCountry("");

        }

        System.out.println("player stats");

        System.out.println(requestPlayer);


        // sprawdzenie ktore parametry sa puste
        System.out.println("not empty");


        List<Player> players = queryToDb.geyPlayersByName(requestPlayer);
        System.out.println(players);
        req.setAttribute("listOfPlay", players);
        req.getRequestDispatcher("/WEB-INF/players.jsp").forward(req, resp);

    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        String name = req.getParameter("fname");
//
//        List<Player> players = queryToDb.geyPlayersByName(name);
//        System.out.println(players);
//        req.setAttribute("listOfPlay",players);
//        req.getRequestDispatcher("/WEB-INF/players.jsp").forward(req,resp);
//
//    }
}
