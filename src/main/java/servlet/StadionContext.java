/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import entities.Stadion;

public class StadionContext implements Serializable 
{

    private final SortedMap<Integer, Stadion> events;

    public StadionContext() 
    {
        events = Collections.synchronizedSortedMap(new TreeMap<Integer, Stadion>());
        events.put(1, new Stadion(1, "Koncert Madonny"));
        events.put(2, new Stadion(2, "Mecz Barcelona - Real Madryt"));
    }
    
    public List<Stadion> findAllEvents() 
     {
        return new ArrayList<>(events.values());
     }

    public Stadion findEvent(Integer id) 
    {
        return events.get(id);
    }
}
