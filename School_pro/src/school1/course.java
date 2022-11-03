
package school1;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class course extends Connect {
    
    public String Teacher_id;
    public String Teacher_Fname;
    public String Teacher_Lname;

     public String st_id;
      public double Arabic;
     public double English;
      public double Science;
      public double math;
     public double computer;
     public double Social_studies ;
     public String semester;

    course() {
        
    }
   

    public  String getSemester() {
        return semester;
    }

    public course(String st_id, double Arabic, double English, double Science, double math, double computer, double Social_studies,String semester) {
        this.st_id = st_id;
        this.Arabic = Arabic;
        this.English = English;
        this.Science = Science;
        this.math = math;
        this.computer = computer;
        this.Social_studies = Social_studies;
        this.semester = semester;
    }

    public  String getSt_id() {
        return st_id;
    }

    public  double getArabic() {
        return Arabic;
    }

    public  double getEnglish() {
        return English;
    }

    public  double getScience() {
        return Science;
    }

    public  double getMath() {
        return math;
    }

    public  double getComputer() {
        return computer;
    }

    public  double getSocial_studies() {
        return Social_studies;
    }

    public  void Update(String AR,String MA,String EN,String SC,String CP,String SS,String id,String tr){
        try{
            rs = st.executeQuery("update SCHOOL1.course set "
                                 + "ARABIC = "+AR+" ,english = " + MA
                                 +" ,science = "+EN +" ,math = " + SC
                                 +" ,computer = "+CP+" ,social_Stadies = "+SS
                                 + " where STD_ID = '"+id+"' and trem = '"+tr+"'");
            if(rs.next()){
            st_id=rs.getString("STD_ID");
            Arabic=rs.getDouble("Arabic");
            math=rs.getDouble("MATH");
           English =rs.getDouble("ENGLISH");
            Science=rs.getDouble("SCIENCE");
            computer=rs.getDouble("COMPUTER");
            Social_studies=rs.getDouble("SOCIAL_STADIES");
            semester=rs.getString("trem");
            Component JavaFXApplication3 = null;
            JOptionPane.showMessageDialog(JavaFXApplication3,"Data Uploaded");
            }else{
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3,"check your Database");
            }
        }catch(SQLException e){System.out.println("aaaa");}
    }
    
    public void Delete(String id,String tr){
        try {
            rs = st.executeQuery("delete from SCHOOL1.course where STD_ID = '"+id+"' and trem = '"+tr+"'");
            rs.next();
        } catch (SQLException ex) {}
    }
    
    public void Add(String ar,String ma,String en,String sc,String ss,String cp,String id,String tr){
        try{
            String Query = "insert into SCHOOL1.COURSE   values('" 
                       + ar + "','" + ma +"','"+ en
                       +"','"+ sc +"','"+ ss +"','"+ cp +"','"
                       + id +"','"+tr+"')";
               rs= st.executeQuery(Query);
       }catch(SQLException e){ 
           Component JavaFXApplication3 = null;
           JOptionPane.showMessageDialog(JavaFXApplication3,"check your Database");
       }
    }
}
