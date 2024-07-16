package com.mixidev.literalurachallenge.servicios;

public interface iDataConversion {

    <T> T convertData(String data, Class<T> classType);
}
