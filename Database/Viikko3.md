Join-harjoitukset

1. select country.name as 'country name', airport.name as 'airport name'
    -> from airport
    -> inner join country on country.iso_country = airport.iso_country
    -> where country.name = 'Finland' and airport.scheduled_service = "yes";

    ![Join-harjoitustehtävä 1](Viikko3_join_harjoitukset_1.png)

2. select game.screen_name, airport.name
    -> from airport
    -> inner join game on game.location = airport.ident;

    ![Harjoitustehtävä 2](Viikko3_join_harjoitukset_2.png)

3. select game.screen_name, country.name
    -> from airport
    -> inner join game on game.location = airport.ident
    -> inner join country on country.iso_country = airport.iso_country;

    ![Harjoitustehtävä 3](Viikko3_join_harjoitukset_3.png)

4. select airport.name, game.screen_name
    -> from airport
    -> left join game on game.location = airport.ident
    -> where airport.name like '%hels%';

    ![Harjoitustehtävä 4](Viikko3_join_harjoitukset_4.png)

5. select goal.name, game.screen_name
    -> from goal
    -> left join goal_reached on goal_reached.goal_id = goal.id
    -> left join game on game.id = goal_reached.game_id;

    ![Harjoitustehtävä 5](Viikko3_join_harjoitukset_5.png)

Sisäkysely

1. select country.name
    -> from country
    -> where iso_country in(
    -> select iso_country
    -> from airport
    -> where name like '%satsuma%');

    ![Harjoitustehtävä 1](Viikko3_sisakysely_1.png)

2. select name
    -> from airport
    -> where iso_country in(
    -> select iso_country
    -> from country
    -> where name = 'Monaco');
    
    ![Harjoitustehtävä 2](Viikko3_sisakysely_2.png)

3. select screen_name
    -> from game
    -> where id in(
    -> select game_id
    -> from goal_reached
    -> where goal_id in(
    -> select id
    -> from goal
    -> where name = 'CLOUDS')
    -> );

    ![Harjoitustehtävä 3](Viikko3_sisakysely_3.png)

4. select name
    -> from country
    -> where iso_country not in(
    -> select iso_country
    -> from airport);
    
    ![Harjoitustehtävä 4](Viikko3_sisakysely_4.png)

5. select name
    -> from goal
    -> where id not in(
    -> select goal_id
    -> from goal_reached
    -> where game_id not in(
    -> select id
    -> from game
    -> where name = 'Heini')
    -> );

    ![alt text](image.png)