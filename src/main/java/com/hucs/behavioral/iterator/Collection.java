package com.hucs.behavioral.iterator;

interface Collection<T> {
    Iterator<T> createIterator();
}
