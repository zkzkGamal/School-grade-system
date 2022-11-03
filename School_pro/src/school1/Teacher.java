/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school1;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;
import static school1.Connect.rs;
import static school1.School1.primaryStage;

/**
 *
 * @author boys
 */
public class Teacher extends Connect {
    course c2 = new course();
    static  Label label1 = new Label("teacher_name :     ");
    static Label label3 =new Label("name");//for changing name
    static Label label4 = new Label("teacher_id :     ");
    static Label label11=new Label("id");//for changing id
    static Label label2 = new Label("Student_Id :     "); 
    static TextField fi2=new TextField();
    static Label label12 = new Label("semester :     ");
    static TextField fi3=new TextField();
    static Label label5 = new Label("Arabic :   ");
    static TextField fi5=new TextField();
    static Label label6 = new Label("English :   ");  
    static TextField fi6=new TextField();
    static Label label7 = new Label("Science :   ");
    static TextField fi7=new TextField();
    static Label label8 = new Label("Math :   ");
    static TextField fi8=new TextField();
    static Label label9 = new Label("Computer :   ");
    static TextField fi9=new TextField();
    static Label label10 = new Label("Social_studies :   ");
    static TextField fi10=new TextField();
    
    
    
    public Teacher(String x){
        try{
            rs = st.executeQuery("select * from SCHOOL1.TEACHER where TEACHER_USRN = '"+x+"'");
            rs.next();
            String Teacher_id= rs.getString("TEACHER_ID");
            String Teacher_Fname=rs.getString("TEACHER_FNAME");
            String Teacher_Lname = rs.getString("TEACHER_LNAME");
            label11.setText(Teacher_id);
            label3.setText(Teacher_Fname+" "+ Teacher_Lname);
            primaryStage.setTitle("welcom " + x);
        }catch(SQLException e){}       
}
    
    //to clean textfeild
    private static void clean(){
        fi2.setText("");
        fi3.setText("");
        fi5.setText("");
        fi6.setText("");
        fi7.setText("");
        fi8.setText("");
        fi9.setText("");
        fi10.setText("");
        fi2.setEditable(true);
        fi3.setEditable(true);
    }
    
    
    public static void teach(){
        fi2.setMaxWidth(200);
         fi7.setMaxWidth(300);
        fi6.setMaxWidth(300);
        fi3.setMaxWidth(200);
        fi8.setMaxWidth(200); 
        fi5.setMaxWidth(200); 
        fi9.setMaxWidth(300);
        fi10.setMaxWidth(300);

        Button button1 = new Button("Upddate");
         button1.setMaxWidth(700);
         Button button2 = new Button("Delete");
         button2.setMaxWidth(100);
         Button button3 = new Button("ADD");
          button3.setMaxWidth(100);
         GridPane grid=new GridPane();
        grid.setAlignment(Pos.CENTER);
         grid.add(label1, 0, 1);
         grid.add(label3,1,1);
         grid.add(label4,0,2);
          grid.add(label11,1,2);
            grid.add(label2, 0, 3);
         grid.add(fi2,1,3); 
          grid.add(label12, 0, 4);
         grid.add(fi3,1,4);
          grid.add(label5,0,5);
          grid.add(fi5,1,5);
         grid.setHgap(30);
          grid.add(label6,2,5);
          grid.add(fi6,3,5);
           grid.add(label7,4,5);
          grid.add(fi7,5,5);
           grid.add(label8,0,6);
          grid.add(fi8,1,6);
          grid.add(label9,2,6);
          grid.add(fi9,3,6);
           grid.add(label10,4,6);
          grid.add(fi10,5,6);
          grid.setVgap(30);
          grid.add(button1, 0, 7);
           grid.add(button2, 3, 7);
           grid.add(button3, 5, 7);
       
     ObservableList<course>list=FXCollections.observableArrayList();
        
     
      TableView<course> ta=new TableView<>(list);
      TableColumn <course,String>id=new TableColumn<>("student_id");
     id.setCellValueFactory(new PropertyValueFactory<>("st_id"));
      
      TableColumn <course,Double>arabic=new TableColumn<>("Arabic");
      arabic.setCellValueFactory(new PropertyValueFactory("Arabic"));
      
        TableColumn <course,Double>english=new TableColumn<>("English");
      english.setCellValueFactory(new PropertyValueFactory<>("English"));
      
     TableColumn <course,Double>science=new TableColumn<>("science");
      science.setCellValueFactory(new PropertyValueFactory("Science"));
     
      TableColumn <course,Double>math=new TableColumn<>("math");
      math.setCellValueFactory(new PropertyValueFactory("math"));
     
      TableColumn <course,Double>computer=new TableColumn<>("computer");
      computer.setCellValueFactory(new PropertyValueFactory("computer"));
     
      TableColumn <course,Double>Social_studies=new TableColumn<>("Social_studies");
      Social_studies.setCellValueFactory(new PropertyValueFactory("Social_studies"));
      TableColumn <course,String>semester=new TableColumn<>("semester");
      semester.setCellValueFactory(new PropertyValueFactory("semester"));
      
     ta.setPrefSize(630, 360);
     
     
     
     TableView.TableViewSelectionModel<course>tv=ta.getSelectionModel();
     tv.selectedItemProperty().addListener((ObservableValue<? extends course> observable, course oldValue, course newValue) -> {
     
         fi2.setText(newValue.getSt_id());
         fi2.setEditable(false);
         fi3.setText(newValue.getSemester());
         fi3.setEditable(false);
         fi5.setText(newValue.getArabic()+"");
         fi6.setText(newValue.getEnglish()+"");
         fi7.setText(newValue.getScience()+"");
         fi8.setText(newValue.getMath()+"");
         fi9.setText(newValue.getComputer()+"");
         fi10.setText(newValue.getSocial_studies()+"");
         
         
         
         button2.setOnAction(event -> {
             try {
                 course c1 = new course();
                 String I_D = fi2.getText();
                 String Tr = fi3.getText();
                 c1.Delete(I_D, Tr);
                 rs = st.executeQuery("select * from SCHOOL1.COURSE");
                 list.clear();
                 while(rs.next()){
                     list.add(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                             ,rs.getDouble("MATH")
                             ,rs.getDouble("ENGLISH")
                             ,rs.getDouble("SCIENCE")
                             ,rs.getDouble("COMPUTER")
                             ,rs.getDouble("SOCIAL_STADIES"),
                             rs.getString("trem")));
                     
                     list.remove(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                             ,rs.getDouble("MATH")
                             ,rs.getDouble("ENGLISH")
                             ,rs.getDouble("SCIENCE")
                             ,rs.getDouble("COMPUTER")
                             ,rs.getDouble("SOCIAL_STADIES"),
                             rs.getString("trem")));
                     clean();
                 }
                 Component JavaFXApplication3 = null;
                    JOptionPane.showMessageDialog(JavaFXApplication3,"Data deleted");
             } catch (SQLException ex) {}
         });
         //button (Update)
         button1.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                try{
                    course c1 = new course();
                    String n1=fi5.getText();
                    String n2=fi6.getText();
                    String n3=fi7.getText();
                    String n4=fi8.getText();
                    String n5=fi9.getText();
                    String n6=fi10.getText();
                    String I_D = fi2.getText();
                    String Tr = fi3.getText();
                    c1.Update(n1,n2,n3,n4,n5,n6,I_D,Tr);
                    rs = st.executeQuery("select * from SCHOOL1.COURSE");
                    list.clear();
                    while(rs.next()){
                        list.add(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                            ,rs.getDouble("MATH")
                            ,rs.getDouble("ENGLISH")
                            ,rs.getDouble("SCIENCE")
                            ,rs.getDouble("COMPUTER")
                            ,rs.getDouble("SOCIAL_STADIES"),
                            rs.getString("trem")));

                        list.remove(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                            ,rs.getDouble("MATH")
                            ,rs.getDouble("ENGLISH")
                            ,rs.getDouble("SCIENCE")
                            ,rs.getDouble("COMPUTER")
                            ,rs.getDouble("SOCIAL_STADIES"),
                            rs.getString("trem")));
                        clean();
                    }
                    Component JavaFXApplication3 = null;
                    JOptionPane.showMessageDialog(JavaFXApplication3,"Data Uploaded");
                }catch(SQLException e){
                    System.out.println("error");
                }
             }
         });
        });
     //button (add)
       button3.setOnAction(event -> {
           course c1 = new course();
            String n7=fi5.getText();//ar
            String n8=fi6.getText();//en
            String n9=fi7.getText();//sc
            String n10=fi8.getText();//ma
            String n11=fi9.getText();//cp
            String n12=fi10.getText();//social_s
            String I_D = fi2.getText();
            String Tr = fi3.getText();
            c1.Add(n7, n10, n8, n9, n12, n11, I_D, Tr);
        for(int i=0;i<=list.size();i++)
       {  
         double n1=Double.parseDouble(fi5.getText());
         double n2=Double.parseDouble(fi6.getText());
         double n3=Double.parseDouble(fi7.getText());
         double n4=Double.parseDouble(fi8.getText());
         double n5=Double.parseDouble(fi9.getText());
         double n6=Double.parseDouble(fi10.getText());
       
         list.add(new course(fi2.getText(),n1,n2,n3,n4,n5,n6,fi3.getText()));
        break; 
       }
        Component JavaFXApplication3 = null;
        JOptionPane.showMessageDialog(JavaFXApplication3,"Data added");
       });                   
     ta.getColumns().addAll(id,arabic,english,science,math,computer,Social_studies,semester);
     grid.add(ta, 1 , 8 , 4 , 4);
     
     try{
            rs = st.executeQuery("select * from SCHOOL1.COURSE");
            while(rs.next()){
                list.add(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                ,rs.getDouble("MATH")
                ,rs.getDouble("ENGLISH")
                ,rs.getDouble("SCIENCE")
                ,rs.getDouble("COMPUTER")
                ,rs.getDouble("SOCIAL_STADIES"),
                rs.getString("trem")));

                list.remove(new course(rs.getString("STD_ID"),rs.getDouble("Arabic")
                ,rs.getDouble("MATH")
                ,rs.getDouble("ENGLISH")
                ,rs.getDouble("SCIENCE")
                ,rs.getDouble("COMPUTER")
                ,rs.getDouble("SOCIAL_STADIES"),
                rs.getString("trem")));
            }
        }catch(SQLException e){}
     
        //color of form
        button2.setStyle("-fx-background-color: #FF6464; -fx-text-fill: white;"); 
        button3.setStyle("-fx-background-color: #68F689; -fx-text-fill: white;");
        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        grid.setStyle("-fx-background-color:linear-gradient(#1A9A9E, #031C51);");
        label1.setStyle("-fx-font-weight: bold; ");//background-color
        label3.setStyle("-fx-font-weight: bold; ");
        label4.setStyle("-fx-font-weight: bold; ");
        label11.setStyle("-fx-font-weight: bold; ");
        label2.setStyle("-fx-font-weight: bold; ");  
         label12.setStyle("-fx-font-weight: bold; ");
          label5.setStyle("-fx-font-weight: bold; ");
           label6.setStyle("-fx-font-weight: bold; ");
            label7.setStyle("-fx-font-weight: bold; ");
             label8.setStyle("-fx-font-weight: bold; ");
              label9.setStyle("-fx-font-weight: bold; ");
               label10.setStyle("-fx-font-weight: bold; ");
    ta.setStyle("-fx-selection-bar: #00ffff");
    //show scene
        Scene scene =new Scene(grid,950,950);
     
      primaryStage.setScene(scene);
     primaryStage.show();

        }
}
