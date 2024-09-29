package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.home;
import main.Keranjang;
import main.MenuBuah;
import main.Login;

public class profile extends Application{
		Label lblTitle, lblName, lblAlamat, lblNoHp, lbl1, lbl2,lbl3;
		Image profileImg, logoImg, homeLogo, categoryLogo, cartLogo, profileLogo, promoLogo;
		ImageView proImageView, loImageView,homeImgView, scheduleImgView, healthImgView, dogWalkImgView, 
				profileImgView;
		Button logoutBtn, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn;
		Rectangle rectNavbar, rectName, rectNoHp, rectAlamat, rectangtaskbar;
		StackPane spNavbar, spName, spNohp, spAlamat, spTaskBar;
		VBox titleVb, profileVb, userVb, mainVb, NAMEvB, NohpVb, AlamatVb, btnVb;
		HBox taskbar;
		
		Scene scene;
		
		public void init() {
			//Navbar
			logoImg = new Image(getClass().getResourceAsStream("Logo2.png"));
			loImageView = new ImageView(logoImg);
			loImageView.setFitHeight(50);
			loImageView.setFitWidth(50);
			rectNavbar = new Rectangle(400, 60);
			rectNavbar.setStyle("-fx-fill: #25995C;");
			spNavbar = new StackPane(rectNavbar, loImageView);
			
			//title
			lblTitle = new Label("My Profile");
			lblTitle.setFont(Font.font("Inter", FontWeight.BOLD, 24));
			titleVb = new VBox(lblTitle);
			titleVb.setAlignment(Pos.CENTER);
			titleVb.setPadding(new Insets(25,0,0,0));
			
			//image profile
			profileImg = new Image(getClass().getResourceAsStream("profileIcon.png"));
			proImageView = new ImageView(profileImg);
			proImageView.setFitHeight(120);
			proImageView.setFitWidth(120);
			profileVb = new VBox(proImageView);
			profileVb.setAlignment(Pos.CENTER);
			profileVb.setPadding(new Insets(25,0,20,0));
			
			//Info akun
			lbl1 = new Label("Name");
			lbl1.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			lblName = new Label("Vincent Andrean");
			lblName.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			lbl2 = new Label("No Handphone");
			lbl2.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			lblNoHp = new Label("08xxxxxxxxxx");
			lblNoHp.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			lbl3 = new Label("Address");
			lbl3.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			lblAlamat = new Label("Melrose Place");
			lblAlamat.setFont(Font.font("Inter", FontWeight.BOLD, 17));
			
			NAMEvB = new VBox(lblName);
			NAMEvB.setPadding(new Insets(5,0,0,10));
//			NAMEvB.setAlignment(Pos.CENTER_LEFT);
			NohpVb = new VBox(lblNoHp);
			NohpVb.setPadding(new Insets(5,0,0,10));
//			NohpVb.setAlignment(Pos.CENTER_LEFT);
			AlamatVb = new VBox(lblAlamat);
			AlamatVb.setPadding(new Insets(5,0,0,10));
//			AlamatVb.setAlignment(Pos.CENTER_LEFT);
			
			rectName = new Rectangle(300, 35);
			rectName.setStyle("-fx-fill: #25995C;");
			rectNoHp = new Rectangle(300, 35);
			rectNoHp.setStyle("-fx-fill: #25995C;");
			rectAlamat = new Rectangle(300, 35);
			rectAlamat.setStyle("-fx-fill: #25995C;");
			
			spName = new StackPane(rectName, NAMEvB);
			spName.setAlignment(Pos.CENTER_LEFT);
			spNohp = new StackPane(rectNoHp, NohpVb);
			spNohp.setAlignment(Pos.CENTER_LEFT);
			spAlamat = new StackPane(rectAlamat, AlamatVb);
			spAlamat.setAlignment(Pos.CENTER_LEFT);
			
			userVb = new VBox(2, lbl1, spName, lbl2, spNohp, lbl3, spAlamat);
			userVb.setAlignment(Pos.CENTER_LEFT);
			userVb.setPadding(new Insets(0,0,50,47));
			
			//btn logout
			logoutBtn = new Button("Log Out");
			logoutBtn.setStyle("-fx-background-color: #DF1F1F; -fx-text-fill: #FFFFFF;");
			logoutBtn.setPrefSize(143, 47);
			logoutBtn.setFont(Font.font("Inter", FontWeight.BOLD, 16));
			
			btnVb = new VBox(logoutBtn);
			btnVb.setAlignment(Pos.CENTER);
			btnVb.setPadding(new Insets(0,0,60,0));
			
			//Taskbar
			homeLogo = new Image(getClass().getResourceAsStream("home.png"));
	        homeImgView = new ImageView(homeLogo);
	        homeImgView.setFitHeight(50);
			homeImgView.setFitWidth(50);
			
			cartLogo = new Image(getClass().getResourceAsStream("cart.png"));
	        scheduleImgView = new ImageView(cartLogo);
	        scheduleImgView.setFitHeight(50);
			scheduleImgView.setFitWidth(50);
			
			categoryLogo = new Image(getClass().getResourceAsStream("category.png"));
	        healthImgView = new ImageView(categoryLogo);
	        healthImgView.setFitHeight(50);
			healthImgView.setFitWidth(50);
			
			promoLogo = new Image(getClass().getResourceAsStream("promo.png"));
	        dogWalkImgView = new ImageView(promoLogo);
	        dogWalkImgView.setFitHeight(50);
			dogWalkImgView.setFitWidth(50);
			
			profileLogo = new Image(getClass().getResourceAsStream("profile.png"));
	        profileImgView = new ImageView(profileLogo);
	        profileImgView.setFitHeight(50);
			profileImgView.setFitWidth(50);
			
			homeBtn = new Button();
	        homeBtn.setGraphic(homeImgView);
	        homeBtn.setStyle("-fx-background-color: #7CBD1E; ");
	        scheduleBtn = new Button();
	        scheduleBtn.setGraphic(scheduleImgView);
	        scheduleBtn.setStyle("-fx-background-color: #7CBD1E; ");
	        healthBtn = new Button();
	        healthBtn.setGraphic(healthImgView);
	        healthBtn.setStyle("-fx-background-color: #7CBD1E; ");
	        dogWalkBtn = new Button();
	        
	        dogProfileBtn = new Button();
	        dogProfileBtn.setGraphic(profileImgView);
	        dogProfileBtn.setStyle("-fx-background-color: #7CBD1E; ");
			
			rectangtaskbar = new Rectangle(400, 65);
			rectangtaskbar.setStyle("-fx-fill: #7CBD1E;");
			
			taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogProfileBtn);
			taskbar.setAlignment(Pos.BOTTOM_CENTER);
			taskbar.setPadding(new Insets(0, 0, 5, 0));
			
			spTaskBar = new StackPane();
			spTaskBar.getChildren().addAll(rectangtaskbar, taskbar);
			
			mainVb = new VBox(spNavbar, titleVb, profileVb, userVb, btnVb, spTaskBar);
			
			homeBtn.setOnAction(e -> {
			    home dogProfilePage = new home();
			    try {
			        dogProfilePage.start(new Stage());
			        // Tutup jendela HomePage
			        ((Stage) homeBtn.getScene().getWindow()).close();
			    } catch (Exception exception) {
			        exception.printStackTrace();
			    }
			});
			
			healthBtn.setOnAction(e -> {
			    MenuBuah healthPage = new MenuBuah();
			    try {
			        healthPage.start(new Stage());
			        // Tutup jendela HomePage
			        ((Stage) healthBtn.getScene().getWindow()).close();
			    } catch (Exception exception) {
			        exception.printStackTrace();
			    }
			});
			
			scheduleBtn.setOnAction(e -> {
			    Keranjang schedule2Page = new Keranjang();
			    try {
			        schedule2Page.start(new Stage());
			        // Tutup jendela HomePage
			        ((Stage) scheduleBtn.getScene().getWindow()).close();
			    } catch (Exception exception) {
			        exception.printStackTrace();
			    }
			});
			
			logoutBtn.setOnAction(e -> {
			    Login schedule2Page = new Login();
			    try {
			        schedule2Page.start(new Stage());
			        // Tutup jendela HomePage
			        ((Stage) logoutBtn.getScene().getWindow()).close();
			    } catch (Exception exception) {
			        exception.printStackTrace();
			    }
			});
			
			scene = new Scene(mainVb, 400, 700);
		}
		
	
        


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		init();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}


}