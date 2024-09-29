package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
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
import main.profile;
import main.MenuBuah;
import main.MenuSayur;
import main.Keranjang;
import main.resep1;
import main.ProductBuah;

public class home extends Application{
	Label lbltitle, lblgreet, lblarticle, lblmoney, lblcoin, lbldel, lblFruits, lblVeget, lblresep;
	Image homeLogo, moneyLogo, promoLogo, categoryLogo, cartLogo, profileLogo, buahImg, logoImg, histImg, searchImg, 
			fruitsImg, vegImg, resepImg, resepImg2, resepImg3;
	ImageView homeImgView, moneyImgView, dogWalkImgView, healthImgView, scheduleImgView, 
				profileImgView, artichleImgView, logoImgView, histImgView, searchImgView, fruitsiImageView, vegImageView, resepImgView,resepImgView2, resepImgView3;
	Rectangle rectangnavBar, rectangGreet, rectangArticle, rectangtaskbar, rectangSaldo, rectangleSearch, rectangleFruits
			, rectangleVeget;
	TextField searchTf;
	Button topUpBtn, historyBtn, homeBtn, scheduleBtn, healthBtn, dogWalkBtn, dogProfileBtn, searchBtn;
	HBox navBar, taskbar, saldoHb, btnHb, searchHb, categoryHb, resepfullHBox;
	VBox saldoVb, greetVb, mainVb, articleVb, delBar, searchVb, comboVb, fruitsVb, vegVb, displayVb, resepVb, lblresepvb, 
			mainVb2, resepVb2, lblresepvb2, resepVb3, lblresepvb3, resepTitleVb;
	StackPane spNavbar, spSaldo, spGreet, spArticle, spTaskBar, spSearchBar, spFruits, spVegen;
	ScrollPane scroll, scroll2;
	Scene scene;
	
	public void homePage() {
		lbltitle = new Label("Deliver to:");
		lbltitle.setFont(Font.font("Inter", FontWeight.NORMAL, 21));
        lbltitle.setTextFill(Color.BLACK);
        lbldel = new Label("Your Address");
        lbldel.setFont(Font.font("Inter", FontWeight.BOLD, 16));
        lbldel.setTextFill(Color.BLACK);
        
        lblgreet = new Label("Welcome back, Bon");
        lblgreet.setFont(Font.font("Inter", FontWeight.BLACK, 24));
        lblgreet.setTextFill(Color.BLACK);
        
        lblmoney = new Label("Rp.989.000");
        lblmoney.setFont(Font.font("Inter", FontWeight.LIGHT, 16));
        lblmoney.setTextFill(Color.BLACK);
        
        lblcoin = new Label("19000 coin");
        lblcoin.setFont(Font.font("Inter", FontWeight.LIGHT, 15));
        lblcoin.setTextFill(Color.BLACK);
        
        lblarticle = new Label("Category");
        lblarticle.setFont(Font.font("Inter", FontWeight.BLACK, 17));
        lblarticle.setTextFill(Color.BLACK);
        
        lblresep = new Label("Recipe");
        lblresep.setFont(Font.font("Inter", FontWeight.BLACK, 17));
        lblresep.setTextFill(Color.BLACK);
        
        lblresepvb = new VBox(lblresep);
        lblresepvb.setAlignment(Pos.CENTER_LEFT);
        lblresepvb.setPadding(new Insets(0,0,0,20));
        
        resepImg = new Image(getClass().getResourceAsStream("resep2.png"));
        resepImgView = new ImageView(resepImg);
        resepImgView.setFitWidth(170);
        resepImgView.setFitHeight(100);
        
        resepVb = new VBox(10, resepImgView);
		resepVb.setAlignment(Pos.TOP_CENTER);
		resepVb.setPadding(new Insets(5,5,0,5));
		
		
        
//        lblresepvb2.setAlignment(Pos.CENTER_LEFT);
//        lblresepvb2.setPadding(new Insets(0,0,0,20));
        
        resepImg2 = new Image(getClass().getResourceAsStream("resep3.png"));
        resepImgView2 = new ImageView(resepImg2);
        resepImgView2.setFitWidth(170);
        resepImgView2.setFitHeight(100);
        
        resepVb2 = new VBox(10,resepImgView2);
		resepVb2.setAlignment(Pos.TOP_CENTER);
		resepVb2.setPadding(new Insets(5,5,0,5));
        
		
        
        lblresepvb3 = new VBox(lblresep);
        lblresepvb3.setAlignment(Pos.CENTER_LEFT);
        lblresepvb3.setPadding(new Insets(0,0,0,20));
        
        resepImg3 = new Image(getClass().getResourceAsStream("resep4.png"));
        resepImgView3 = new ImageView(resepImg);
        resepImgView3.setFitWidth(170);
        resepImgView3.setFitHeight(100);
        
        resepVb3 = new VBox(10, resepImgView3);
		resepVb3.setAlignment(Pos.TOP_CENTER);
		resepVb3.setPadding(new Insets(5,5,0,5));
       
		resepfullHBox = new HBox(10, resepVb, resepVb2, resepVb3);
		resepfullHBox.setPadding(new Insets(0,0,25,30));
				
		resepTitleVb = new VBox(lblresep);
		resepTitleVb.setPadding(new Insets(0,0,-10,30));
        
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
		
		histImg = new Image(getClass().getResourceAsStream("history.png"));
        histImgView = new ImageView(histImg);
        histImgView.setFitHeight(30);
		histImgView.setFitWidth(40);
		
		logoImg = new Image(getClass().getResourceAsStream("logo2.png"));
		logoImgView = new ImageView(logoImg);
		logoImgView.setFitHeight(80);
		logoImgView.setFitWidth(80);
		
		moneyLogo = new Image(getClass().getResourceAsStream("money.png"));
		moneyImgView = new ImageView(moneyLogo);
		moneyImgView.setFitHeight(30);
		moneyImgView.setFitWidth(40);
		
		buahImg = new Image(getClass().getResourceAsStream("buah.png"));
		artichleImgView = new ImageView(buahImg);
		artichleImgView.setFitHeight(220);
		artichleImgView.setFitWidth(340);
		
		topUpBtn = new Button();
        topUpBtn.setPrefSize(60, 30);
        topUpBtn.setGraphic(moneyImgView);
        topUpBtn.setStyle("-fx-background-color: #7CBD1E; ");
        historyBtn = new Button();
        historyBtn.setGraphic(histImgView);
        historyBtn.setStyle("-fx-background-color: #7CBD1E; ");
//        historyBtn.setPrefSize(60, 30);
        
        homeBtn = new Button();
        homeBtn.setGraphic(homeImgView);
        homeBtn.setStyle("-fx-background-color: #7CBD1E; ");
        scheduleBtn = new Button();
        scheduleBtn.setGraphic(scheduleImgView);
        scheduleBtn.setStyle("-fx-background-color: #7CBD1E; ");
        healthBtn = new Button();
        healthBtn.setGraphic(healthImgView);
        healthBtn.setStyle("-fx-background-color: #7CBD1E; ");
       
        dogProfileBtn = new Button();
        dogProfileBtn.setGraphic(profileImgView);
        dogProfileBtn.setStyle("-fx-background-color: #7CBD1E; ");
		
		rectangnavBar = new Rectangle(400, 130);
		rectangnavBar.setStyle("-fx-fill: #25995C;");
		rectangGreet = new Rectangle(370, 150);
		rectangGreet.setStyle("-fx-fill: #25995C;");
		rectangGreet.setArcHeight(20);
        rectangGreet.setArcWidth(20);
		rectangArticle = new Rectangle(370, 250, Color.BEIGE);
		rectangArticle.setArcHeight(20);
        rectangArticle.setArcWidth(20);
		rectangtaskbar = new Rectangle(400, 65);
		rectangtaskbar.setStyle("-fx-fill: #7CBD1E;");
		rectangSaldo = new Rectangle(345, 80);
		rectangSaldo.setArcHeight(20);
        rectangSaldo.setArcWidth(20);
        rectangSaldo.setStyle("-fx-fill: #FFF9D0;");
        
        delBar = new VBox(1,lbltitle, lbldel);
		
		navBar = new HBox(170, delBar, logoImgView);
		navBar.setAlignment(Pos.TOP_CENTER);
		navBar.setPadding(new Insets(30,5,0,5));
		
		saldoVb = new VBox(lblmoney, lblcoin);
//		saldoVb.setPadding(new Insets(25,25,25,25));
		
		btnHb = new HBox(10, topUpBtn, historyBtn);
		saldoHb = new HBox(80, saldoVb, btnHb);
		saldoHb.setPadding(new Insets(25,25,25,20));
		
		spSaldo = new StackPane();
		spSaldo.getChildren().addAll(rectangSaldo, saldoHb);
//		spSaldo.setPadding(new Insets(25,25,25,25));
		
		// Search Bar
		searchImg = new Image(getClass().getResourceAsStream("searchLogo.png"));
		searchImgView = new ImageView(searchImg);
		searchImgView.setFitWidth(20);
		searchImgView.setFitHeight(20);
		searchTf = new TextField();
		searchTf.setPrefWidth(270);
		searchTf.setPromptText("Search");
		searchTf.setStyle("-fx-background-color: #D3D3D3;");
		searchBtn = new Button();
		searchBtn.setPrefWidth(30);
		searchBtn.setGraphic(searchImgView);
		searchBtn.setStyle("-fx-background-color: #D3D3D3;");
		rectangleSearch = new Rectangle(320, 40);
		rectangleSearch.setArcHeight(20);
		rectangleSearch.setArcWidth(20);
		rectangleSearch.setStyle("-fx-fill: #D3D3D3;");
		searchHb = new HBox(5, searchTf, searchBtn);
		searchHb.setAlignment(Pos.CENTER);
		spSearchBar = new StackPane(rectangleSearch, searchHb);
		spSearchBar.setAlignment(Pos.CENTER);
//		searchVb = new VBox(spSearchBar);
//		searchVb.setAlignment(Pos.CENTER);
//		searchVb.setPadding(new Insets(0,0,0,0));
		
		// category
		fruitsImg = new Image(getClass().getResourceAsStream("fruits.png"));
		fruitsiImageView = new ImageView(fruitsImg);
		fruitsiImageView.setFitHeight(120);
		fruitsiImageView.setFitWidth(120);
		vegImg = new Image(getClass().getResourceAsStream("vegetables.png"));
		vegImageView = new ImageView(vegImg);
		vegImageView.setFitHeight(120);
		vegImageView.setFitWidth(120);
		rectangleFruits = new Rectangle(120, 120);
		rectangleFruits.setStyle("-fx-fill: #d3d3d3;");
		rectangleVeget = new Rectangle(120,120);
		rectangleVeget.setStyle("-fx-fill: #d3d3d3;");
		
		lblFruits = new Label("Fruits");
		lblVeget = new Label("Vegetables");
		spFruits = new StackPane(rectangleFruits, fruitsiImageView);
		spVegen = new StackPane(rectangleVeget, vegImageView);
		fruitsVb = new VBox(5, spFruits, lblFruits);
		fruitsVb.setAlignment(Pos.CENTER);
		vegVb = new VBox(5, spVegen, lblVeget);
		vegVb.setAlignment(Pos.CENTER);
		
		categoryHb = new HBox(40, fruitsVb, vegVb);
		categoryHb.setAlignment(Pos.CENTER);
		
		greetVb = new VBox(0, lblgreet, spSaldo);
		greetVb.setPadding(new Insets(25,25,25,25));
		
		spArticle = new StackPane();
		spArticle.getChildren().addAll(rectangArticle, artichleImgView);
		spArticle.setPadding(new Insets(-20,0,82,0));
		
		articleVb = new VBox(lblarticle);
		articleVb.setPadding(new Insets(-25,25,-50,25));
		
		spGreet = new StackPane();
		spGreet.getChildren().addAll(rectangGreet, greetVb);
		spGreet.setPadding(new Insets(-25,0,10,0));
		
		comboVb = new VBox(5, navBar, spSearchBar);
		
		
		spNavbar = new StackPane();
		spNavbar.getChildren().addAll(rectangnavBar, comboVb);
		spNavbar.setAlignment(Pos.TOP_CENTER);
//		spNavbar.setPadding(new Insets(25,25,25,25));
		
		taskbar = new HBox(10, homeBtn, scheduleBtn, healthBtn, dogProfileBtn);
		taskbar.setAlignment(Pos.BOTTOM_CENTER);
		taskbar.setPadding(new Insets(0, 0, 5, 0));
		
		spTaskBar = new StackPane();
		spTaskBar.getChildren().addAll(rectangtaskbar, taskbar);
		
		
		mainVb2 = new VBox(resepfullHBox);
		mainVb2.setStyle("-fx-background-color: #FFFFFF; ");
		
		scroll2 = new ScrollPane();
		scroll2.setContent(mainVb2);
		scroll2.setFitToHeight(true);
		
		mainVb = new VBox(20, spNavbar, spGreet, articleVb, categoryHb, resepTitleVb, scroll2);
		mainVb.setStyle("-fx-background-color: #FFFFFF; ");
		
		scroll = new ScrollPane();
		scroll.setContent(mainVb);
		scroll.setFitToWidth(true);
		
		
		scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);  // Menghilangkan scrollbar horizontal
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);	 // Menghilangkan scrollbar vertical
        
        scroll2.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);  // Menghilangkan scrollbar horizontal
        scroll2.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);	 // Menghilangkan scrollbar vertical
		
		displayVb = new VBox(scroll, spTaskBar);
		displayVb.setStyle("-fx-background-color: #FFFFFF; ");
		// Di kelas HomePage

		resepVb.setOnMouseClicked(e -> {
		    resep1 dogWalkerPage = new resep1();
		    try {
		        dogWalkerPage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) resepVb.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
//		
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
//		
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
		
		spFruits.setOnMouseClicked(e -> {
		    MenuBuah schedule2Page = new MenuBuah();
		    try {
		        schedule2Page.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) spFruits.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		spVegen.setOnMouseClicked(e -> {
		    MenuSayur schedule2Page = new MenuSayur();
		    try {
		        schedule2Page.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) spVegen.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
//		
		searchBtn.setOnAction(e -> {
		    ProductBuah dogProfilePage = new ProductBuah();
		    try {
		        dogProfilePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) searchBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
		dogProfileBtn.setOnAction(e -> {
		    profile dogProfilePage = new profile();
		    try {
		        dogProfilePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) dogProfileBtn.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
//		
//		dogImgView.setOnMouseClicked(e -> {
//		    ProfileDog2 dogProfilePage = new ProfileDog2();
//		    try {
//		        dogProfilePage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) dogImgView.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});

		scene = new Scene(displayVb, 400, 700);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		homePage();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
