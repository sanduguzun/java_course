package ru.stqa.pft.sandbox;

import com.sun.prism.shader.Solid_Color_AlphaTest_Loader;

import javax.security.auth.callback.LanguageCallback;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args){
    String[] langs = {"Java","C#","Python","PHP"};

    List<String> languages = Arrays.asList("Java","C#","Python","PHP");


    for (String l : languages){
      System.out.println("I want to learn" + l);
    }
  }
}
