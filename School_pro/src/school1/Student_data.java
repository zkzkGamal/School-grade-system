
package school1;

import java.sql.ResultSet;
import java.sql.SQLException;
import school1.Connect;

public class Student_data extends Connect{
    private static ResultSet rs1;
    static String id;
    static String Fname;
    static String Lname;
    static String ARG;
    static String ENG;
    static String MATHG;
    static String ScienceG;
    static String SSG;
    static String CPG;
    private static float GPAT;
    public static void getData(String userN){
        try{
            rs = st.executeQuery("Select * from SCHOOL1.STD "
                    + "where STD_USRN = '" + userN + "'");
            rs.next();
            id = rs.getString("STD_ID");
            Fname = rs.getString("STD_FNAME");
            Lname = rs.getString("STD_LNAME");
        }catch(SQLException e){
            System.out.println("error");
        }     
    }
    public static void getGrades(String trem){
        try{
            rs = st.executeQuery("Select * from SCHOOL1.COURSE "
                        + "where STD_ID = '" + id + "'and trem = '" + trem +"'");
            rs.next();
            ARG = rs.getString("ARABIC");
            MATHG = rs.getString("MATH");
            ENG = rs.getString("ENGLISH");
            ScienceG = rs.getString("SCIENCE");
            SSG = rs.getString("SOCIAL_STADIES");
            CPG = rs.getString("COMPUTER");
        }catch(SQLException x){
            System.out.println("error");
        }
    }
    
    public String getGPA(){
        float sub1 = Float.parseFloat(ARG);
        float sub2 = Float.parseFloat(MATHG);
        float sub3 = Float.parseFloat(ENG);
        float sub4 = Float.parseFloat(ScienceG);
        float sub5 = Float.parseFloat(SSG);
        float sub6 = Float.parseFloat(CPG);
        float GPA = (float)((sub1+sub2+sub3+sub4+sub5+sub6) / 600)*100;
        return GPA+"";
    }
      
    public String TotalGPA(){
        try{
            getGrades("1");
            float sub1 = Float.parseFloat(ARG);
            float sub2 = Float.parseFloat(MATHG);
            float sub3 = Float.parseFloat(ENG);
            float sub4 = Float.parseFloat(ScienceG);
            float sub5 = Float.parseFloat(SSG);
            float sub6 = Float.parseFloat(CPG);
            float GPA1 = (float)((sub1+sub2+sub3+sub4+sub5+sub6) / 600)*100;
            rs = st.executeQuery("Select * from SCHOOL1.COURSE "
                        + "where STD_ID = '" + id + "'and trem = '" + "2" +"'");
            rs.next();
            String ARG1 = rs.getString("ARABIC");
            String MATHG1 = rs.getString("MATH");
            String ENG1= rs.getString("ENGLISH");
            String ScienceG1 = rs.getString("SCIENCE");
            String SSG1 = rs.getString("SOCIAL_STADIES");
            String CPG1 = rs.getString("COMPUTER");
            float sub7 = Float.parseFloat(ARG1);
            float sub8 = Float.parseFloat(MATHG1);
            float sub9 = Float.parseFloat(ENG1);
            float sub10 = Float.parseFloat(ScienceG1);
            float sub11 = Float.parseFloat(SSG1);
            float sub12 = Float.parseFloat(CPG1);
            float GPA2 = (float)((sub7+sub8+sub9+sub10+sub11+sub12) / 600)*100;
            
            GPAT = (float) (GPA1 + GPA2) / 2 ;
            
        }catch(SQLException x){
            System.out.println("error");
        }
        return GPAT+"";
    }
    
    public String getId() {
        return id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public  String getARG() {
        return ARG;
    }

    public  String getENG() {
        return ENG;
    }

    public  String getMATHG() {
        return MATHG;
    }

    public  String getScienceG() {
        return ScienceG;
    }

    public  String getSSG() {
        return SSG;
    }

    public  String getCPG() {
        return CPG;
    }
    
}
