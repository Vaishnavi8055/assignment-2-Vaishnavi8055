/*
 *  Created by IntelliJ IDEA.
 *  User: Vaishnavi
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.student;

import java.util.Scanner;

// to store student information and properties
public class Student {
    private String studentName;
    private int studentUnivRollNumber;
    private int studentTotalBackLogs;
    private int studentApperingCount;
    private Scanner scanner;

    public Student() {
        scanner = new Scanner(System.in);
        System.out.println("Name of Student : ");
        this.studentName = scanner.next();
        System.out.println("University RollNumber of Student : ");
        this.studentUnivRollNumber = scanner.nextInt();
        System.out.println("Number Of Backlogs Of a Student : ");
        this.studentTotalBackLogs = scanner.nextInt();
        System.out.println("Appering Count Of Student : ");
        this.studentApperingCount = scanner.nextInt();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentUnivRollNumber() {
        return studentUnivRollNumber;
    }

    public void setStudentUnivRollNumber(int studentUnivRollNumber) {
        this.studentUnivRollNumber = studentUnivRollNumber;
    }

    public int getStudentTotalBackLogs() {
        return studentTotalBackLogs;
    }

    public void setStudentTotalBackLogs(int studentTotalBackLogs) {
        this.studentTotalBackLogs = studentTotalBackLogs;
    }

    public int getStudentApperingCount() {
        return studentApperingCount;
    }

    public void setStudentApperingCount(int studentApperingCount) {
        this.studentApperingCount = studentApperingCount;
    }

    public String toString(){
        return "Name="+studentName+ "  "+
                ", rollnumber="+studentUnivRollNumber+
                ", backlogs="+studentTotalBackLogs+
                ", apperingCount="+studentApperingCount;
    }
}