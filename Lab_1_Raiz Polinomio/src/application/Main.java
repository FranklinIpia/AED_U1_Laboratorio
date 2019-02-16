package application;
	
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;
import modelo.Polinomio;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("VistaP.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
	//	launch(args);
		 double[] c=new double[10]; 
		//  x^4 + 5x^3 + 5x^2 - 5x - 6:   polinomio raiz -2, 2, -1, 1
		 
		//  x^3+10x^2+169x
		 
	//		4x^5 - 5X^3 +1
	//	  
		//{4,0,-5,0,1}
		 
		 c[0]=4;		
		 c[1]=0;		
		 c[2]=-5;		
		 c[3]=0;		
		 c[4]=1;		
		 
		 c[5]=4;		
		 c[6]=0;		
		 c[7]=-5;		
		 c[8]=0;		
		 c[9]=1;	
		 
//		 c[0]=-8;		
//		 c[1]=-2;		
//		 c[2]=1;		
		 	
//		 
//		 c[5]=-1;		
//		 c[6]=1;		
//		 c[7]=-3;		
//		 c[8]=2;		
//		 c[9]=1;		 


		Polinomio p= new Polinomio(c);
		p.Bairstow();
		
	}
	
	
	
	
}
