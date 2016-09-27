package org.thangnv;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main extends Application {
    protected Text text = new Text("Hello World!");
    protected BorderPane getPane(){
        HBox paneForButton = new HBox(500);
        Button btnDown = new Button("Down",new ImageView("img\\down.gif"));
        Button btnUp = new Button("Up",new ImageView("img\\up.gif"));
        paneForButton.getChildren().addAll(btnDown,btnUp);
        paneForButton.setStyle("-fx-border-color:red;-fx-border-style:dashed");
        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButton);
        Pane paneOfText = new Pane();
        paneOfText.getChildren().add(text);
        pane.setCenter(paneOfText);
        btnDown.setOnAction(e->text.setY(text.getY()+10));
        btnUp.setOnAction(e->text.setY(text.getY()-10));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(getPane(),500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
    }
}