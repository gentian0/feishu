package com.flow;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalendarTest {

    static Calendar calendarDefault;




    @BeforeAll
    public static void beforeAll(){
        calendarDefault = CalendarFactory.create(System.getenv("env"));

    }



    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void select() {
    }

    @Test
    void addEvent() {
        Calendar calendar =new Calendar();
        calendar.name="demo";

        Event event = new Event("demo event",null,null,null);
        calendar.addEvent(event);
        List<Event> listEvent= calendar.listEvent();
        assertTrue(listEvent.contains(event));
    }

    @Test
    void addEventFail() {
        calendarDefault.name="demo";

        Event event = new Event("demo event",null,null,null);
        calendarDefault.addEvent(event);
        List<Event> listEvent= calendarDefault.listEvent();
        assertFalse(listEvent.contains(event));
    }
}