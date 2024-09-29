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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.home;

public class history extends Application{
	Label historylbl;
	Image resep1Img, logoImg;
	ImageView resep1Imgview, logoImgView;
	HBox resep1HBox, backHb, historyHB, atasHB, logohb;
	Button back;
	StackPane spResep;
	VBox duavb;
	Scene scene;
	Rectangle rectang1;
	
	public void resep() {
		logoImg = new Image(getClass().getResourceAsStream("Logo2.png"));
		logoImgView = new ImageView(logoImg);
		logoImgView.setFitHeight(50);
		logoImgView.setFitWidth(50);
		
		
		
		historylbl = new Label("History");
		historylbl.setFont(Font.font("Inter", FontWeight.BOLD, 25));
		historylbl.setTextFill(Color.BLACK);

		resep1Img = new Image(getClass().getResourceAsStream("transaksi.png"));
        resep1Imgview = new ImageView(resep1Img);
        resep1Imgview.setFitWidth(300);
        resep1Imgview.setFitHeight(100);
        
        historyHB = new HBox(historylbl);
        historyHB.setAlignment(Pos.CENTER);
        historyHB.setPadding(new Insets(75,0,0,0));
        
        
        resep1HBox = new HBox(resep1Imgview);
        resep1HBox.setAlignment(Pos.CENTER);
        resep1HBox.setPadding(new Insets(20,0,0,0));
        
        rectang1 = new Rectangle(400, 60);
		rectang1.setStyle("-fx-fill: #25995C;");
//		rectang1.setArcHeight(20);
//		rectang1.setArcWidth(20);
		
		atasHB = new HBox(logoImgView);
//		atasHB.setAlignment(Pos.CENTER);
		atasHB.setPadding(new Insets(-20,105,0,0));
        
        
        back = new Button("<");
        backHb = new HBox(80, back, atasHB);
        backHb.setAlignment(Pos.TOP_CENTER);
        backHb.setPadding(new Insets(30, 0, 0, 25));
        spResep = new StackPane(rectang1, backHb);
        
        duavb = new VBox(spResep, historyHB, resep1HBox);
        
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
        
        
       
        
        scene = new Scene(duavb, 400, 700);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		resep();
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}