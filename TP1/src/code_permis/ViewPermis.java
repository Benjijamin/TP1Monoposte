package code_permis;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;

public class ViewPermis
{
	private Scene scene;
	public ViewPermis() {
		construireInterface();
	}
	
	private void construireInterface(){
		BorderPane bp = new BorderPane();
		
		bp.setTop(top());
		bp.setLeft(left());
		bp.setCenter(center());
		
		scene = new Scene(bp);
		scene.getStylesheets().setAll(this.getClass().getResource("/css/no3.css").toString());
	}
	
	public Scene getScene() {
		return scene;
	}
	
	private AnchorPane top() {
		AnchorPane top = new AnchorPane();
		top.setMinHeight(55);
		top.setId("top");
		
		Label labApp = new Label("Permis D'animaux");
		labApp.setId("titre");
		
		Button nouveau = new Button("Nouveau");
		Button enregistrer = new Button("Enregistrer");
		Button quitter = new Button("Quitter");

		AnchorPane.setLeftAnchor(labApp, 15d);
		AnchorPane.setTopAnchor(labApp, 10d);
		
		AnchorPane.setRightAnchor(nouveau, 175d);
		AnchorPane.setTopAnchor(nouveau, 15d);
		AnchorPane.setRightAnchor(enregistrer, 85d);
		AnchorPane.setTopAnchor(enregistrer, 15d);
		AnchorPane.setRightAnchor(quitter, 15d);
		AnchorPane.setTopAnchor(quitter,15d);
		
		
		
		top.getChildren().addAll(labApp,nouveau,enregistrer,quitter);
		
		return top;
	}
	
	private VBox left() {
		VBox left = new VBox();
		left.setId("left");
		Label labPermis = new Label("Liste des permis");
		
		ObservableList<String> olPermis = FXCollections.observableArrayList("Permis 1","Permis 2","Permis 3","Permis 4");
		ListView<String> lvPermis = new ListView<String>(olPermis);
		lvPermis.setPrefWidth(150);
		lvPermis.setMinWidth(150);
		lvPermis.prefHeightProperty().bind(left.heightProperty());
		
		left.getChildren().addAll(labPermis,lvPermis);
		
		return left;
	}
	
	private SplitPane center() {
		SplitPane center = new SplitPane();
		center.setId("center");
		center.setOrientation(Orientation.VERTICAL);
		
		
		//TableView
		
		TableView<Permis> tvPermis = new TableView<Permis>();

		TableColumn<Permis,String> col1 = new TableColumn<Permis,String>("noPermis");
		col1.setCellValueFactory(new PropertyValueFactory<Permis, String>("noPermis"));

		TableColumn<Permis,String> col2 = new TableColumn<Permis,String>("dateDebutPermis");
		col2.setCellValueFactory(new PropertyValueFactory<Permis, String>("dateDebutPermis"));

		TableColumn<Permis,String> col3 = new TableColumn<Permis,String>("dateFinPermis");
		col3.setCellValueFactory(new PropertyValueFactory<Permis, String>("dateFinPermis"));

		TableColumn<Permis,String> col4 = new TableColumn<Permis,String>("typePermis");
		col4.setCellValueFactory(new PropertyValueFactory<Permis, String>("typePermis"));

		TableColumn<Permis,String> col5 = new TableColumn<Permis,String>("nom");
		col5.setCellValueFactory(new PropertyValueFactory<Permis, String>("nom"));

		TableColumn<Permis,String> col6 = new TableColumn<Permis,String>("sexe");
		col6.setCellValueFactory(new PropertyValueFactory<Permis, String>("sexe"));

		TableColumn<Permis,String> col7 = new TableColumn<Permis,String>("couleur");
		col7.setCellValueFactory(new PropertyValueFactory<Permis, String>("couleur"));

		TableColumn<Permis,String> col8 = new TableColumn<Permis,String>("dateNaissance");
		col8.setCellValueFactory(new PropertyValueFactory<Permis, String>("dateNaissance"));

		TableColumn<Permis,String> col9 = new TableColumn<Permis,String>("vaccination");
		col9.setCellValueFactory(new PropertyValueFactory<Permis, String>("vaccination"));

		TableColumn<Permis,String> col10 = new TableColumn<Permis,String>("sterelisation");
		col10.setCellValueFactory(new PropertyValueFactory<Permis, String>("sterelisation"));

		TableColumn<Permis,String> col11 = new TableColumn<Permis,String>("poids");
		col11.setCellValueFactory(new PropertyValueFactory<Permis, String>("poids"));

		TableColumn<Permis,String> col12 = new TableColumn<Permis,String>("micropuce");
		col12.setCellValueFactory(new PropertyValueFactory<Permis, String>("micropuce"));

		TableColumn<Permis,String> col13 = new TableColumn<Permis,String>("dangereux");
		col13.setCellValueFactory(new PropertyValueFactory<Permis, String>("dangereux"));
		
		tvPermis.getColumns().setAll(col1,col2,col3,col4,col5,col6,col7,col8,col9,col10,col11,col12,col13);
		
		tvPermis.setMinHeight(100);
		tvPermis.setMaxHeight(100);
		
		//Controls
		
		AnchorPane apEdit = new AnchorPane();

		Label lNoPermis = new Label("noPermis");
		Label lDateDebutPermis = new Label("dateDebutPermis");
		Label lDateFinPermis = new Label("dateFinPermis");
		Label lTerritoireGardien = new Label("territoireGardien");
		Label lTypePermis = new Label("typePermis");
		Label lNom = new Label("Nom");
		Label lCouleur = new Label("Couleur");
		Label lSexe = new Label("Sexe:");
		Label lDateNaissance = new Label("DateNaissance");
		Label lPoids = new Label("Poids(Kg)");

		TextField tfNoPermis = new TextField("1234");
		tfNoPermis.setPrefWidth(70);
		TextField tfNom = new TextField("Normandin");
		TextField tfCouleur = new TextField("Noir");
		TextField tfPoids = new TextField("10Kg");
		
		DatePicker dpDateDebutPermis = new DatePicker();
		DatePicker dpDateFinPermis = new DatePicker();
		DatePicker dpDateNaissance = new DatePicker();
		
		ObservableList<String> olTerritoire = FXCollections.observableArrayList(
				"Saint-Vincent-de-Paul",
				"Duvernay",
				"Sainte-Dorothée",
				"Sainte-Rose",
				"Chomedey",
				"Laval-des-Rapides");
		
		ObservableList<String> olType = FXCollections.observableArrayList(
				"Chien",
				"Chat");
		
		ComboBox<String> cbTerritoireGardien = new ComboBox<String>(olTerritoire);
		ComboBox<String> cbTypePermis = new ComboBox<String>(olType);
		
		CheckBox chbVaccination = new CheckBox("Vaccination");
		CheckBox chbSterelisation = new CheckBox("Sterelisation");
		CheckBox chbMicropuce = new CheckBox("Micropuce");
		CheckBox chbDangereux = new CheckBox("Animal Dangereux");
		
		RadioButton rbMale = new RadioButton("Male");
		RadioButton rbFemelle = new RadioButton("Femelle");
		
		Separator sep = new Separator();
		sep.setOrientation(Orientation.HORIZONTAL);
		sep.setPrefWidth(1050);
			
		
		apEdit.getChildren().addAll(
				lNoPermis,
				tfNoPermis,
				lDateDebutPermis,
				dpDateDebutPermis,
				lDateFinPermis,
				dpDateFinPermis,
				lTerritoireGardien,
				cbTerritoireGardien,
				sep,
				lTypePermis,
				cbTypePermis,
				lNom,
				tfNom,
				lCouleur,
				tfCouleur,
				lSexe,
				rbMale,
				rbFemelle,
				chbVaccination,
				chbSterelisation,
				chbMicropuce,
				chbDangereux,
				lDateNaissance,
				dpDateNaissance,
				lPoids,
				tfPoids);

		//noPermis
		AnchorPane.setTopAnchor(lNoPermis, 15d);
		AnchorPane.setLeftAnchor(lNoPermis, 15d);
		
		AnchorPane.setTopAnchor(tfNoPermis, 30d);
		AnchorPane.setLeftAnchor(tfNoPermis, 15d);

		//dateDebutPermis
		AnchorPane.setTopAnchor(lDateDebutPermis, 15d);
		AnchorPane.setLeftAnchor(lDateDebutPermis, 150d);
		
		AnchorPane.setTopAnchor(dpDateDebutPermis, 30d);
		AnchorPane.setLeftAnchor(dpDateDebutPermis, 150d);
		
		//dateFinPermis
		AnchorPane.setTopAnchor(lDateFinPermis, 15d);
		AnchorPane.setLeftAnchor(lDateFinPermis, 350d);

		AnchorPane.setTopAnchor(dpDateFinPermis, 30d);
		AnchorPane.setLeftAnchor(dpDateFinPermis, 350d);
		
		//territoireGardien
		AnchorPane.setTopAnchor(lTerritoireGardien, 15d);
		AnchorPane.setLeftAnchor(lTerritoireGardien, 550d);

		AnchorPane.setTopAnchor(cbTerritoireGardien, 30d);
		AnchorPane.setLeftAnchor(cbTerritoireGardien, 550d);
		
		AnchorPane.setTopAnchor(sep, 65d);
		
		//typePermis
		AnchorPane.setTopAnchor(lTypePermis, 75d);
		AnchorPane.setLeftAnchor(lTypePermis, 15d);

		AnchorPane.setTopAnchor(cbTypePermis, 90d);
		AnchorPane.setLeftAnchor(cbTypePermis, 15d);
		
		//nom
		AnchorPane.setTopAnchor(lNom, 75d);
		AnchorPane.setLeftAnchor(lNom, 150d);

		AnchorPane.setTopAnchor(tfNom, 90d);
		AnchorPane.setLeftAnchor(tfNom, 150d);
		
		//couleur
		AnchorPane.setTopAnchor(lCouleur, 75d);
		AnchorPane.setLeftAnchor(lCouleur, 350d);

		AnchorPane.setTopAnchor(tfCouleur, 90d);
		AnchorPane.setLeftAnchor(tfCouleur, 350d);
		
		//sexe
		AnchorPane.setTopAnchor(lSexe, 140d);
		AnchorPane.setLeftAnchor(lSexe, 15d);
		
		AnchorPane.setTopAnchor(rbMale, 140d);
		AnchorPane.setLeftAnchor(rbMale, 75d);
		
		AnchorPane.setTopAnchor(rbFemelle, 140d);
		AnchorPane.setLeftAnchor(rbFemelle, 150d);
		
		//vaccination
		AnchorPane.setTopAnchor(chbVaccination, 180d);
		AnchorPane.setLeftAnchor(chbVaccination, 15d);
		
		//sterelisation
		AnchorPane.setTopAnchor(chbSterelisation, 180d);
		AnchorPane.setLeftAnchor(chbSterelisation, 150d);
		
		//micropuce
		AnchorPane.setTopAnchor(chbMicropuce, 220d);
		AnchorPane.setLeftAnchor(chbMicropuce, 15d);
		
		//animal dangereux
		AnchorPane.setTopAnchor(chbDangereux, 220d);
		AnchorPane.setLeftAnchor(chbDangereux, 150d);
		
		//dateNaissance
		AnchorPane.setTopAnchor(lDateNaissance, 140d);
		AnchorPane.setLeftAnchor(lDateNaissance, 350d);

		AnchorPane.setTopAnchor(dpDateNaissance, 155d);
		AnchorPane.setLeftAnchor(dpDateNaissance, 350d);
		
		//poids
		AnchorPane.setTopAnchor(lPoids, 205d);
		AnchorPane.setLeftAnchor(lPoids, 350d);
		
		AnchorPane.setTopAnchor(tfPoids, 220d);
		AnchorPane.setLeftAnchor(tfPoids, 350d);
		
		
		center.getItems().addAll(tvPermis,apEdit);
		return center;
	}
	
	

}
