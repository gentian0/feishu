package com.flow;

import com.app.CalendarApp;
import com.service.CalendarService;
import com.web.CalendarWeb;

/**
 * @Author: kong
 * @Date: 2022/7/8 17:14
 * @Description:
 */

public class CalendarFactory {
    public static Calendar create(String name){
        if ("service".equals(name)){
            return new CalendarService();
        }else if ("app".equals(name)){
            return new CalendarApp();
        }else if ("web".equals(name)){
            return new CalendarWeb();
        }else {
            return new CalendarService();
        }

    }
}
