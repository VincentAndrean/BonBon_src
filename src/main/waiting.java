package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import main.home;

public class waiting extends Application{
	Image resep1Img;
	ImageView resep1Imgview;
	HBox resep1HBox, backHb;
	Button back;
	StackPane spResep;
	Scene scene;
	
	public void resep() {
		resep1Img = new Image(getClass().getResourceAsStream("waiting1.png"));
        resep1Imgview = new ImageView(resep1Img);
        resep1Imgview.setFitWidth(400);
        resep1Imgview.setFitHeight(700);
        
        resep1HBox = new HBox(resep1Imgview);
        back = new Button("<");
        backHb = new HBox(back);
//        backHb.setAlignment(Pos.TOP_CENTER);
        backHb.setPadding(new Insets(30, 0, 0, 25));
        spResep = new StackPane(resep1HBox, backHb);
        
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
        
        
       
        
        scene = new Scene(spResep, 400, 700);
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
