package com.totoro.study_03_behavioral_model.study_03_interpreter_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
