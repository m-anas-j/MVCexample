package com.org;

public class StudentModel {
    private String studentName;
    private String semester;

    /**
     * This method will essentially communicate with the backend
     * database server and get the information that the user has
     * requested. For simplicity and sake of explanation, we are
     * hard-coding the values to make our lives easier. :)
    **/
    public void setStudentInfo(int id)
    {
        if (id==154443)
        {
            this.studentName = "Anas";
            this.semester = "1st";
        }
        else
        {
            this.studentName = "Idk";
            this.semester = "Irdk";
        }
    }

    public String getStudentName()
    {
        return studentName;
    }

    public String getSemester()
    {
        return semester;
    }
}
