
package school1;

import java.awt.Component;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.stage.Window;
import javax.swing.JOptionPane;
import static school1.School1.primaryStage;

public class ForgetPass extends Connect {
   
    private static void STDUP(String x,String y){
        try{
            rs = st.executeQuery("SELECT * FROM SCHOOL1.STD_ACC where STD_USRN = '"+ x +"'");
            if(rs.next()){
                rs= st.executeQuery("update SCHOOL1.STD_ACC set STD_PASS = '" + y + "' where STD_USRN = '" + x + "'");
                System.out.println("row updated");
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "row updated");
            }
            else{
                System.out.println("check");
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "row updated");
            }
        }catch(SQLException e){
            System.out.println("error");
        }  
    }
    
    private static void TeacherUP(String a,String b){
        try{
            rs = st.executeQuery("SELECT * FROM SCHOOL1.TEACHER_ACC where TEACHER_USRN = '"+ a +"'");
            if(rs.next()){
                rs= st.executeQuery("update SCHOOL1.TEACHER_ACC set TEACHER_PASS = '" + b + "' where TEACHER_USRN = '" + a + "'");
                System.out.println("row updated");
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "row updated");
            }
            else{
                System.out.println("check");
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "row updated");
            }
        }catch(SQLException e){
            System.out.println("erroraa");
        } 
    }
    
    public static void Student(Stage primaryStage,String user){
        //create the screen of the form
        GridPane g1 = new GridPane();
        g1.setAlignment(Pos.CENTER);
        g1.setHgap(5);
        g1.setVgap(5);
        g1.setPadding(new Insets(20,20,20,20));
        Scene scene = new Scene(g1, 380, 180);
        
        //frist row (username) 
        Label usrnl = new Label("Enter your user name : ");
        final TextField usrnt = new TextField();
        usrnt.setText(user);
        if(usrnt.getText().isEmpty()){
            usrnt.setEditable(true);
        }else{
            usrnt.setEditable(false);
        }
        //2sd row (password)
        Label passwordL = new Label("Enter your password : ");
        final PasswordField passwordT = new PasswordField();
        //3td row(confirming password)
        Label passwordLC = new Label("Confirm your password : ");
        final PasswordField passwordTC = new PasswordField();
        //create button to confirm data from student
        Button Confirm = new Button("Confirm");
        Confirm.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        Confirm.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    String us = usrnt.getText();
                    String ps = passwordT.getText();
                    String psCon = passwordTC.getText();
                    if(ps.equals(psCon)){
                        STDUP(us,ps );
                        Login ln = new Login();
                        ln.log();
                    }
                    else{
                        Component JavaFXApplication3 = null;
                        JOptionPane.showMessageDialog(JavaFXApplication3, "check your password");
                        passwordT.setText("");
                        passwordTC.setText("");
                    }
                }
            });
        //create button to back to main
        Button close = new Button("back");
        close.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        close.setOnAction(e->{
            Login ln = new Login();
            ln.log();
        });
        
        g1.add(usrnl, 0, 1);
        g1.add(usrnt, 1, 1);
        g1.add(passwordL, 0, 3);
        g1.add(passwordT, 1, 3);
        g1.add(passwordLC, 0, 5);
        g1.add(passwordTC, 1, 5);
        g1.add(Confirm, 0, 7);
        g1.add(close, 1, 7);
        
        scene.getStylesheets().add(Login.class.getResource("Forget_Style.css").toExternalForm());
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public static void Teacher(Stage primaryStage,String Tuser){
        GridPane g1 = new GridPane();
        g1.setAlignment(Pos.CENTER);
        g1.setHgap(5);
        g1.setVgap(5);
        g1.setPadding(new Insets(20,20,20,20));
        Scene scene = new Scene(g1, 380, 180);
        
        //user name row
        Label usrnl = new Label("Enter your user name : ");
        final TextField usrnt = new TextField();
        //check if user input data or not from the main
        usrnt.setText(Tuser);
        if(usrnt.getText().isEmpty()){
            usrnt.setEditable(true);
        }else{
            usrnt.setEditable(false);
        }
        //password row
        Label passwordL = new Label("Enter your password : ");
        final PasswordField passwordT = new PasswordField();
        //confirm password row
        Label passwordLC = new Label("Confirm your password : ");
        final PasswordField passwordTC = new PasswordField();
        //create button to confirm data from student
        Button Confirm = new Button("Confirm");
        Confirm.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        Confirm.setOnAction(event-> { 
            String us = usrnt.getText();
            String ps = passwordT.getText();
            String psCon = passwordTC.getText();
            if(ps.equals(psCon)){
                TeacherUP(us,ps );
                Login ln = new Login();
                ln.log();
            }
            else{
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "check your password");
                passwordT.setText("");
                passwordTC.setText("");
            }
        });
        //create button to back to main
        Button close = new Button("Back");
        close.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        close.setOnAction(e->{
            Login ln = new Login();
            ln.log();
        });
        
        g1.add(usrnl, 0, 1);
        g1.add(usrnt, 1, 1);
        g1.add(passwordL, 0, 3);
        g1.add(passwordT, 1, 3);
        g1.add(passwordLC, 0, 5);
        g1.add(passwordTC, 1, 5);
        g1.add(Confirm, 0, 7);
        g1.add(close, 1, 7);
        
        scene.getStylesheets().add(Login.class.getResource("Forget_Style.css").toExternalForm());
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
