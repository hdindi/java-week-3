package org.example.dto;

import org.example.configuration.Age;

public class animalOption {
    private int id;
    private String text;
    private String health;
    private String age;
    public animalOption(int id, String text,String health,String age) {
        this.id = id;         this.text = text;    this.health = health;  this.age=age;}
    public int getId()
    {         return id;     }     public String getText() {         return text;      }
    public String getHealth() {         return health;      } public String getAge() {         return age;      }
}

