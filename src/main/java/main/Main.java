package main;

import ui.Updater;
import ui.Window;

/**
 * The main
 *
 * TODO: (project-wide)
 *  * javadocs, wherever needed:
 *      * check if and where needed
 *      * add all
 *      * finish all
 *  * simple ui
 *  * simple graphics
 *  * simple data and calculations
 *  * check and organize imports
 */
public class Main {
    //
    public static void main(String[] args) {
        new Updater(new Window()).start();
    }
}