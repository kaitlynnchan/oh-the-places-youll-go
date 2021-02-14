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
    private String[] reyA = {"Blue Lagoon", "The Pearl (Perlan)", "Aurora Reykjavik (Northern Lights Centre"};
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
    private String[] instanbulA = {"Hagia Sophia", "Blue Mosque", "Topkapi Palace"};
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
            new Location("Bora Bora", "French Polynesia", boraA),
            new Location("Dubai", "United Arabs Emirates", dubaiA),
            new Location("Bangkok", "Thailand", bangkokA),
            new Location("Bali", "India", baliA),
            new Location("London", "England", londonA),
            new Location("New Orleans", "USA",newoA),
            new Location("Honolulu", "USA", honoA),
            new Location("Kuala Lumpur", "Malaysia",kualaA),
            new Location("Istanbul", "Turkey", instanbulA),
            new Location("Tokyo", "Japan", tokyoA),
            new Location("Tahiti", "French Polynesia", tahitiA),
            new Location("Rome", "Italy", romeA),
            new Location("Barcelona", "Spain", barcelonaA),
            new Location("Banff", "Canada", banffA),
            new Location("Amsterdam", "Netherlands", amsterdamA),
            new Location("San Francisco", "USA", sanfranA),
            new Location("Rio de Janeiro", "Brazil", riodejaneiroA),
            new Location("San Jose","Costa Rica", sanjoseA),
            new Location("Niagara Falls", "Canada", niagaraA)
    };

    public Location getRandomLocation(){
        return locations[new Random().nextInt(locations.length)];
    }
}
