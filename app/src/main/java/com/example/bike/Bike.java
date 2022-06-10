package com.example.bike;

public class Bike {
    private String name;
    private String recipe;
    private String dlugosc_km;
    private String dlugosc;
    private String trudnosc;
    private String najlepszy_czas;
    private String najlepszy_czas_data;
    private String ostatni_czas;
    private String ostatni_czas_data;

    public static final Bike[] bikes = {
            new Bike("Rusałka - Strzeszyn - Kiekrz", "Trasa głównie przeznaczona dla amatorów niedzielnych przejażdżek. Większość trasy prowadzi poprzez lasy oraz ich krawędzie.Droga to większości ubity szuter lub czarnoziem, jedynie w okolicy jeziora Kierskiego mamy asfalt lecz nie ma tam ruchu samochodowego (są słupki blokujące wjazdy) Największa trudnością, mogą być chodzący cała szerokością ścieżek niedzielni spacerowicze z dziećmi(które rzadko są prowadzone za rękę - odcinki na Rusałką i Strzeszynem) oraz przejazd przez ul. Lutycka (obwodnica Poznania) będziemy ja przecinać dwukrotnie.... ", "20,64 km", "długa", "średnia", "12:44", "20-01-2022","16:34", "10.06.2022"),
            new Bike("Rusałka", "Trasa krótka, szybka, bardzo przyjemna o dość równej, nawierzchni. Trzeba tylko uważać na innych rowerzystów, joggerów i ludzi z psami. Cała reszta to natura i przyjemność ", "3,58 km","krótka", "łatwa", "5:14","20-01-2022", "16:14", "10.06.2022"),
            new Bike("Poznań - Murowana Goślina", "Trasa bardzo urozmaicona. W pierwszej części piaskowe podjazdy pod górę Morawsko, a następnie piękny asfalt przez poligon wojskowy (droga dopuszczona tylko do ruchu rowerowego). Ciekawostką jest stary kościół, który niestety jest w opłakanym stanie. Trzeba pamiętać aby nie zjeżdżać z głównej ulicy - jesteśmy na terenie poligonu wojskowego. Pozostała część trasy wiedzie do Murowanej Gośliny - niestety trzeba jechać drogą - brak drogi rowerowej...... ", "21,88 km","długa", "średnia", "15:14","20-01-2022", "19:14", "10.06.2022"),
            new Bike("Nad Jezioro Kórnickie", "Z pod poczty niedaleko kościoła w Głuszynie ruszamy w kierunku wsi Babki --> jedziemy w górę rzeczki Kopli niebieskim szlakiem rowerowym --> centrum wsi Kamionki --> zmierzamy na wschód w kierunku Kórnika --> wieś Mościenica , Jeziora Rynny Kórnicko-Zaniemyskiej --> jedziemy na południe zachodnim brzegiem Jeziora Skrzyneckiego Dużego, docieramy do szosy i skrecamy w lewo. jadąc połączonymi szlakami na wschód dojeżdżamy do położonego nad Jeziorem Kórnickim Kórnika... ", "17,96 km", "średnia", "duża", "16:14","20-01-2022", "18:22", "10.06.2022"),
            new Bike("Malta - Swarzędz - Rataje", "Start na Malcie przy stoku narciarskim. Objeżdżamy Jezioro i przy restauracji Tai India robimy nawrót w lewo. Następnie do góry 300 metrów i znowu w lewo, aż do skryżowania Krańcowej z Czekalską. Tam w prawo i do końca ulicy. Znów w prawo w Ziemowita i cały czas prosto do Browarnej. Powrót do Malty ul.Arcybiskupa Dymka Typ trasy: szosowa. Natężenie ruch największe na Arcybiskupa Dymka ", "12,95 km", "średnia", "średnia", "11:14","20-01-2022", "12:14", "10.06.2022"),
            new Bike("Cytadela-Jeziora Strzeszyńskie-Cytadela", "Trasa bardzo przyjemna, nie zbyt wymagająca lecz dość długa, głownie jedzie się w lesie wzdłuż jezior, Zaczynamy przy Cytadeli następnie ścieżką rowerową w stronę Parku Sołackiego. Następnie koło Olimpii nad Rusałkę,wzdłuż wspomnianego jeziorka jak również wzdłuż Jeziora Strzeszyńskiego. Wracamy wzdłuż Jeziora Kierskiego, koło Ławicy, Golf Klubu, Toru Poznań do Bukowskiej w stronę centrum Poznania i Alejami Niepodległości spowrotem na Cytadelę ", "30,67 km", "dluga", "trudna", "25:14","20-01-2022", "32:44", "10.06.2022"),
            new Bike("Poznań - Rybojedzko", "Najgorzej wyjechać z Poznania i Plewisk. Niestety cały czas jedzie się ul. Grunwaldzką, która jest ruchliwa. Po wyjechaniu z Plewisk, kawałek drogi kamienistej i kiepskiej jakości. Jak już przejedziemy nad autostradą to mamy zjazd z górki i jedziemy prosto (nie skręcamy przy stawie w lewo) i wjeżdżamy między pola i tak, aż do Konarzewa (można jechać również asfaltem, ale wówczas narażamy się na ruch samochodowy). W Konarzewie wjeżdżamy na asfalt i jedziemy w kierunku kościoła (mijamy z prawej strony) i dalej prosto (powinniśmy minąć cmentarz z prawej). Asfaltem jakieś 3 kilometry do Trzcielina. W Trzcielinie przecinamy skrzyżowanie prosto i jedziemy główną drogą między zabudowaniami, aż do pola ", "25,25 km", "długa", "średnia", "32:14","20-01-2022", "32:56", "10.06.2022"),
            new Bike("Dolina Cybiły", "Przyjemna łatwa trasa turystyczna (np. zabytkowy kościół w Uzarzewie) i rekreacyjna. Duża część trasy wiedzie lasami. Przepiękne widoki w Dolinie Cybiny ", "35,74 km", "średnia", "długa", "35:14","20-01-2022", "35:14", "10.06.2022"),
            new Bike("Śrem - Mosina - Rogalin - Śrem", "Trasa bardzo fajna głównie przebiegająca po szosach i ścieżkach rowerowych. natężenie ruchu raczej średnie, po drodze możliwość odpoczynku w centrum hipiki w Jaszkowie na rynku w Mosinie, pod rogalińskimi dębami. Na trasie nie ma jakiś ciężkich podjazdów wiec jedzie się całkiem przyjemnie ", "54,89 km", "długa", "trudna", "60:02","20-01-2022", "68:34", "10.06.2022")

    };
    private Bike(String name, String recipe, String dlugosc_km, String dlugosc, String trudnosc, String najlepszy_czas, String najlepszy_czas_data, String ostatni_czas, String ostatni_czas_data) {
        this.name = name;
        this.recipe = recipe;
        this.dlugosc_km = dlugosc_km;
        this.dlugosc = dlugosc;
        this.trudnosc = trudnosc;
        this.najlepszy_czas = najlepszy_czas;
        this.najlepszy_czas_data = najlepszy_czas_data;
        this.ostatni_czas = ostatni_czas;
        this.ostatni_czas_data = ostatni_czas_data;
    }
    public String getRecipe() {
        return recipe;
    }
    public String getName() {
        return name;
    }
    public String getDlugoscKM() {
        return dlugosc_km;
    }
    public String getDlugosc() {
        return dlugosc;
    }
    public String getTrudnosc() {
        return trudnosc;
    }
    public String getNajlepszyCzas() {
        return najlepszy_czas;
    }
    public String getNajlepszyCzasData() {
        return najlepszy_czas_data;
    }
    public String getOstatniCzas() {
        return ostatni_czas;
    }
    public String getOstatniCzasData() {
        return ostatni_czas_data;
    }

    public String toString() {
        return this.name;
    }

}