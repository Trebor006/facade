package com.mibu.facade;

import java.io.File;
import java.util.Objects;

public class VideoConversionFacade {

  public VideoConversionFacade() {
  }

  public File convertVideo(String fileName, String destinationType) {
    System.out.println("VideoConversionFacade: validating Codec.");

    VideoFile file = new VideoFile(fileName);
    Codec sourceCodec = CodecFactory.extract(file);
    Codec destinationCodec;

    if (Objects.isNull(sourceCodec)) {
      System.out.println("VideoConversionFacade: unsupported destinationType.");
      return null;
    }

    if (destinationType.equals(sourceCodec.getCodecExtension())) {
      System.out.println("----------------- same format, conversion  --------------------");
      return null;
    }

    destinationCodec = CodecFactory.getCodec(destinationType);

    if (Objects.isNull(destinationCodec)) {
      return null;
    }

    System.out.println("VideoConversionFacade: conversion started.");

    VideoFile buffer = BitrateReader.read(file, sourceCodec);
    VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

    File result = (new AudioMixer()).fix(intermediateResult);

    System.out.println("VideoConversionFacade: conversion completed.");

    return result;
  }
}
