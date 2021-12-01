
package edu.vt.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named("sliderController")
@RequestScoped
public class SliderController {

    // The List contains image filenames, e.g., photo1.png, photo2.png, etc.
    private List<String> listOfSliderImageFilenames;

    /*
    The PostConstruct annotation is used on a method that needs to be executed after
    dependency injection is done to perform any initialization. The initialization
    method init() is the first method invoked before this class is put into service.
    */
    @PostConstruct
    public void init() {
        listOfSliderImageFilenames = new ArrayList<>();

        for (int i = 1; i <= 12; i++) {
            listOfSliderImageFilenames.add("photo" + i + ".png");
        }
    }

    /*
    =============
    Getter Method
    =============
     */
    public List<String> getListOfSliderImageFilenames() {
        return listOfSliderImageFilenames;
    }

    /*
    ===============
    Instance Method
    ===============
    */
    public String description(String imageFilename) {

        String imageDescription = "";

        switch (imageFilename) {
            case "photo1.png":
                imageDescription = "Satellite View of North American Countries";
                break;
            case "photo2.png":
                imageDescription = "Political Map of Countries on the Planet of Earth";
                break;
            case "photo3.png":
                imageDescription = "Physical Map of Countries on the Planet of Earth";
                break;
            case "photo4.png":
                imageDescription = "Country Flags Around the Globe";
                break;
            case "photo5.png":
                imageDescription = "Continents of the Planet of Earth";
                break;
            case "photo6.png":
                imageDescription = "Map of the Continent of Australia";
                break;
            case "photo7.png":
                imageDescription = "Map of the Countries in the Continent of Asia";
                break;
            case "photo8.png":
                imageDescription = "Map of the Countries in the European Union";
                break;
            case "photo9.png":
                imageDescription = "Map of the Countries in the Continent of Africa";
                break;
            case "photo10.png":
                imageDescription = "Map of the Countries in the Continent of South America";
                break;
            case "photo11.png":
                imageDescription = "Flags of the Countries in the Continent of Africa";
                break;
            case "photo12.png":
                imageDescription = "Physical Map of Countries in the Middle East";
                break;
        }

        return imageDescription;
    }
}
