package edit_product;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class EditProductScreen {
	public static void showeditproductscreen() throws Exception{
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C:\\\\Users\\\\hemag\\\\eclipse-workspace\\\\ShopManagementJavaFxDB\\\\src\\\\edit_product\\\\EditProductScreen.fxml"));
			StageFactory.stage.setTitle("Edit Screen");
			Scene scene = new Scene(actorGroup,400,200);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}


