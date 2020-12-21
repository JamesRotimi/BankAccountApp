package com.company;

public interface IBaseRate {
    default double rate() {
        return .25;
    }
}
