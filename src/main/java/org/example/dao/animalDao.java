package org.example.dao;

import org.example.config.DatabaseConfig;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.example.dto.option;
import org.example.models.Animal;

import java.util.List;

public class animalDao {

    private static final Sql2o sql2o = DatabaseConfig.getDatabase();
    public static void create(Animal Animal){
        try(Connection connection = sql2o.open()){
            String query = "INSERT INTO animals (name, health,age,endangered) VALUES (:name, :health, :age,:endangered);";
            connection.createQuery(query)
                    .addParameter("name", Animal.getName())
                    .addParameter("health", Animal.getHealth())
                    .addParameter("age", Animal.getAge())
                    .addParameter("endangered", Animal.isEndangered())
                    .executeUpdate();
        } catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }

    public static option findSquadById(int id){

        try(Connection connection =  sql2o.open()){
            String query = "SELECT * FROM animals WHERE not deleted AND id = animalId;";
            connection.createQuery(query)
                    .addParameter("id",id)
                    .executeAndFetch( Animal.class );

            System.out.println(id);
            return null;
        } catch (Exception exception){
            System.out.println(exception.getMessage());
            return null;
        }

    }
    public static List<option> getAnimalOption() {
        try (Connection connection = sql2o.open()) {
            String query = "SELECT id,name as text from animals";
            List<option> listOption = connection.createQuery( query )
                    .executeAndFetch( option.class );
            System.out.println( listOption );
            return listOption;
        } catch (Exception exception) {
            System.out.println( exception.getMessage() );
            return null;
        }


    }


}

