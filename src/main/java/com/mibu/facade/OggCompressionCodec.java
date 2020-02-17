package com.mibu.facade;

public class OggCompressionCodec implements Codec {
  public static final String TYPE = "ogg";

  public OggCompressionCodec() {
  }

  @Override
  public String getCodecExtension() {
    return TYPE;
  }
}
