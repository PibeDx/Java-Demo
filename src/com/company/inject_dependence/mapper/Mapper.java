package com.company.inject_dependence.mapper;

import java.util.List;

/**
 * Created by iPibeDx on 27/11/16.
 */
public interface Mapper<M, T> {
    M tranform (T t);
    M tranform(M m, T t);
    //List<M> tranformList(List<T> tList);
}