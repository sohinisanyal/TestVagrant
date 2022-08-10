package com.company;
import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public class PlanetaryData {


    public void countMoons(){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Mercury", 0);
        map.put("Venus", 0);
        map.put("Earth", 0);
        map.put("Jupiter", 1);
        map.put("Saturn", 1);
        map.put("Uranus", 1);

        HashMap<String, Integer> moons = new HashMap<>();

        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 83);
        moons.put("Uranus", 27);

        Integer value = 1;
        int num_moons=0;

        for (Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == value) {

                num_moons=num_moons+ moons.get(entry.getKey());
            }

        }
        System.out.println(num_moons);
    }

    public void gasOnMaxPlanets(){
        int intArray[];
        intArray = new int[20];

    }

    public static void main(String[] args) {

        PlanetaryData A = new PlanetaryData();
        System.out.print("Total number of moons of planets having rings = ");
        A.countMoons();
        System.out.print("Gas that is found on maximum planets = ");
        A.gasOnMaxPlanets();
    }
}