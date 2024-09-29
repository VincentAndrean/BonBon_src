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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import main.MenuBuah;
import main.Keranjang;

public class ProductBuah extends Application{
	Rectangle rectangNavbar;
	Image logoImg;
	ImageView logoImgView;
	StackPane spNavbar;
	
	Button back, view, add;
	HBox boxBtn;
	VBox mainVb;
	
	TextField search;
	HBox imageBox;
	
	
	Label Nama, Harga, BB, Estimasi, Description, Other;
	HBox ButtonProduct;
	HBox Kanan;
	VBox NameBox;
	
	Image AppleProduct;
	ImageView ProductView;
	
	Image satu, dua, tiga;
	ImageView view1, view2, view3;
	HBox OtherBox;
	ScrollPane scroll;
	
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
		
//		Product Image
		
		AppleProduct = new Image(getClass().getResourceAsStream("Appleproduct.png"));
		ProductView = new ImageView(AppleProduct);
		
		imageBox = new HBox();
		imageBox.getChildren().add(ProductView);
		imageBox.setAlignment(Pos.CENTER);
		
		
//		Detail
		
		Nama = new Label("Apple 4-5pcs 1 - 1.1 kg/pack");
		Nama.setFont(Font.font("Inter", FontWeight.BLACK, 18));
		

		Harga = new Label("Rp.xxxxxx");
		Harga.setFont(Font.font("Inter", FontWeight.BLACK, 18));
		
		BB = new Label("Best Before 1 June 2024");
		BB.setFont(Font.font(15));
		
		Estimasi = new Label("Estimated delivery time(10 - 20 Minutes)");
		Estimasi.setFont(Font.font(15));
		
		Description = new Label("Description");
		Description.setFont(Font.font("Inter", FontWeight.BLACK, 18));
		
		Other = new Label("Other Products");
		Other.setFont(Font.font("Inter", FontWeight.BLACK, 18));
		
		view = new Button("View in 3D");
		add = new Button("+");
		
		Kanan = new HBox();
		Kanan = new HBox(view, add);
		Kanan.setAlignment(Pos.CENTER);
		Kanan.setSpacing(8);
		Kanan.setPadding(new Insets(0, 10, 30, 0));
		
		
		ButtonProduct = new HBox();
		ButtonProduct = new HBox(Nama, Kanan);
		ButtonProduct.setAlignment(Pos.BASELINE_LEFT);
		ButtonProduct.setSpacing(20);
		ButtonProduct.setPadding(new Insets(0, 0, 0, 10));
		NameBox = new VBox();
		NameBox = new VBox(Harga, BB, Estimasi, Description, Other);
		NameBox.setSpacing(10);
		NameBox.setPadding(new Insets(0, 0, 0, 10));

		
//		Other
		satu = new Image(getClass().getResourceAsStream("1.png"));
		view1 = new ImageView(satu);
		view1.setFitWidth(110);
		view1.setFitHeight(150);
		
		
		dua = new Image(getClass().getResourceAsStream("2.png"));
		view2 = new ImageView(dua);
		view2.setFitWidth(110);
		view2.setFitHeight(150);
		
		tiga = new Image(getClass().getResourceAsStream("3.png"));
		view3 = new ImageView(tiga);
		view3.setFitWidth(110);
		view3.setFitHeight(150);
		
		
		
		OtherBox = new HBox();
		OtherBox.getChildren().addAll(view1, view2, view3);
		OtherBox.setAlignment(Pos.CENTER);
		OtherBox.setSpacing(10);
		OtherBox.setPadding(new Insets(0,0,25,0));
		
		
		mainVb.getChildren().addAll(spNavbar, boxBtn, imageBox,Kanan, ButtonProduct, NameBox, OtherBox);
		mainVb.setStyle("-fx-background-color:white;");
		scroll = new ScrollPane(mainVb);
		
		scroll.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);  // Menghilangkan scrollbar horizontal
        scroll.setVbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);	 // Menghilangkan scrollbar vertical
        
        back.setOnAction(e -> {
		    MenuBuah homePage = new MenuBuah();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) back.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
        
        add.setOnAction(e -> {
		    Keranjang homePage = new Keranjang();
		    try {
		        homePage.start(new Stage());
		        // Tutup jendela HomePage
		        ((Stage) add.getScene().getWindow()).close();
		    } catch (Exception exception) {
		        exception.printStackTrace();
		    }
		});
		
        scene = new Scene(scroll, 400, 700);
        
        
        
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
