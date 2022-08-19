# rectangle

Zadanie.

Stworz aplikacje SpringBoot, ktora bedzie miala klase encji JPA "RECTANGLE" Klasa ma mieć pola: id, height, width.
Z użyciem biblioteki Vaadin stworz UI pozwalajacy na dodawanie nowych prostokatow do bazy danych.
Dostep do bazy danych ma byc widoczny pod endpointem ,,localhost:8090/figureDB".
Po ponownym uruchomieniu aplikacji dane w bazie danych maja zostac usuniete.
Utworz endpoint, dzieki ktoremu po przekazywazaniu w parametrze nazwy figury (dla prostokąta i trójkąta), oraz dlugosci bokow zwraca obwod danej figury np. figure=rectangle&a=10&b=20 zwraca 60.
Umiesc w pliku konfiguracyjnym, stworz 4 zestawy danych dla prostokatow. Wczytaj te 4 prostokaty do programu (w momencie startu), a nastepnie umiesc je w bazie danych.
W GUI umiesc pole tekstowe ktore w zaleznosci od podanej wartosci wyswietla prostokaty z bazy danych (np. wykorzystanie repozytorium) -duze i male (np. gdzie obod nie przekracza 20.
