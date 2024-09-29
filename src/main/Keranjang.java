package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.MenuBuah;

public class Keranjang extends Application{
	
	Label lbltitle, lblVaksin, lblEat, lblEatSchedule, lblTime1, lblTime2, lblTime3, lblTime4, lblMeal1, lblMeal2
	, lblMeal3, lblMeal4, lblAddress, lblTotal, lblDelfee,lblSerfee , lblxxTotal , lblxxDelfee, lblxxSerfee, lblApple, lblHargaApple, lblTotalPrice;
	Rectangle rectangNavbar, rectang1, rectang2, rectang3, rectang4, rectang5, rectangtaskbar;
	Image homeLogo, dogwalkerLogo, healthLogo, scheduleLogo, profileLogo, artichelImg, dogImg, logoImg, appleImg;
	ImageView homeImgView, dogWalkImgView, healthImgView, scheduleImgView, 
			profileImgView, artichleImgView, dogImgView, logoImgView, appleImgView;
	Button  homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn, minus, plus, payBtn, backBtn;
	TextField quantity;
	HBox hbox2, hbox3, hbox4, hbox5, taskbar, totalHBox , delfeeHBox, serfeeHBox, quantityBox, payBox, titleHb;
	VBox vboxMeal, mainVb, labelVb, feeVBox, appleVB, backVb, titleVb;
	StackPane spNavbar, sp1, sp2, sp3, sp4, sp5, spTaskBar;
	Scene scene;
	
	public void cart() {
		lbltitle = new Label("My Cart");
		lbltitle.setFont(Font.font("Inter", FontWeight.BOLD, 25));
		lbltitle.setTextFill(Color.BLACK);
		
		lblAddress = new Label("Your Delivery Address");
		lblAddress.setFont(Font.font("Inter", FontWeight.BOLD, 20));
		lblAddress.setStyle("-fx-text-fill: #FFFFFF; ");
		
//		lblVaksin = new Label("Vaksin Schedule");
//		lblVaksin.setFont(Font.font("Inter", FontWeight.BLACK, 20));
//		lblVaksin.setStyle("-fx-text-fill: #A0DEFF; ");
		
		lblEat = new Label("Eat Schedule");
		lblEat.setFont(Font.font("Inter", FontWeight.BLACK, 20));
		lblEat.setStyle("-fx-text-fill: #5AB2FF; ");
		
		lblEatSchedule = new Label("Delivery Time");
		lblEatSchedule.setFont(Font.font("Inter", FontWeight.BOLD, 18));
		lblEatSchedule.setStyle("-fx-text-fill: #000000; ");
		
		lblTime1 = new Label("Regular (20- 30 Minutes)");
		lblTime1.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblTime1.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblTime2 = new Label("Premium (10 - 15 Minutes)");
		lblTime2.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblTime2.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblTime3 = new Label("16:00");
		lblTime3.setFont(Font.font("Inter", FontWeight.BLACK, 24));
		lblTime3.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblTime4 = new Label("20:00");
		lblTime4.setFont(Font.font("Inter", FontWeight.BLACK, 24));
		lblTime4.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblMeal1 = new Label("Rp 10.000");
		lblMeal1.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblMeal1.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblMeal2 = new Label("Rp 15.000");
		lblMeal2.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblMeal2.setStyle("-fx-text-fill: #FFFFFF; ");
		
		lblMeal3 = new Label("Meal3");
		lblMeal3.setFont(Font.font("Inter", FontWeight.BLACK, 24));
		lblMeal3.setStyle("-fx-text-fill: #5AB2FF; ");
		
		lblMeal4 = new Label("Meal4");
		lblMeal4.setFont(Font.font("Inter", FontWeight.BLACK, 24));
		lblMeal4.setStyle("-fx-text-fill: #5AB2FF; ");
		
		
		
		lblTotal = new Label("Subtotal Fee");
		lblTotal.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblTotal.setStyle("-fx-text-fill: Black; ");
		
		lblxxTotal = new Label("Rp.25000");
		lblxxTotal.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblxxTotal.setStyle("-fx-text-fill: Black; ");
		
		totalHBox = new HBox(200, lblTotal, lblxxTotal);
		totalHBox.setAlignment(Pos.CENTER);
//		totalHBox.setPadding(new Insets(10,10,10,10));
		
		lblDelfee = new Label("Delivery Fee");
		lblDelfee.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblDelfee.setStyle("-fx-text-fill: Black; ");
		
		lblxxDelfee = new Label("Rp.10000");
		lblxxDelfee.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblxxDelfee.setStyle("-fx-text-fill: Black; ");
		
		delfeeHBox = new HBox(200,lblDelfee, lblxxDelfee);
		delfeeHBox.setAlignment(Pos.CENTER);
		
		lblSerfee = new Label("Service  Fee");
		lblSerfee.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblSerfee.setStyle("-fx-text-fill: Black; ");
		
		lblxxSerfee = new Label("Rp.10000");
		lblxxSerfee.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblxxSerfee.setStyle("-fx-text-fill: Black; ");
		
		serfeeHBox = new HBox(200,lblSerfee, lblxxSerfee);
		serfeeHBox.setAlignment(Pos.CENTER);
		
		feeVBox = new VBox(totalHBox, delfeeHBox, serfeeHBox);
		feeVBox.setAlignment(Pos.CENTER);
		
		
//		homeLogo = new Image(getClass().getResourceAsStream("home.png"));
//		homeImgView = new ImageView(homeLogo);
//		homeImgView.setFitHeight(50);
//		homeImgView.setFitWidth(50);
		
		logoImg = new Image(getClass().getResourceAsStream("Logo2.png"));
		logoImgView = new ImageView(logoImg);
		logoImgView.setFitHeight(60);
		logoImgView.setFitWidth(60);
		
		appleImg = new Image(getClass().getResourceAsStream("Apple.png"));
		appleImgView = new ImageView(appleImg);
		appleImgView.setFitHeight(100);
		appleImgView.setFitWidth(100);
		
		lblApple = new Label("Apple 4-5pcs 1 - 1.1 kg/pack");
		lblApple.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		lblHargaApple = new Label("Rp.25.000");
		lblHargaApple.setPadding(new Insets(15,0,0,0));
		lblHargaApple.setFont(Font.font("Inter", FontWeight.NORMAL, 14));
		
		minus = new Button("-");
		minus.setPrefWidth(30);
		minus.setStyle("-fx-text-fill: #FFFFFF; -fx-background-color:#25995C; -fx-focus-color: transparent;");
		minus.setShape(new Rectangle(30,30));
		plus = new Button("+");
		plus.setPrefWidth(30);
		plus.setStyle("-fx-text-fill: #FFFFFF; -fx-background-color:#25995C; -fx-focus-color: transparent;");
		plus.setShape(new Rectangle(30,30));
		quantity = new TextField();
		quantity.setPromptText("1");
		quantity.setPrefWidth(30);
		quantity.setStyle("-fx-text-fill: #FFFFFF; -fx-background-color:#25995C;");
		quantity.setShape(new Rectangle(30,30));
		quantityBox = new HBox();
		quantityBox.getChildren().addAll(minus, quantity, plus);
		appleVB = new VBox();
		appleVB.setSpacing(10);
		appleVB.setPadding(new Insets(15,0,0,0));
		appleVB.getChildren().addAll(lblApple, quantityBox);
		
		lblTotal = new Label("Total Price : Rp.35000");
		lblTotal.setFont(Font.font("Inter", FontWeight.BOLD, 14));
		lblTotal.setStyle("-fx-text-fill: #FFFFFF;");
		payBtn = new Button("Pay");
		payBtn.setStyle("-fx-text-fill: #25995C; -fx-background-color:#EBFFF4;");
		payBox = new HBox();
		payBox.getChildren().addAll(lblTotal, payBtn);
		payBox.setAlignment(Pos.BOTTOM_CENTER);
		payBox.setPadding(new Insets(25,0,30,0));
		payBox.setSpacing(140);
		payBox.setStyle("-fx-background-color:#25995C;");
		
//		scheduleLogo = new Image(getClass().getResourceAsStream("schedule.png"));
//		scheduleImgView = new ImageView(scheduleLogo);
//		scheduleImgView.setFitHeight(50);
//		scheduleImgView.setFitWidth(50);
//		
//		healthLogo = new Image(getClass().getResourceAsStream("health.png"));
//		healthImgView = new ImageView(healthLogo);
//		healthImgView.setFitHeight(50);
//		healthImgView.setFitWidth(50);
//		
//		dogwalkerLogo = new Image(getClass().getResourceAsStream("dogwalker.png"));
//		dogWalkImgView = new ImageView(dogwalkerLogo);
//		dogWalkImgView.setFitHeight(50);
//		dogWalkImgView.setFitWidth(50);
//		
//		profileLogo = new Image(getClass().getResourceAsStream("dogprofile.png"));
//		profileImgView = new ImageView(profileLogo);
//		profileImgView.setFitHeight(50);
//		profileImgView.setFitWidth(50);
		
		homeBtn = new Button();
		homeBtn.setGraphic(homeImgView);
		homeBtn.setStyle("-fx-background-color: #5AB2FF; ");
		scheduleBtn = new Button();
		scheduleBtn.setGraphic(scheduleImgView);
		scheduleBtn.setStyle("-fx-background-color: #5AB2FF; ");
		healthBtn = new Button();
		healthBtn.setGraphic(healthImgView);
		healthBtn.setStyle("-fx-background-color: #5AB2FF; ");
		dogWalkBtn = new Button();
		dogWalkBtn.setGraphic(dogWalkImgView);
		dogWalkBtn.setStyle("-fx-background-color: #5AB2FF; ");
		dogProfileBtn = new Button();
		dogProfileBtn.setGraphic(profileImgView);
		dogProfileBtn.setStyle("-fx-background-color: #5AB2FF; ");
		
		
		rectang1 = new Rectangle(350, 60);
		rectang1.setStyle("-fx-fill: #25995C;");
		rectang1.setArcHeight(20);
		rectang1.setArcWidth(20);
		rectang2 = new Rectangle(350, 30);
		rectang2.setStyle("-fx-fill: #25995C;");
		rectang2.setArcHeight(20);
		rectang2.setArcWidth(20);
		rectang3 = new Rectangle(350, 30);
		rectang3.setStyle("-fx-fill: #25995C;");
		rectang3.setArcHeight(20);
		rectang3.setArcWidth(20);
		rectang4 = new Rectangle(350, 60);
		rectang4.setStyle("-fx-fill: #FFF9D0;");
		rectang4.setStroke(Color.BLACK);
		rectang5 = new Rectangle(350, 60);
		rectang5.setStyle("-fx-fill: #FFFFFF;");
		rectangNavbar = new Rectangle(400, 60);
		rectangNavbar.setStyle("-fx-fill: #25995C;");
		
		rectangtaskbar = new Rectangle(400, 65);
		rectangtaskbar.setStyle("-fx-fill: #5AB2FF;");
		
		spNavbar = new StackPane();
		spNavbar.getChildren().addAll(rectangNavbar, logoImgView);
		//spNavbar.setAlignment(Pos.TOP_CENTER);
		
		backBtn = new Button("<");
		
		backVb = new VBox(backBtn);
		backVb.setAlignment(Pos.CENTER_LEFT);
		backVb.setPadding(new Insets(0,80,0,0));
		
		titleVb = new VBox(lbltitle);
		titleVb.setPadding(new Insets(0,93,0,0));
		
		titleHb = new HBox(backVb, titleVb);
		titleHb.setAlignment(Pos.CENTER);
		
		sp1 = new StackPane();
		sp1.getChildren().addAll(rectang1, lblAddress);
		
		labelVb = new VBox(lblEatSchedule);
		labelVb.setPadding(new Insets(10,0,-20,25));
		
		hbox2 = new HBox(60, lblTime1, lblMeal1);
		hbox2.setPadding(new Insets(5,0,0,48));
		
		sp2 = new StackPane();
		sp2.getChildren().addAll(rectang2, hbox2);
		
		hbox3 = new HBox(48, lblTime2, lblMeal2);
		hbox3.setPadding(new Insets(5,0,0,48));
		
		sp3 = new StackPane();
		sp3.getChildren().addAll(rectang3, hbox3);
		
		hbox4 = new HBox(40, lblTime3, lblMeal3);
		hbox4.setPadding(new Insets(10,0,0,45));
		
		sp4 = new StackPane();
		sp4.getChildren().addAll(rectang4, hbox4);
		
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		hbox5 = new HBox(15, appleImgView, appleVB, lblHargaApple);
		hbox5.setPadding(new Insets(10,0,0,10));
		
		sp5 = new StackPane();
		sp5.getChildren().addAll(rectang5, hbox5);
		sp5.setPadding(new Insets(0,0,60,0));
		
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!		
		
		spTaskBar = new StackPane();
		spTaskBar.getChildren().addAll(payBox);
		
		mainVb = new VBox(20, spNavbar,titleHb, sp1, labelVb, sp2, sp3, sp5,feeVBox, spTaskBar);
		mainVb.setStyle("-fx-background-color: #FFFFFF;");
		
		 payBtn.setOnAction(e -> {
			    waiting waitingPage = new waiting();
			    try {
			        waitingPage.start(new Stage());
			        // Tutup jendela HomePage
			        ((Stage) payBtn.getScene().getWindow()).close();
			    } catch (Exception exception) {
			        exception.printStackTrace();
			    }
			});
		
		backBtn.setOnAction(e -> {
		    MenuBuah homePage = new MenuBuah();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) backBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
//		dogWalkBtn.setOnAction(e -> {
//		    dogWalker1 dogWalkerPage = new dogWalker1();
//		    try {
//		        dogWalkerPage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) dogWalkBtn.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
//		
//		healthBtn.setOnAction(e -> {
//		    health2 healthPage = new health2();
//		    try {
//		        healthPage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) healthBtn.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
//		
//		dogProfileBtn.setOnAction(e -> {
//		    ProfileDog2 dogProfilePage = new ProfileDog2();
//		    try {
//		        dogProfilePage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) dogProfileBtn.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
		
		
		scene = new Scene(mainVb, 400, 700);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		cart();
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}