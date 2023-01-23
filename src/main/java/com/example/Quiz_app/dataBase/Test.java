package com.example.Quiz_app.dataBase;

import jakarta.persistence.*;

@Entity
public class Test {

    @Id
    @SequenceGenerator(
            name = "test_id_sequence",
            sequenceName = "test_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "test_id_sequence"
    )

    private Integer testID;
    private String testName;

    public Test(){}

    public Test(Integer testID, String testName) {
        this.testID = testID;
        this.testName = testName;
    }

    public Integer getTestID() {
        return testID;
    }

    public void setTestID(Integer testID) {
        this.testID = testID;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
}
