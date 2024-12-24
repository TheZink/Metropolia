Yhteen tauluun kohdistuvien kyselyiden harjoitukset

1. select * from goal

    ![Harjoitustehtävä 1](Viikko1_yhdentaulunkysely_1.png)

2. select name as airport_type from airport where iso_country = "FI";

    ![Harjoitustehtävä 2](Viikko1_yhdentaulunkysely_2.png)

3. select airport.name, airport.type
    -> from airport
    -> where iso_country = "FI"
    -> order by airport.name asc;

    ![Harjoitustehtävä 3](Viikko1_yhdentaulunkysely_3.png)

4. select airport.name, airport.type
    -> from airport
    -> where iso_country = "FI"
    -> order by airport.type asc, airport.name asc;

    ![Harjoitustehtävä 4](Viikko1_yhdentaulunkysely_4.png)

5. select name
    -> from country
    -> where name like 'f%';

    ![Harjoitustehtävä 5](Viikko1_yhdentaulunkysely_5.png)

6. select name
    -> from country
    -> where name like '%F%';

    ![Harjoitustehtävä 6](Viikko1_yhdentaulunkysely_6.png)

7. select location
    -> from game
    -> where screen_name = "Vesa";

    ![Harjoitustehtävä 7](Viikko1_yhdentaulunkysely_7.png)

8. select co2_consumed
    -> from game
    -> where screen_name = "Ilkka";

    ![Harjoitustehtävä 8](Viikko1_yhdentaulunkysely_8.png)
