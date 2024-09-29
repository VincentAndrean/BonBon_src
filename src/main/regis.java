package main;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
//import main.HomePage;
//import main.LogIn;

public class regis extends Application{
	
	Label lbltitle, lblname, lblcreatePass, lblconfPass, lblTac, lblLogin, lblloginPhone, lblloginGoogle, lblOr;
	TextField nameTf, emailTf, createPassTf, confPassTf;
	CheckBox cbTac;
	Button signUpBtn, loginPhoneBtn, loginGugelBtn;
	Rectangle rectangBorder, rectang1, rectang2;
	StackPane spPhone, spGugel, spBorder;
	VBox vb1, vb2, vb3, vb4, vb5, mainVb;
	HBox hboxTac;
	Scene scene;
	
	public void signUp() {
		lbltitle = new Label("SIGN UP");
		lbltitle.setFont(Font.font("Inter", FontWeight.BLACK, 28));
        lbltitle.setTextFill(Color.GREEN);
        
        nameTf = new TextField("Name");
        nameTf.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #7CBD1E; -fx-border-width: 0 0 2 0;");
        emailTf = new TextField("Phone number");
        emailTf.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #7CBD1E; -fx-border-width: 0 0 2 0;");
        createPassTf = new TextField("Address");
        createPassTf.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #7CBD1E; -fx-border-width: 0 0 2 0;");
        confPassTf = new TextField("Create password");
        confPassTf.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #7CBD1E; -fx-border-width: 0 0 2 0;");
        cbTac = new CheckBox();
        cbTac.setStyle("-fx-color: #7CBD1E; ");
        lblTac = new Label("I agree to the Terms and Conditions");
        lblTac.setFont(Font.font(12));
        
        signUpBtn = new Button("Sign Up");
        signUpBtn.setPrefSize(120, 15);
        signUpBtn.setStyle("-fx-background-color: #7CBD1E; ");
        signUpBtn.setFont(Font.font("Inter", FontWeight.BLACK, 16));
        signUpBtn.setTextFill(Color.BEIGE);
        
        loginPhoneBtn = new Button("Log in with Phone Number");
        loginPhoneBtn.setPrefSize(220, 35);
        loginPhoneBtn.setStyle("-fx-background-color: #7CBD1E; ");
        loginPhoneBtn.setFont(Font.font("Inter", FontWeight.BLACK, 13));
        loginPhoneBtn.setTextFill(Color.BEIGE);
        
        loginGugelBtn = new Button("Log in with Google");
        loginGugelBtn.setPrefSize(220, 35);
        loginGugelBtn.setStyle("-fx-background-color: #7CBD1E; ");
        loginGugelBtn.setFont(Font.font("Inter", FontWeight.BLACK, 13));
        loginGugelBtn.setTextFill(Color.BEIGE);
        
        
        
        lblLogin = new Label("Already have an account? Log in");
        lblOr = new Label("- Or -");
        lblloginPhone = new Label("Login with Phone Number");		
        lblloginPhone.setFont(Font.font("Inter", FontWeight.MEDIUM, 14));		
        lblloginPhone.setTextFill(Color.BEIGE);
        lblloginGoogle = new Label("Login with Google");
        lblloginGoogle.setFont(Font.font("Inter", FontWeight.MEDIUM, 14));
        lblloginGoogle.setTextFill(Color.BEIGE);
        
        vb1 = new VBox(lbltitle);
        vb1.setAlignment(Pos.CENTER);
        
        vb2 = new VBox(signUpBtn);
        vb2.setAlignment(Pos.CENTER);
        vb3 = new VBox(lblLogin);
        vb3.setAlignment(Pos.CENTER);
        vb4 = new VBox(lblOr);
        vb4.setAlignment(Pos.CENTER);
        
        rectang1 = new Rectangle(220, 35);
        rectang1.setStyle("-fx-fill: #7CBD1E; ");
        
        rectang2 = new Rectangle(220, 35);
        rectang2.setStyle("-fx-fill: #7CBD1E; ");
        spPhone = new StackPane(loginPhoneBtn);
        spGugel = new StackPane(loginGugelBtn);
        vb5 = new VBox(10, spPhone, spGugel);
        vb5.setAlignment(Pos.CENTER);
        
        rectangBorder = new Rectangle(320, 600, Color.BEIGE);
        rectangBorder.setArcHeight(20);
        rectangBorder.setArcWidth(20);
        
        
        hboxTac = new HBox(5, cbTac, lblTac);
        
        mainVb = new VBox(20, vb1, nameTf, emailTf, createPassTf, confPassTf, hboxTac, vb2, vb3
        					, vb4, vb5);
        mainVb.setPadding(new Insets(35,17,25,17));
//        mainVb.setStyle("-fx-background-color: #ADD8E6; ");
        
        
        spBorder = new StackPane();
        spBorder.setAlignment(Pos.CENTER);
        spBorder.setPadding(new Insets(70,70,70,70));
        spBorder.getChildren().addAll(rectangBorder, mainVb);
        spBorder.setStyle("-fx-background-color: #7CBD1E; ");
        
        signUpBtn.setOnAction(e -> {
		    Login loginPage = new Login();
		    try {
		        loginPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) signUpBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
        
//        signUpBtn.setOnAction(e -> {
//		    HomePage homePage = new HomePage();
//		    try {
//		        homePage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) signUpBtn.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
//        
//        loginGugelBtn.setOnAction(e -> {
//		    LogIn loginPage = new LogIn();
//		    try {
//		        loginPage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) loginGugelBtn.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
        
        scene = new Scene(spBorder, 400,700);
        scene.setFill(Color.GREEN);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		signUp();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
