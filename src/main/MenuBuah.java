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
import main.ProductBuah;

public class MenuBuah extends Application{
	Rectangle rectangNavbar;
	Image logoImg;
	ImageView logoImgView;
	StackPane spNavbar;
	
	Button back;
	HBox boxBtn;
	VBox mainVb;
	
	TextField search;
	HBox searchBox;
	
	Image Apple, Pear, Banana, Pine, Mango, Orange, Dragon, Water, Grapes;
	ImageView AppleView, PearView, BananaView, PineView, MangoView, OrangeView, DragonView, WaterView, GrapesView;
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
		Apple = new Image(getClass().getResourceAsStream("Apple.png"));
		AppleView = new ImageView(Apple);
		AppleView.setFitWidth(110);
		AppleView.setFitHeight(150);
		
		Pear = new Image(getClass().getResourceAsStream("Pear.png"));
		PearView = new ImageView(Pear);
		PearView.setFitWidth(110);
		PearView.setFitHeight(150);
		
		Banana = new Image(getClass().getResourceAsStream("Banana.png"));
		BananaView = new ImageView(Banana);
		BananaView.setFitWidth(110);
		BananaView.setFitHeight(150);
		
		Pine = new Image(getClass().getResourceAsStream("Pineapple.png"));
		PineView = new ImageView(Pine);
		PineView.setFitWidth(110);
		PineView.setFitHeight(150);
		
		Mango = new Image(getClass().getResourceAsStream("Mango.png"));
		MangoView = new ImageView(Mango);
		MangoView.setFitWidth(110);
		MangoView.setFitHeight(150);
		
		Orange = new Image(getClass().getResourceAsStream("Orange.png"));
		OrangeView = new ImageView(Orange);
		OrangeView.setFitWidth(110);
		OrangeView.setFitHeight(150);
		
		Dragon = new Image(getClass().getResourceAsStream("Dragon.png"));
		DragonView = new ImageView(Dragon);
		DragonView.setFitWidth(110);
		DragonView.setFitHeight(150);
		
		Water = new Image(getClass().getResourceAsStream("Watermelon.png"));
		WaterView = new ImageView(Water);
		WaterView.setFitWidth(110);
		WaterView.setFitHeight(150);
		
		Grapes = new Image(getClass().getResourceAsStream("Grapes.png"));
		GrapesView = new ImageView(Grapes);
		GrapesView.setFitWidth(110);
		GrapesView.setFitHeight(150);
		
		fp = new FlowPane(5,5);
		fp.setAlignment(Pos.CENTER);
		fp.setPadding(new Insets(10,0,0,0));
		fp.getChildren().addAll(AppleView, PearView, BananaView, PineView, MangoView, OrangeView, DragonView, WaterView, GrapesView);
		
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
		
		AppleView.setOnMouseClicked(e -> {
		    ProductBuah homePage = new ProductBuah();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) AppleView.getScene().getWindow()).close();
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
