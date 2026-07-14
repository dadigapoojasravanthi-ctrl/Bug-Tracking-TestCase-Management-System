package com.bugtracker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BugDAO bugDAO = new BugDAO();
        TestCaseDAO testCaseDAO = new TestCaseDAO();

        while (true) {

            System.out.println("\n===========================================");
            System.out.println(" BUG TRACKING & TEST CASE MANAGEMENT SYSTEM");
            System.out.println("===========================================");
            System.out.println("--------------- BUG MODULE ----------------");
            System.out.println("1. Add Bug");
            System.out.println("2. View All Bugs");
            System.out.println("3. Search Bug");
            System.out.println("4. Update Bug Status");
            System.out.println("5. Delete Bug");
            System.out.println("-------------------------------------------");
            System.out.println("------------ TEST CASE MODULE -------------");
            System.out.println("6. Add Test Case");
            System.out.println("7. View All Test Cases");
            System.out.println("8. Search Test Case");
            System.out.println("9. Update Test Case Status");
            System.out.println("10. Delete Test Case");
            System.out.println("-------------------------------------------");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                System.out.print("Enter Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Description: ");
                String description = sc.nextLine();

                System.out.println("\nSelect Priority");
                System.out.println("1. High");
                System.out.println("2. Medium");
                System.out.println("3. Low");
                System.out.print("Enter Choice: ");

                int priorityChoice = sc.nextInt();
                sc.nextLine();

                String priority;

                switch (priorityChoice) {

                case 1:
                    priority = "High";
                    break;

                case 2:
                    priority = "Medium";
                    break;

                case 3:
                    priority = "Low";
                    break;

                default:
                    priority = "Low";
                }

                System.out.println("\nSelect Status");
                System.out.println("1. Open");
                System.out.println("2. In Progress");
                System.out.println("3. Resolved");
                System.out.println("4. Closed");
                System.out.print("Enter Choice: ");

                int statusChoice = sc.nextInt();
                sc.nextLine();

                String status;

                switch (statusChoice) {

                case 1:
                    status = "Open";
                    break;

                case 2:
                    status = "In Progress";
                    break;

                case 3:
                    status = "Resolved";
                    break;

                case 4:
                    status = "Closed";
                    break;

                default:
                    status = "Open";
                }

                System.out.print("Reported By: ");
                String reportedBy = sc.nextLine();

                Bug bug = new Bug(title, description, priority, status, reportedBy);

                bugDAO.addBug(bug);

                break;

            case 2:

                bugDAO.viewAllBugs();

                break;

            case 3:

                System.out.print("Enter Bug ID: ");

                int bugId = sc.nextInt();

                bugDAO.searchBug(bugId);

                break;

            case 4:

                System.out.print("Enter Bug ID: ");

                int updateId = sc.nextInt();
                sc.nextLine();

                System.out.println("\nSelect New Status");
                System.out.println("1. Open");
                System.out.println("2. In Progress");
                System.out.println("3. Resolved");
                System.out.println("4. Closed");
                System.out.print("Enter Choice: ");

                int updateChoice = sc.nextInt();
                sc.nextLine();

                String newStatus;

                switch (updateChoice) {

                case 1:
                    newStatus = "Open";
                    break;

                case 2:
                    newStatus = "In Progress";
                    break;

                case 3:
                    newStatus = "Resolved";
                    break;

                case 4:
                    newStatus = "Closed";
                    break;

                default:
                    newStatus = "Open";
                }

                bugDAO.updateBugStatus(updateId, newStatus);

                break;

            case 5:

                System.out.print("Enter Bug ID: ");

                int deleteId = sc.nextInt();

                bugDAO.deleteBug(deleteId);

                break;

            case 6:

                System.out.print("Enter Bug ID: ");
                int bId = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Test Case Name: ");
                String testName = sc.nextLine();

                System.out.print("Enter Expected Result: ");
                String expected = sc.nextLine();

                System.out.print("Enter Actual Result: ");
                String actual = sc.nextLine();

                System.out.println("\nSelect Test Status");
                System.out.println("1. Pass");
                System.out.println("2. Fail");
                System.out.println("3. Blocked");
                System.out.print("Enter Choice: ");

                int testChoice = sc.nextInt();
                sc.nextLine();

                String testStatus;

                switch (testChoice) {

                case 1:
                    testStatus = "Pass";
                    break;

                case 2:
                    testStatus = "Fail";
                    break;

                case 3:
                    testStatus = "Blocked";
                    break;

                default:
                    testStatus = "Pass";
                }

                TestCase tc = new TestCase(
                        bId,
                        testName,
                        expected,
                        actual,
                        testStatus);

                testCaseDAO.addTestCase(tc);

                break;
            case 7:

                testCaseDAO.viewAllTestCases();

                break;

            case 8:

                System.out.print("Enter Test Case ID: ");

                int searchTestId = sc.nextInt();

                testCaseDAO.searchTestCase(searchTestId);

                break;

            case 9:

                System.out.print("Enter Test Case ID: ");

                int updateTestId = sc.nextInt();
                sc.nextLine();

                System.out.println("\nSelect Test Status");
                System.out.println("1. Pass");
                System.out.println("2. Fail");
                System.out.println("3. Blocked");
                System.out.print("Enter Choice: ");

                int updateTestChoice = sc.nextInt();
                sc.nextLine();

                String updatedStatus;

                switch (updateTestChoice) {

                    case 1:
                        updatedStatus = "Pass";
                        break;

                    case 2:
                        updatedStatus = "Fail";
                        break;

                    case 3:
                        updatedStatus = "Blocked";
                        break;

                    default:
                        updatedStatus = "Pass";
                }

                testCaseDAO.updateTestCaseStatus(updateTestId, updatedStatus);

                break;

            case 10:

                System.out.print("Enter Test Case ID: ");

                int deleteTestId = sc.nextInt();

                testCaseDAO.deleteTestCase(deleteTestId);

                break;

            case 11:

                System.out.println("\nThank You for using Bug Tracking & Test Case Management System!");

                sc.close();

                System.exit(0);

                break;

            default:

                System.out.println("Invalid Choice! Please Try Again.");

            }

        }

    }

}