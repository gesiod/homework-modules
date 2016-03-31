package com.goit.goitonline.module6;

import com.goit.goitonline.module3ex3.*;

import java.util.*;

/**
 * Created by Grigoriy on 23.03.2016.
 */
public class Runner {
    public static void main(String[] args) {
        MusicStore musicStore = new MusicStore();
        ArrayList<Guitar> guitars = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            guitars.add(new Guitar())    ;
        }
        musicStore.setGuitars(guitars);
        
        ArrayList<Piano> pianos = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            pianos.add(new Piano());
        }
        musicStore.setPianos(pianos);
        
        ArrayList<Trumpet> trumpets = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            trumpets.add(new Trumpet());
        }
        musicStore.setTrumpets(trumpets);

        System.out.println(musicStore);

        Map<String, Integer> order = new HashMap<>();
        order.put("Guitars", 7); //заменить на константу MUSICAL_INSTRUMENT_GUITARS
        order.put("Trumpets", 2); //заменить на константу MUSICAL_INSTRUMENT_TRUMPETS

        List<MusicalInstrument> orderResult = prepareOrder(musicStore, order);
        System.out.print("Order: " + orderResult);

        System.out.println(musicStore);

        Map<String, Integer> order2 = new HashMap<>();
        order2.put("Pianos", 1); //заменить на константу MUSICAL_INSTRUMENT_PIANOS
        orderResult = prepareOrder(musicStore,order2);
        System.out.print("Order: " + orderResult);
        System.out.println(musicStore);

        Map<String,Integer> order3 = new HashMap<>();
        order3.put("Pianos", 1); //заменить на константу MUSICAL_INSTRUMENT_PIANOS
        order3.put("Guitars", 8); //заменить на константу MUSICAL_INSTRUMENT_GUITARS
        order3.put("Trumpets", 6); //заменить на константу MUSICAL_INSTRUMENT_TRUMPETS
        orderResult = prepareOrder(musicStore, order3);
        System.out.print("Order: " + orderResult);
        System.out.println(musicStore);






    }

    private static List<MusicalInstrument> prepareOrder(MusicStore shop, Map<String, Integer> order) {
        ArrayList<MusicalInstrument> result = new ArrayList<>();

        for(Map.Entry<String, Integer> orderEntry : order.entrySet()) {
            switch (orderEntry.getKey()) {
                case "Guitars": //заменить на константу MUSICAL_INSTRUMENT_GUITARS
                    List<Guitar> guitars = shop.getGuitars();
                    int numberOfGuitarsToRemove = order.get("Guitars"); //заменить на константу MUSICAL_INSTRUMENT_GUITARS
                    if (shop.getGuitars().size() < numberOfGuitarsToRemove) throw new IllegalStateException("Shop does not have enough Guitars");

                    if (numberOfGuitarsToRemove > 0) {
                        List<Guitar> guitarsToRemove = shop.getGuitars().subList(0, numberOfGuitarsToRemove);
                        List<Guitar> guitarsToStay = shop.getGuitars().subList(numberOfGuitarsToRemove, guitars.size());
                        shop.setGuitars(guitarsToStay);
                        result.addAll(guitarsToRemove);
                    }
                    break;
                case "Pianos" : //заменить на константу MUSICAL_INSTRUMENT_PIANOS
                    List<Piano> pianos = shop.getPianos();
                    int numberOfPianosToRemove = order.get("Pianos"); //заменить на константу MUSICAL_INSTRUMENT_PIANOS
                    if (shop.getPianos().size() < numberOfPianosToRemove) throw new IllegalArgumentException("Shop does not have enough Pianos");

                    if (numberOfPianosToRemove > 0) {
                        List<Piano> pianosToRemove = shop.getPianos().subList(0, numberOfPianosToRemove);
                        List<Piano> pianosToStay = shop.getPianos().subList(numberOfPianosToRemove, pianos.size());
                        shop.setPianos(pianosToStay);
                        result.addAll(pianosToRemove);
                    }
                    break;
                case "Trumpets" : //заменить на константу MUSICAL_INSTRUMENT_TRUMPETS
                    List<Trumpet> trumplets = shop.getTrumpets();
                    int numberOfTrumpletsToRemove = order.get("Trumpets"); //заменить на константу MUSICAL_INSTRUMENT_TRUMPETS
                    if (shop.getTrumpets().size() < numberOfTrumpletsToRemove) throw new IllegalArgumentException("Shop does not have enough Trumpets");

                    if (numberOfTrumpletsToRemove > 0) {
                        List<Trumpet> trumpetsToRemove = shop.getTrumpets().subList(0, numberOfTrumpletsToRemove);
                        List<Trumpet> trumpetsToStay = shop.getTrumpets().subList(numberOfTrumpletsToRemove, trumplets.size());
                        shop.setTrumpets(trumpetsToStay);
                        result.addAll(trumpetsToRemove);
                    }
                    break;
                default: throw new IllegalArgumentException("The music store is not a musical instrument: " + orderEntry.getKey());
            }

        }

        return result;
    }
}
