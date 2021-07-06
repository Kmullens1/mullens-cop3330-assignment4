/*
 * UCF COP3330 Summer 2021 Assignment 4 Solution
 * Copyright 2021 first_name last_name
 */

package assignments.ucf.uml;

import assignments.ucf.uml.AddNewTodoList;
import assignments.ucf.uml.TodoLists;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //1. The application shall be able to manage at least 100 unique todo lists
        TodoLists list;
        list = new TodoLists();


        //6. A user shall be able to add a new todo list
        AddNewTodoList newList;
        newList = new AddNewTodoList();

        //7. A user shall be able to remove an existing todo list
        RemoveTodoList removeList;
        removeList = new RemoveTodoList();

        //8. A user shall be able to edit the title of an existing todo list
        EditListTitle newTitle;
        newTitle = new EditListTitle();

        //9. A user shall be able to add a new item to an existing todo list
        AddNewItem newItem;
        newItem = new AddNewItem();

        //10. A user shall be able to remove an item from an existing todo list
        RemoveItemFromList removeItem;
        removeItem = new RemoveItemFromList();

        //11. A user shall be able to edit the description of an item within an existing todo list
        EditItemDescription editDescription;
        editDescription = new EditItemDescription();

        //12. A user shall be able to edit the due date of an item within an existing todo list
        EditItemDueDate editDueDate;
        editDueDate = new EditItemDueDate();

        //13. A user shall be able to mark an item in a todo list as complete
        MarkItemComplete markComplete;
        markComplete = new MarkItemComplete();

        //14. A user shall be able to display all of the existing items in a todo list
        DisplayExistingItems displayItems;
        displayItems = new DisplayExistingItems();


        //15. A user shall be able to display only the incomplete items in a todo list
        DisplayIncompleteItems displayIncomplete;
        displayIncomplete = new DisplayIncompleteItems();

        //16. A user shall be able to display only the completed items in a todo list
        DisplayCompleteItems displayComplete;
        displayComplete = new DisplayCompleteItems();

        //17. A user shall be able to save all of the items in a single todo list to external storage
        SaveInSingleList saveSingle;
        saveSingle = new SaveInSingleList();

        //18. A user shall be able to save all of the items across all of the todo lists to external storage
        SaveAllItems saveAll;
        saveAll = new SaveAllItems();

        //19. A user shall be able to load a single todo list that was previously saved to external storage
        LoadSingleList loadSingle;
        loadSingle = new LoadSingleList();

        //20. A user shall be able to load multiple todo lists that were previous saved to external storage
        //Bonus: If your application allows the user to sort a todo list by due date, you will earn 1 extra
        // point for the test and 1 extra point for the implementation.
        launch(args);
    }

    private static void launch(String[] args) {
    }

    //Below code was originally part of the starter code. I may need to delete it in the future... idk what it's for
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
    
}
