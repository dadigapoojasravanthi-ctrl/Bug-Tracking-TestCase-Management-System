package com.bugtracker;

import java.sql.*;

public class TestCaseDAO {

    // Add Test Case
    public void addTestCase(TestCase testCase) {

        String sql = "INSERT INTO test_cases(bug_id, test_case_name, expected_result, actual_result, status) VALUES(?,?,?,?,?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, testCase.getBugId());
            ps.setString(2, testCase.getTestCaseName());
            ps.setString(3, testCase.getExpectedResult());
            ps.setString(4, testCase.getActualResult());
            ps.setString(5, testCase.getStatus());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Test Case Added Successfully");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // View All Test Cases
    public void viewAllTestCases() {

        String sql = "SELECT * FROM test_cases";

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n==============================");

            while (rs.next()) {

                System.out.println("Test Case ID    : " + rs.getInt("test_case_id"));
                System.out.println("Bug ID          : " + rs.getInt("bug_id"));
                System.out.println("Test Case Name  : " + rs.getString("test_case_name"));
                System.out.println("Expected Result : " + rs.getString("expected_result"));
                System.out.println("Actual Result   : " + rs.getString("actual_result"));
                System.out.println("Status          : " + rs.getString("status"));

                System.out.println("------------------------------");
            }

            rs.close();
            st.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Search Test Case
    public void searchTestCase(int id) {

        String sql = "SELECT * FROM test_cases WHERE test_case_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("Test Case Found");

                System.out.println("Test Case ID : " + rs.getInt("test_case_id"));
                System.out.println("Bug ID       : " + rs.getInt("bug_id"));
                System.out.println("Name         : " + rs.getString("test_case_name"));
                System.out.println("Expected     : " + rs.getString("expected_result"));
                System.out.println("Actual       : " + rs.getString("actual_result"));
                System.out.println("Status       : " + rs.getString("status"));

            } else {

                System.out.println("Test Case Not Found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Update Test Case Status
    public void updateTestCaseStatus(int id, String status) {

        String sql = "UPDATE test_cases SET status=? WHERE test_case_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, status);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Test Case Updated Successfully");
            else
                System.out.println("Test Case Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Delete Test Case
    public void deleteTestCase(int id) {

        String sql = "DELETE FROM test_cases WHERE test_case_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Test Case Deleted Successfully");
            else
                System.out.println("Test Case Not Found");

            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}