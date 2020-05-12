package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainViewController implements Initializable {
	private Stage stage;
	
	public void startButtonPressed() {
		showLoginWindow();
	}
	
	public boolean showLoginWindow() {
		FXMLLoader loader = new FXMLLoader(
				getClass().getResource("LoginView.fxml"));
		try {
			Scene scene = loader.load();
			Stage loginStage = new Stage();
			LoginViewController loginController = loader.load();
			loginController.setOwnStage(loginStage);
			loginStage.initOwner(stage);			
			loginStage.initModality(Modality.WINDOW_MODAL);
			loginStage.setScene(scene);
			loginStage.showAndWait();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
