package com.bugtracker;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BugDAO {

    // Add Bug
    public void addBug(Bug bug) {

        String sql = "INSERT INTO bugs(title,description,priority,status,reported_by) VALUES(?,?,?,?,?)";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, bug.getTitle());
            ps.setString(2, bug.getDescription());
            ps.setString(3, bug.getPriority());
            ps.setString(4, bug.getStatus());
            ps.setString(5, bug.getReportedBy());

            int rows = ps.executeUpdate();

            if(rows > 0) {
                System.out.println("Bug Added Successfully");
            }

            ps.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    // View Bugs
    public void viewAllBugs() {

        String sql = "SELECT * FROM bugs";

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n==============================");

            while(rs.next()) {

                System.out.println("Bug ID       : " + rs.getInt("bug_id"));
                System.out.println("Title        : " + rs.getString("title"));
                System.out.println("Description  : " + rs.getString("description"));
                System.out.println("Priority     : " + rs.getString("priority"));
                System.out.println("Status       : " + rs.getString("status"));
                System.out.println("Reported By  : " + rs.getString("reported_by"));

                System.out.println("------------------------------");

            }

            rs.close();
            st.close();
            con.close();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    // Search Bug
    public void searchBug(int id) {

        String sql = "SELECT * FROM bugs WHERE bug_id=?";

        try {

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,id);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                System.out.println("Bug Found");

                System.out.println("ID : " + rs.getInt("bug_id"));
                System.out.println("Title : " + rs.getString("title"));
                System.out.println("Description : " + rs.getString("description"));
                System.out.println("Priority : " + rs.getString("priority"));
                System.out.println("Status : " + rs.getString("status"));
                System.out.println("Reported By : " + rs.getString("reported_by"));

            }
            else {

                System.out.println("Bug Not Found");

            }

            rs.close();
            ps.close();
            con.close();

        } catch(Exception e) {

            e.printStackTrace();

        }

    }

    // Update Bug Status
    public void updateBugStatus(int id,String status) {

        String sql="UPDATE bugs SET status=? WHERE bug_id=?";

        try {

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1,status);
            ps.setInt(2,id);

            int rows=ps.executeUpdate();

            if(rows>0)
                System.out.println("Status Updated Successfully");
            else
                System.out.println("Bug Not Found");

            ps.close();
            con.close();

        }
        catch(Exception e){

            e.printStackTrace();

        }

    }

    // Delete Bug
    public void deleteBug(int id) {

        String sql="DELETE FROM bugs WHERE bug_id=?";

        try {

            Connection con=DBConnection.getConnection();

            PreparedStatement ps=con.prepareStatement(sql);

            ps.setInt(1,id);

            int rows=ps.executeUpdate();

            if(rows>0)
                System.out.println("Bug Deleted Successfully");
            else
                System.out.println("Bug Not Found");

            ps.close();
            con.close();

        }
        catch(Exception e){

            e.printStackTrace();

        }

    }

}