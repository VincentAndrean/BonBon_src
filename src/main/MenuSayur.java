package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import main.home;

public class MenuSayur extends Application{
	Rectangle rectangNavbar;
	Image logoImg;
	ImageView logoImgView;
	StackPane spNavbar;
	
	Button back;
	HBox boxBtn;
	VBox mainVb;
	
	TextField search;
	HBox searchBox;
	
	Image Cabbage, Corn, Tomato, Spinach, Brocolli, Carrot, Potato, Celery, Cucumber;
	ImageView CabbageView, CornView, TomatoView, SpinachView, BrocolliView, CarrotView, PotatoView, CeleryView, CucumberView;
	FlowPane fp;
	
	Scene scene;
	
	public void menu() {
//		TOP
		logoImg = new Image(getClass().getResourceAsStream("Logo2.png"));
		logoImgView = new ImageView(logoImg);
		logoImgView.setFitHeight(60);
		logoImgView.setFitWidth(60);
		
		rectangNavbar = new Rectangle(400, 60);
		rectangNavbar.setStyle("-fx-fill: #25995C;");
		
		mainVb = new VBox();
		spNavbar = new StackPane();
		spNavbar.getChildren().addAll(rectangNavbar, logoImgView);
		
//		Back Button
		back = new Button("<");
		boxBtn = new HBox();
		boxBtn.getChildren().addAll(back);
		boxBtn.setPadding(new Insets(10,0,0,10));
		
//		Search Bar
		search = new TextField();
		search.setPromptText("Search");
		search.setMinHeight(40);
		search.setMinWidth(380);
		searchBox = new HBox();
		searchBox.getChildren().add(search);
		searchBox.setAlignment(Pos.CENTER);
		searchBox.setPadding(new Insets(10,0,0,0));
		
//		List
		Cabbage = new Image(getClass().getResourceAsStream("Cabbage.png"));
		CabbageView = new ImageView(Cabbage);
		CabbageView.setFitWidth(110);
		CabbageView.setFitHeight(150);
		
		Corn = new Image(getClass().getResourceAsStream("Corn.png"));
		CornView = new ImageView(Corn);
		CornView.setFitWidth(110);
		CornView.setFitHeight(150);
		
		Tomato = new Image(getClass().getResourceAsStream("Tomato.png"));
		TomatoView = new ImageView(Tomato);
		TomatoView.setFitWidth(110);
		TomatoView.setFitHeight(150);
		
		Spinach = new Image(getClass().getResourceAsStream("Spinach.png"));
		SpinachView = new ImageView(Spinach);
		SpinachView.setFitWidth(110);
		SpinachView.setFitHeight(150);
		
		Brocolli = new Image(getClass().getResourceAsStream("Brocoli.png"));
		BrocolliView = new ImageView(Brocolli);
		BrocolliView.setFitWidth(110);
		BrocolliView.setFitHeight(150);
		
		Carrot = new Image(getClass().getResourceAsStream("Carrot.png"));
		CarrotView = new ImageView(Carrot);
		CarrotView.setFitWidth(110);
		CarrotView.setFitHeight(150);
		
		Potato = new Image(getClass().getResourceAsStream("Potato.png"));
		PotatoView = new ImageView(Potato);
		PotatoView.setFitWidth(110);
		PotatoView.setFitHeight(150);
		
		Celery = new Image(getClass().getResourceAsStream("Celery.png"));
		CeleryView = new ImageView(Celery);
		CeleryView.setFitWidth(110);
		CeleryView.setFitHeight(150);
		
		Cucumber = new Image(getClass().getResourceAsStream("Cumcumber.png"));
		CucumberView = new ImageView(Cucumber);
		CucumberView.setFitWidth(110);
		CucumberView.setFitHeight(150);
		
		fp = new FlowPane(5,5);
		fp.setAlignment(Pos.CENTER);
		fp.setPadding(new Insets(10,0,0,0));
		fp.getChildren().addAll(CabbageView, CornView, TomatoView, SpinachView, BrocolliView, CarrotView, PotatoView, CeleryView, CucumberView);
		
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		KALAU MAU TAMBAHIN NAVBAR BAWAH MASUKIN MAINVB BAWAH INI KNTL !!!!!
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		mainVb.getChildren().addAll(spNavbar, boxBtn, searchBox, fp);
		mainVb.setStyle("-fx-background-color:white;");
		
		back.setOnAction(e -> {
		    home homePage = new home();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) back.getScene().getWindow()).close();
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
		menu();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
