/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 first_name last_name
 */

package assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //1.
    //The application shall be able to manage at least 100 unique todo lists
    //2.
    //A todo list shall have a title
    //3.
    //A todo list shall have the capacity to store at least 100 unique items
    //7/3/2021 Application Assignment 1 [Part 1]
    //https://webcourses.ucf.edu/courses/1379002/assignments/7143803 2/5
    //4. An item shall have a description
    //5. An item shall have a due date, formatted as YYYY-MM-DD
    //6. A user shall be able to add a new todo list
    //7. A user shall be able to remove an existing todo list
    //8. A user shall be able to edit the title of an existing todo list
    //9. A user shall be able to add a new item to an existing todo list
    //10. A user shall be able to remove an item from an existing todo list
    //11. A user shall be able to edit the description of an item within an existing todo list
    //12. A user shall be able to edit the due date of an item within an existing todo list
    //13. A user shall be able to mark an item in a todo list as complete
    //14. A user shall be able to display all of the existing items in a todo list
    //15. A user shall be able to display only the incomplete items in a todo list
    //16. A user shall be able to display only the completed items in a todo list
    //17. A user shall be able to save all of the items in a single todo list to external storage
    //18. A user shall be able to save all of the items across all of the todo lists to external storage
    //19. A user shall be able to load a single todo list that was previously saved to external storage
    //20. A user shall be able to load multiple todo lists that were previous saved to external storage


    //Below code was originally part of the starter code. I may need to delete it in the future... idk what it's for
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
