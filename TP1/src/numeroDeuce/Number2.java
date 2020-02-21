package numeroDeuce;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Number2 extends Application {

	@Override
	public void start(Stage stage) {
		BorderPane bp = new BorderPane();
		bp.setCenter(center());
		bp.setTop(top());
		bp.setLeft(left());
		stage.setTitle("Suivi des travaux");
		Scene scene = new Scene(bp,1000,550);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/numba2.css").toString());
		stage.setScene(scene);
		stage.show();
		

	}

	private VBox center() {

		VBox v = new VBox();
		VBox vb = new VBox();
		HBox h = new HBox();
		SplitPane s = new SplitPane();
		s.setOrientation(Orientation.VERTICAL);
		TextField desc = new TextField();
		TextField name = new TextField();

		desc.setPrefHeight(200);

		TableView tab = new TableView();

		v.setSpacing(20);

		TableColumn<String, Valeur> nom = new TableColumn<>("nom");
		nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
		TableColumn<String, Valeur> res = new TableColumn<>("responsable");
		res.setCellValueFactory(new PropertyValueFactory<>("responsable"));
		TableColumn<String, Valeur> tache = new TableColumn<>("tache");
		tache.setCellValueFactory(new PropertyValueFactory<>("tache"));

		tab.getColumns().addAll(nom, res, tache);

		tab.getItems().add(new Valeur("TT-1", "Julie", "Conception de l'interface"));
		tab.getItems().add(new Valeur("TT-2", "Alexandre", "Programmation de l'interface"));
		tab.getItems().add(new Valeur("TT-3", "Julie", "Programmation des évênements"));

		h.setPrefHeight(100);
		name.setText("TT-1");
		name.getStyleClass().add("valeur");
		h.getChildren().addAll(new Label("nom :"), name);
		desc.setText("Conception de l'interface");
		desc.getStyleClass().add("description");
		v.getChildren().addAll(h, new Label("nom: "), desc);

		v.setPrefHeight(0);

		s.getItems().addAll(tab, v);

		vb.getChildren().add(s);
		return vb;

	}

	private AnchorPane top() {
		AnchorPane ap = new AnchorPane();
		ap.setPrefHeight(75);
		Image img = new Image("/css/SuiviTp.png");
		ImageView Vimg = new ImageView(img);

		Button b1 = new Button("Nouveau");
		Button b2 = new Button("Enregistrer");
		Button b3 = new Button("Effacer");

		ap.getChildren().addAll(Vimg, b1, b2, b3);

		AnchorPane.setRightAnchor(b3, 20.0);
		AnchorPane.setRightAnchor(b2, 90.0);
		AnchorPane.setRightAnchor(b1, 180.0);
		AnchorPane.setTopAnchor(b3, 30.0);
		AnchorPane.setTopAnchor(b2, 30.0);
		AnchorPane.setTopAnchor(b1, 30.0);
		AnchorPane.setTopAnchor(Vimg, 30.0);

		return ap;

	}

	private VBox left() {
		VBox v = new VBox();
		v.setPrefWidth(200);
		v.setPrefHeight(2000);
		v.setSpacing(20);

		ObservableList<String> ol = FXCollections.observableArrayList("Tp1", "Tp2", "Tp3", "Tp4");
		ListView<String> lv = new ListView<String>(ol);
		lv.setMinHeight(1000);
		v.getChildren().add(lv);
		v.getStyleClass().add("p");
		return v;

	}

	public static void main(String[] args) {
	
		Application.launch(args);

	}

}
