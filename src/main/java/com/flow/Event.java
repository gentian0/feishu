package com.flow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: kong
 * @Date: 2022/7/8 15:33
 * @Description: 事件
 */

public class Event {

    String name;
    LocalDateTime start;
    LocalDateTime end;
    String description;

    public static void create(Event event){

    }

    public Event(String name, LocalDateTime start, LocalDateTime end, String description) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.description = description;
    }

    public void update(){}

    public void delete(){}

    public static List<Event> select(){
        return new ArrayList<>();
    }
}
