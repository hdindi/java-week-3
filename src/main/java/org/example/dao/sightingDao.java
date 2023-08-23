package org.example.dao;


import org.example.config.DatabaseConfig;
import org.example.dto.option;
import org.example.models.Ranger;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import java.util.List;

public class sightingDao {
    private static final Sql2o sql2o = DatabaseConfig.getDatabase();

    public static void create(Ranger ranger) {
        try (Connection connection = sql2o.open()) {
            String query = "INSERT INTO rangers (name) VALUES (:name);";
            connection.createQuery( query )
                    .addParameter( "name", ranger.getName() )
                    .executeUpdate();
        } catch (Exception exception) {
            System.out.println( exception.getMessage() );
        }
    }

    public static List<option> getRangerOption() {
        try (Connection connection = sql2o.open()) {
            String query = "SELECT id,name as text from rangers";
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
