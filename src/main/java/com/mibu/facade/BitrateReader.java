package com.mibu.facade;

public class BitrateReader {

  public static VideoFile read(VideoFile file, Codec codec) {
    System.out.println("BitrateReader: reading file from " + codec.getCodecExtension());
    return file;
  }

  public static VideoFile convert(VideoFile buffer, Codec codec) {
    System.out.println("BitrateReader: writing file to " + codec.getCodecExtension());
    buffer.setCodecType(codec.getCodecExtension());
    return buffer;
  }
}
