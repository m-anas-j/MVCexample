package com.org;

public class Main {

    /**
     * The main function contains three objects: view, model
     * and controller. Controller works as the mediator between view and
     * model. Order of operations: User interacts with view ->
     * Controller gets user info from view -> Controller asks the model
     * to fetch the info the user has requested -> Model sends the info
     * to the controller -> Controller sends the user requested info to
     * the view -> Client sees what he wanted to see.
     * ->
    **/
    public static void main(String[] args)
    {
        StudentView view = new StudentView();
        StudentModel model = new StudentModel();
        StudentController controller = new StudentController(model, view);

        controller.getInputFromView();
        controller.getUserRequestedInfo();
        controller.updateView();
    }
}
