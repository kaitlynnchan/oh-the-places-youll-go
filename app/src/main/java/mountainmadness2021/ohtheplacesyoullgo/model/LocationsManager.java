package mountainmadness2021.ohtheplacesyoullgo.model;

import java.util.*;

public class LocationsManager {

    // find algorithm to get top tourist attractions
    private String[] parisA = {"Eiffel Tower", "Louvre Museum", "Arc de Triomphe"};
    private String[] sydneyA = {"Bondi Beach", "Sydney Opera House", "Sydney Harbour Bridge"};
    private String[] queenstownA = {"The Remarkables", "Routeburn Track", "Milford Sound"};
    private String[] dublinA = {"Dublin Castle", "Phoenix Park and Dublin Zoo", "Guinness Storehouse"};
    private String[] nycA = {"Statue of Liberty", "Central Park", "Empire State Building"};
    private String[] mauiA = {"Hana Highway", "Kaanapali Beach", "Haleakala National Park"};
    private String[] reyA = {"Blue Lagoon", "The Pearl (Perlan)", "Aurora Reykjavik (Northern Lights Centre)"};
    private String[] cancunA = {"Cancun Underwater Museum", "Playa Norte", "Xcaret Park"};
    private String[] santA = {"Kamari Beach", "Amoudi Bay", "Fira to Oia Hike"};
    private String[] veniceA = {"St. Mark’s Square", "Murano, Burano and Torcello", "Venice Gondola Ride"};
    private String[] milanA = {"Duomo di Milan", "Galleria Vittorio Emanuele II", "Lake Como"};
    private String[] boraA = {"Maitra Beach", "Coral Gardens", "Shark/Stingray Feeding"};
    private String[] dubaiA = {"Burj Khalifa", "Dubai Mall", "Burj Al Arab"};
    private String[] bangkokA = {"The Grand Palace", "Chatuchak Market", "Chao Phraya River"};
    private String[] baliA = {"Sanur", "Uluwatu Temple", "Ubud Monkey Forest"};
    private String[] londonA = {"Big Ben", "Tower of London", "London Eye"};
    private String[] newoA = {"Bourbon Street", "Jackson Square", "French Quarter"};
    private String[] honoA = {"Hanauma Bay", "Diamond Head", "Waikiki Beach"};
    private String[] kualaA = {"Batu Caves", "Menara Kuala Lumpur", "Petronas Towers"};
    private String[] istanbulA = {"Hagia Sophia", "Blue Mosque", "Topkapi Palace"};
    private String[] tokyoA = {"Tokyo Skytree", "Sensoji Temple", "Ueno Park"};
    private String[] tahitiA = {"Mount 'Orohen", "La Plage de Maui", "Fautaua Waterfall"};
    private String[] romeA = {"Colosseum", "Vatican City", "Trevi Fountain"};
    private String[] barcelonaA = {"Parc Guell: Gaudi's Surrealist Park", "Casa Batllo", "The Magic Fountain"};
    private String[] banffA = {"Sulphur Mountain", "Lake Louise", "Moraine Lake"};
    private String[] amsterdamA = {"Jordaan", "Dam Square", "Royal Palace of Amsterdam"};
    private String[] sanfranA = {"Golden Gate Bridge", "Fisherman's Wharf", "Ride Cable Cars"};
    private String[] riodejaneiroA = {"Cristo Redentor", "Sugarloaf", "Copacabana"};
    private String[] sanjoseA = {"Winchster Mystery House", "Santana Row", "San Jose Museum of Art"};
    private String[] niagaraA = {"Niagara Falls", "Journey Behind the Falls", "Hornblower Niagara Cruises"};


    private Location[] locations = {
            new Location("Paris", "France", parisA, "The city has only one stop sign"),
            new Location("Sydney", "Australia", sydneyA, "The Sydney Harbour Bridge is tallest steel arch bridge in the world"),
            new Location("Queenstown", "New Zealand", queenstownA, "The rivers still contain some gold"),
            new Location("Dublin", "Ireland", dublinA, "Dublin's O'Connell Street is widest street in Europe"),
            new Location("New York City", "USA",nycA, "There are over 800 languages spoken in the city"),
            new Location("Maui", "USA", mauiA, "Mount Haleakala is the world's largest dormant mountain"),
            new Location("Reykjavik", "Iceland", reyA, "The city is the world's only capital to have a puffin breeding colony"),
            new Location("Cancun", "Mexico", cancunA, "Because the city's white sand is made from crushed coral you won't burn your feet on it"),
            new Location("Santorini", "Greece",santA, "The city has more than 100 different varieties of grapes"),
            new Location("Venice", "Italy", veniceA, "Venice has 417 bridges"),
            new Location("Milan", "Italy", milanA, "Milan La Scala Opera is the largest opera house in Europe"),
            new Location("Bora Bora", "French Polynesia", boraA, "The island was formed by a volcanic eruption 4 million years ago"),
            new Location("Dubai", "United Arabs Emirates", dubaiA, "The interior of the Burj Al Arab is decorated with 1,790 square meters of 24-carat gold leaf."),
            new Location("Bangkok", "Thailand", bangkokA, "The city is home to the largest solid gold Buddha statue is the world"),
            new Location("Bali", "Indonesia", baliA, "Both of Bali's volcanoes are considered active"),
            new Location("London", "England", londonA, "The city has 170 museums"),
            new Location("New Orleans", "USA",newoA, "The city was the first in the USA to host Opera"),
            new Location("Honolulu", "USA", honoA, "Waikiki Beach attracts over 70,000 tourists a day"),
            new Location("Kuala Lumpur", "Malaysia",kualaA, "A group of Chinese tin miners founded the city"),
            new Location("Istanbul", "Turkey", istanbulA, "Istanbul is the only city to be a part of two continents (Asia and Europe) "),
            new Location("Tokyo", "Japan", tokyoA, "The Tokyo Skytree is one of the tallest buildings in the world"),
            new Location("Tahiti", "French Polynesia", tahitiA, "Tahiti is the birthplace of the overwater bungalow"),
            new Location("Rome", "Italy", romeA, "The city has 280 fountains"),
            new Location("Barcelona", "Spain", barcelonaA, "There were no beaches in Barcelona before the 1992 Olympics"),
            new Location("Banff", "Canada", banffA, "There are over 1600km of hiking trails in Banff"),
            new Location("Amsterdam", "Netherlands", amsterdamA, "There are 100km of canals for visitors to travel along"),
            new Location("San Francisco", "USA", sanfranA, "The Golden Gate Bridge was constructed during the great depression"),
            new Location("Rio de Janeiro", "Brazil", riodejaneiroA, "The city's mosaic sidewalks have dozens of QR codes installed in them"),
            new Location("San Jose","Costa Rica", sanjoseA, "The city is in the middle of a tropical rainforest"),
            new Location("Niagara Falls", "Canada", niagaraA, "Niagara Falls is the largest waterfall in North America by volume and width")
    };

    public Location getRandomLocation(){
        return locations[new Random().nextInt(locations.length)];
    }
}
