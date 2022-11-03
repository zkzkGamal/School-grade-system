
package school1;
import java.awt.Component;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import static school1.School1.primaryStage;

public class Login extends Connect{
     private static void teacherL(String a,String b){
        try{
            rs = st.executeQuery( "select * from School1.TEACHER_ACC where TEACHER_USRN = '" + a +"' and TEACHER_PASS = '" + b + "'");
            if(rs.next()){
                System.out.println("welcome " + rs.getString("TEACHER_USRN"));
                Teacher t1 = new Teacher(a);
                Teacher.teach();
            }else{
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3,"check your user name or password");
            }
        }catch(SQLException e){
            System.out.println("error");
            e.printStackTrace();
        }
    } 
     
    private static void StdL(String s,String q,Stage primaryStage) {
        try{
            rs = st.executeQuery( "select * from School1.STD_ACC where STD_USRN = '" + s +"' and STD_PASS = '" + q + "'");
            if(rs.next()){
                System.out.println("welcome " + rs.getString("STD_USRN"));
                Student std1 = new Student(s);
                std1.show();
                primaryStage.close();
            }else{
                Component JavaFXApplication3 = null;
                JOptionPane.showMessageDialog(JavaFXApplication3, "check your user name or password");
            }
        }catch(SQLException e){
            System.out.println("error");
            e.printStackTrace();
        }
    } 
    public  void log(){
        GridPane g1 = new GridPane();
        g1.setAlignment(Pos.CENTER);
        g1.setHgap(5);
        g1.setVgap(5);
        g1.setPadding(new Insets(25,20,25,20));
        
        Scene scene = new Scene(g1, 520, 250);
        
        Label h1 = new Label("Welcom to login page");
        h1.setId("h1");
        Label about = new Label("this a login page for student to know his grades and teacher to add or edit grades");
        about.setId("about");
        
        Text t1 = new Text("login : ");
        t1.setFont(Font.font("Tahome", FontWeight.LIGHT, 0));
        
        Label clack = new Label("Forget your password Click ");
        clack.setVisible(false);
        clack.setId("forget");
        
        Hyperlink here = new Hyperlink("here");
        here.setVisible(false);
        here.setId("here");
        
        Label usrnl = new Label("Enter your user name : ");
        final TextField usrnt = new TextField();
        
        Label passwordL = new Label("Enter your password : ");
        final PasswordField passwordT = new PasswordField();
         
        Button login = new Button("Teacher Login");
        login.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        login.setOnAction(event->{
            String x = usrnt.getText();
            String y = passwordT.getText();
            teacherL(x, y);
            //if login falied go to forget 
            passwordT.setText("");
            clack.setVisible(true);
            here.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ForgetPass.Teacher(primaryStage,x);
                }
            });
            here.setVisible(true);
        });
        

        Button LoginS = new Button("Student Login");
        LoginS.setFont(Font.font("Tahome", FontWeight.BOLD, 12));
        LoginS.setOnAction(event->{
            String xx = usrnt.getText();
            String yy = passwordT.getText();
            StdL(xx, yy,primaryStage);
            passwordT.setText("");
            clack.setVisible(true);
             here.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    ForgetPass.Student(primaryStage,xx);
                }
            });
            here.setVisible(true);
        });
        
        Button close = new Button("Close");
        close.setFont(Font.font("Tahome", FontWeight.BOLD, 12));       
        
        usrnl.setId("us");
        passwordL.setId("ps");
        scene.getStylesheets().add(Login.class.getResource("Login_Style.css").toExternalForm());
        
        g1.add(t1, 0, 0, 3, 1);
        g1.add(h1, 1, 1);
        g1.add(usrnl, 0, 3);
        g1.add(usrnt, 1, 3);
        g1.add(passwordL, 0, 5);
        g1.add(passwordT, 1, 5);
        g1.add(clack, 0, 6);
        g1.add(here, 1, 6);
        g1.add(login, 0, 7);
        g1.add(LoginS,1,7);
        g1.add(close,2,7);
        
        primaryStage.setTitle("Login!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        close.setOnAction(event->{
            primaryStage.close();
        });
    }
}
