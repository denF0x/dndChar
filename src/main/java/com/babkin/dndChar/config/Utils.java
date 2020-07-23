package com.babkin.dndChar.config;

import com.babkin.dndChar.models.enums.CustomEnum;

public class Utils {

    public static String getRealName(CustomEnum item){
        if(Global.lang.equals("ru")) {
            return item.getRussianName();
        }
        return item.getName();
    }
 }
