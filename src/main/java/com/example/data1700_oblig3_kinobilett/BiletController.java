package com.example.data1700_oblig3_kinobilett;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class BiletController {
    public final ArrayList<Film> filmLister=new ArrayList<>();
    public final ArrayList<Bilet> biletArrayList=new ArrayList<>();
    public BiletController(){
        Film film1=new Film("Action","Dune It Begins");
        filmLister.add(film1);
        Film film2=new Film("Action","Dune part two");
        filmLister.add(film2);
        Film film3=new Film("Action","GxK");
        filmLister.add(film3);
        Film film4=new Film("Animation","Wish");
        filmLister.add(film4);
        Film film5=new Film("Animation","Trolls Band Together");
        filmLister.add(film5);
        Film film6=new Film("Animation","Kung Fu Panda 4");
        filmLister.add(film6);
        Film film7=new Film("Comedy","Grown Ups 1");
        filmLister.add(film7);
        Film film8=new Film("Comedy","Grown Ups 2");
        filmLister.add(film8);
        Film film9=new Film("Comedy","Anger Management");
        filmLister.add(film9);
    }
    @GetMapping("/hentfilmer")
    public ArrayList<Film> hentFilmer(){
        return filmLister;
    }
    @PostMapping("/lagreBilet")
    public void lagreBilet(Bilet bilet){
        biletArrayList.add(bilet);
    }
    @GetMapping("/hentBiletter")
    public ArrayList<Bilet> hentBiletter(){
        return biletArrayList;
    }
    @GetMapping("/slettBiletter")
    public void slettBiletter(){
        biletArrayList.clear();
    }
}
