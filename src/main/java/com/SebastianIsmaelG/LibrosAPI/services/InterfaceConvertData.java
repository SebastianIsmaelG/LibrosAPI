package com.SebastianIsmaelG.LibrosAPI.services;

public interface InterfaceConvertData {
    <T> T obtainData(String json,Class<T> tClass);
}
