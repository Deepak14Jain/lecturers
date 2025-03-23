package com.deepak.lecturers.model;

public enum Department {
    COMPUTER_SCIENCE,
    MECHANICAL_ENGINEERING,
    ELECTRICAL_ENGINEERING,
    CIVIL_ENGINEERING,
    MATHEMATICS,
    PHYSICS,
    CHEMISTRY,
    BIOLOGY,
    BUSINESS_ADMINISTRATION,
    ECONOMICS,
    PSYCHOLOGY,
    ENGLISH,
    HISTORY;

    @Override
    public String toString() {
        return name().replace("_", " ");
    }
}
