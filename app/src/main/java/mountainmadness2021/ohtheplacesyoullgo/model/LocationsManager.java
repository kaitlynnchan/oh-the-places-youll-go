package mountainmadness2021.ohtheplacesyoullgo.model;

import java.util.*;

public class LocationsManager {

    String[] parisA = {"Eiffel Tower", "Louvre Museum", "Arc de Triomphe"};
    String[] sydneyA = {"Bondi Beach", "Sydney Opera House", "Sydney Harbour Bridge"};
    String[] queenstownA = {"The Remarkables", "Routeburn Track", "Milford Sound"};
    String [] dublinA = {"Dublin Castle", "Phoenix Park and Dublin Zoo", "Guinness Storehouse"};
    String [] nycA = {"Statue of Liberty", "Central Park", "Empire State Building"};
    String [] mauiA = {"Hana Highway", "Kaanapali Beach", "Haleakala National Park"};
    String [] reyA = {"Blue Lagoon", "The Pearl (Perlan)", "Aurora Reykjavik (Northern Lights Centre"};
    String[] cancunA = {"Cancun Underwater Museum", "Playa Norte", "Xcaret Park"};
    String [] santA = {"Kamari Beach", "Amoudi Bay", "Fira to Oia Hike"};
    String [] veniceA = {"St. Mark’s Square", "Murano, Burano and Torcello", "Venice Gondola Ride"};
    String [] milanA = {"Duomo di Milan", "Galleria Vittorio Emanuele II", "Lake Como"};
    String [] boraA = {"Maitra Beach", "Coral Gardens", "Shark/Stingray Feeding"};
    String[] dubaiA = {"Burj Khalifa", "Dubai Mall", "Burj Al Arab"};
    String [] bangkokA = {"The Grand Palace", "Chatuchak Market", "Chao Phraya River"};
    String [] baliA = {"Sanur", "Uluwatu Temple", "Ubud Monkey Forest"};
    String [] londonA = {"Big Ben", "Tower of London", "London Eye"};
    String [] newoA = {"Bourbon Street", "Jackson Square", "French Quarter"};
    String [] honoA = {"Hanauma Bay", "Diamond Head", "Waikiki Beach"};
    String [] kualaA = {"Batu Caves", "Menara Kuala Lumpur", "Petronas Towers"};
    String [] instanbulA = {"Hagia Sophia", "Blue Mosque", "Topkapi Palace"};
    String [] tokyoA = {"Tokyo Skytree", "Sensoji Temple", "Ueno Park"};


    private Location[] locations = {
            new Location("Paris", "France", parisA),
            new Location("Sydney", "Australia", sydneyA),
            new Location("Queenstown", "New Zealand", queenstownA),
            new Location("Dublin", "Ireland", dublinA),
            new Location("New York City", "USA",nycA),
            new Location("Maui", "USA", mauiA),
            new Location("Reykjavik", "Iceland", reyA),
            new Location("Cancun", "Mexico", cancunA),
            new Location("Santorini", "Greece",santA),
            new Location("Venice", "Italy", veniceA),
            new Location("Milan", "Italy", milanA),
            new Location("Bora Bora", "Polynesia", boraA),
            new Location("Dubai", "United Arabs Emirates", dubaiA),
            new Location("Bangkok", "Thailand", bangkokA),
            new Location("Bali", "India", baliA),
            new Location("London", "England", londonA),
            new Location("New Orleans", "USA",newoA),
            new Location("Honolulu", "USA", honoA),
            new Location("Kuala Lumpur", "Malaysia",kualaA),
            new Location("Istanbul", "Turkey", instanbulA),
            new Location("Tokyo", "Japan", tokyoA)
    };

}
