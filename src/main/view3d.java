package main;


import java.io.File;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class view3d extends Application {
	Stage stage;
	Scene sc;
	GridPane gp;
	BorderPane bp;
	VBox layout;
	Label welcome;
	Button button;
	File file1;
	Media media1;
	MediaView mv;
	MediaPlayer mp1;
	
	public void init() {
		
//		File file = new File("video.mp4");
//		Media media = new Media(file.toURI().toString());
//		MediaPlayer mediaplayer = new MediaPlayer(media);
//		MediaView mediaview = new MediaView(mediaplayer);
//		mediaplayer.setAutoPlay(true);
		
		File file = new File("applevideo.mp4");
		Media media = new Media(file.toURI().toString());
		MediaPlayer mp = new MediaPlayer(media);
		MediaView mv = new MediaView(mp);
		mv.setFitWidth(270);
		mv.getMediaPlayer().play();
		
		bp = new BorderPane();
		welcome = new Label("Fresh Apple");
		welcome.setStyle("-fx-font: 24 arial;");
		button = new Button("Continue");
		button.setMinWidth(200);
		button.setMinHeight(30);
		button.setStyle("-fx-background-color: #7CBD1E; -fx-text-fill: #ffffff;"); 
		
		welcome.setPadding(new Insets(60,0,0,0));
		bp.setTop(welcome);
		bp.setCenter(mv);
		bp.setAlignment(welcome, Pos.CENTER);
		bp.setBottom(button);
		bp.setAlignment(button, Pos.CENTER);
		bp.setPadding(new Insets(0,0,120,0));
		sc = new Scene(bp, 400,700);
		
//		button.setOnMouseClicked(e->{
//			mv.getMediaPlayer().stop();
//			new cart(stage);
//		});
//	}
//		button.setOnAction(e -> {
//		    ProductBuah pbpage = new ProductBuah();
//		    try {
//		        pbpage.start(new Stage());
//		        // Tutup jendela HomePage
//		        ((Stage) button.getScene().getWindow()).close();
//		    } catch (Exception exception) {
//		        exception.printStackTrace();
//		    }
//		});
	}
	public view3d(Stage stage) {
		init();
		this.stage = stage;
		
		stage.setScene(sc);
		stage.show();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
