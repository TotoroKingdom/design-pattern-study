package com.totoro.study_03_behavioral_model.study_03_interpreter_pattern;

/**
 * @author:totoro
 * @createDate:2023/3/22
 * @description:
 */
public interface Collection<E, L> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}
