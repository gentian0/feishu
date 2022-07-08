package com.flow;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kong
 * @Date: 2022/7/8 15:32
 * @Description:
 */

public class Calendar {
    String name;
    String range;
    String color;
    String description;
    List<String> shareLists;


    public static void create(){

    }

    public void update(Calendar calendar){

    }

    public void delete(){}

    public static List<Calendar>select(){
        return new ArrayList<>();
    }

    public void addEvent(Event event){}

    public List<Event> listEvent() {
        return new ArrayList<>();
    }
}
