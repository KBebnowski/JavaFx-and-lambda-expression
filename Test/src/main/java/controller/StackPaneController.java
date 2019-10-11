package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;

public class StackPaneController {

	@FXML
	private Button button;
	
	
	public StackPaneController(){
		System.out.println("Jestem kontrolerem");
	}
	
	@FXML
	void initialize() {
		button.setText("nowa nazwa");
		
		EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("zwykly handler");
			}
		};
		button.addEventHandler(ActionEvent.ACTION, handler);
		
		
		EventHandler<MouseEvent> mousHandlerLambda = e ->{
			System.out.println("to jest handler z lambda");
		};
		button.addEventHandler(MouseEvent.MOUSE_ENTERED, mousHandlerLambda);
		
		button.setOnAction(e ->{
			System.out.println("najszybszy handler");
		});
		
		button.setOnMouseEntered(e ->{
			System.out.println("najszybszy tez");
		});
	}
	
}
