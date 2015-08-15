package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class AutosController extends Controller {

    public static void index() {
    	Auto a = new Auto();
    	a.color = "blue";
    	a.modelo = "BMW";
    	a.puertas = 5;
    	
        render(a);
    }

}