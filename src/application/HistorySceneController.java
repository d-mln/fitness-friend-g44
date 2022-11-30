package application;

import java.io.FileInputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HistorySceneController {
	protected Stage historyStage;
    @FXML
    private Button historyReturnButton;
	

    @FXML
    void returnPressed(ActionEvent event) {
		Stage mainStage = new Stage();
    	try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/scenes/MainScene.fxml"));
			MainSceneController controller = (MainSceneController)loader.getController();
			controller.mainStage = mainStage;
			Scene scene = new Scene(root,600,180);
			
			mainStage.setTitle("Fitness Friend");
			mainStage.setResizable(false);
			mainStage.setScene(scene);
			mainStage.show();
			historyStage.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

}