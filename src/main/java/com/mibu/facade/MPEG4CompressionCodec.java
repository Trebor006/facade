package com.mibu.facade;

public class MPEG4CompressionCodec implements Codec {
  public static final String TYPE = "mp4";

  public MPEG4CompressionCodec() {
  }

  @Override
  public String getCodecExtension() {
    return TYPE;
  }
}
