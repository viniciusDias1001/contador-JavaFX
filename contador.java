package contador;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class contador extends Application {


    private int contador = 0;
    private String mostrarContador = "0";




    @Override
    public void start(Stage stage) throws Exception {
        Label labelTitulo = new Label("Contador");
        Label labelNumero = new Label("0");
        Button botaoD = new Button("-");
        Button botaoS = new Button("+");
        VBox boxPrincipal = new VBox();
        HBox boxButton = new HBox();

        boxPrincipal.getStyleClass().add("conteudo.css");

        boxPrincipal.getChildren().add(labelTitulo);
        boxPrincipal.getChildren().add(labelNumero);
        boxButton.getChildren().add(botaoD);
        boxButton.getChildren().add(botaoS);
        boxPrincipal.getChildren().add(boxButton);

        boxPrincipal.setSpacing(25);
        boxPrincipal.setAlignment(Pos.CENTER);
        boxButton.setAlignment(Pos.CENTER);
        boxButton.setSpacing(15);

        String caminhoCSS = getClass().getResource("/contador/Contador.css").toExternalForm();





        botaoS.setOnAction(e -> {
            contador ++;
            mostrarContador = Integer.toString(contador);
            labelNumero.setText(mostrarContador);
        });

        botaoD.setOnAction(e -> {
            contador --;
           mostrarContador = Integer.toString(contador);
           labelNumero.setText(mostrarContador);

        });


        Scene cena = new Scene(boxPrincipal,360,240);

        stage.setScene(cena);

        cena.getStylesheets().add(caminhoCSS);

        stage.show();
    }



    public String getMostrarContador() {
        return mostrarContador;
    }

    public void setMostrarContador(String mostrarContador) {
        this.mostrarContador = mostrarContador;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
