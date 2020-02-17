package com.mibu.facade;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {

  public static void main(String[] args) {

    VideoConversionFacade converter = new VideoConversionFacade();

    List<String> formats = Arrays.asList("ogg", "3gp", "mp4");

    for (String initialFormat : formats) {
      String fileName = "youtubevideo." + initialFormat;

      for (String finalFormat : formats) {
        System.out.println("from: " + initialFormat + " > " + finalFormat);
        File videoConverted = converter.convertVideo(fileName, finalFormat);
        if (Objects.nonNull(videoConverted)) {
          System.out.println("Conversion success" + fileName + " > " + videoConverted.getName());
        }

        System.out.println("Conversion finished\n\n");
      }
    }
  }
}
