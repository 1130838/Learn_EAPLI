package presentation;

import aplication.CalculateAreaController;

/**
 * Created by bruno.devesa on 04-07-2015.
 */
public class MainUI {


    public void run() {

        showShapes();

        int option = utils.Console.readInteger("choose a shape");

        switch (option){

            case 1:
        }

        CalculateAreaController calculateAreaController = new CalculateAreaController();


    }

    private void showShapes() {
        // goes to the repo through controller and all()

        System.out.println("1 - Rectangule ");
        System.out.println("2 - Circle ");

    }
}
