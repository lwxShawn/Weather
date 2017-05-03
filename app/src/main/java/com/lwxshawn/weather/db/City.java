package com.lwxshawn.weather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by WellXiang on 2017/5/3.
 */

public class City extends DataSupport {

    private int id;

    private String cityName;

    private int cityCode;

    private int provinceId;
}
