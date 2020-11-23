package com.lht.studay.core.annotation;

import java.util.List;

public interface AnnotationImpl {
    @Select(value = "select * from user")
    List<String> findAll();
}
