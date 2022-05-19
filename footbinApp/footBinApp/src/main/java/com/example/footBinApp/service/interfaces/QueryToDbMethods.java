package com.example.footBinApp.service.interfaces;

import com.example.footBinApp.entities.League;
import com.example.footBinApp.entities.Player;

import java.util.List;

public interface QueryToDbMethods {
     List<League> getLeagues();
     List<Player> geyPlayers();
     List<Player> geyPlayersByName(String Name);
//     List<Player> getByManyParameters(List<String> parameters);

}
