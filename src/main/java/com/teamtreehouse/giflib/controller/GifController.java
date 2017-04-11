package com.teamtreehouse.giflib.controller;


import com.teamtreehouse.giflib.data.GifRepository;
import com.teamtreehouse.giflib.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.List;

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/")
    public String listGifs(ModelMap modelMap){

        List<Gif> allGifs = gifRepository.getAllGifs();
        modelMap.put("gifs",allGifs);


        return "home";
    }

    //this method is called when the user will request a path for a particular gif file ie gif path ...the spring framework will pass a modelmap object
    //what we will be doing in this method is to add the gif object to this modelmap object just like a hashmap i.e with a key as a string and value as a gif object
    @RequestMapping("/gif/{name}")
    public String gifDetails(@PathVariable String name,  ModelMap modelMap){



        //This modelMap will make the below gif object available to gif-details view i.e. to the gif-details.html file


        @SuppressWarnings("Since15") Gif gif = gifRepository.findByName(name);



        modelMap.put("gif",gif);

        return "gif-details";
        //no need to return the modelmap as the spring framework will do the work of making a modelmap available to the templating engine i.e Thymeleaf
    }


    // in the gif-details.html      Well, back in the template,we can access model map values with these variable expressions, which start with a dollar sign and, again, are enclosed by curly braces.
    // In this expression, I'm saying I'd like to access the name field of the attribute named gif that has been added to our model map. the Thymeleaf will not call the private mName variable
    //but instead it will call the getname() method with the "name" (i.e value got from the model map) as a parameter

/*


    @RequestMapping("/gif")
    @ResponseBody
    public String testGifs(){


        return "This is the uri/gif test !!";
    }

*/

}
