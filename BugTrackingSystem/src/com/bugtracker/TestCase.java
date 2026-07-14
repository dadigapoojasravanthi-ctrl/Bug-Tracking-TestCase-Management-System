package com.bugtracker;

public class TestCase {

    private int testCaseId;
    private int bugId;
    private String testCaseName;
    private String expectedResult;
    private String actualResult;
    private String status;

    // Default Constructor
    public TestCase() {

    }

    // Parameterized Constructor
    public TestCase(int bugId, String testCaseName,
            String expectedResult, String actualResult,
            String status) {

        this.bugId = bugId;
        this.testCaseName = testCaseName;
        this.expectedResult = expectedResult;
        this.actualResult = actualResult;
        this.status = status;
    }

    public int getTestCaseId() {
        return testCaseId;
    }

    public void setTestCaseId(int testCaseId) {
        this.testCaseId = testCaseId;
    }

    public int getBugId() {
        return bugId;
    }

    public void setBugId(int bugId) {
        this.bugId = bugId;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}