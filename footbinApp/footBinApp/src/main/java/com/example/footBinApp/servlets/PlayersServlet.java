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

        Player requestPlayer =new Player();
        String fname = req.getParameter("fname");
        if( fname !=null){
           requestPlayer.setFirstName(fname);

       }
//
//        String Lastname = req.getParameter("lname");
//        if(Lastname!=null){
//requestPlayer.setLastName(Lastname);
//        }
//
//        String MinPrice = req.getParameter("lmin");
//        if(MinPrice!=null){
//        }
//
//        String MaxPrice = req.getParameter("lmax");
//        if(MaxPrice!=null){
//            parameters.add(MaxPrice.trim());
//        }
//        String Position = req.getParameter("lpos");
//        if(Position!=null){
//            parameters.add(Position.trim());
//
//        }
//        String Age = req.getParameter("lage");
//        if(Age!=null){
//            parameters.add(Age.trim());
//        }
//
//        String Country = req.getParameter("lcou");
//        if(Country!=null){
//            parameters.add(Country.trim());
//        }
//
//        String High = req.getParameter("lhig");
//        if(High!=null){
//            parameters.add(High.trim());
//        }
//
//
//        String Number = req.getParameter("lnum");
//        if(Number!=null){
//            parameters.add(Number.trim());
//        }
//


        // sprawdzenie ktore parametry sa puste
        System.out.println("not empty");



        List<Player> players = queryToDb.geyPlayersByName(fname);
        System.out.println(players);
        req.setAttribute("listOfPlay",players);
        req.getRequestDispatcher("/WEB-INF/players.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("fname");

        List<Player> players = queryToDb.geyPlayersByName(name);
        System.out.println(players);
        req.setAttribute("listOfPlay",players);
        req.getRequestDispatcher("/WEB-INF/players.jsp").forward(req,resp);

    }
}
