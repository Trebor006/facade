package com.mibu.facade;

public class CodecFactory {

  public static Codec extract(VideoFile file) {
    String type = file.getCodecType();
    return getCodec(type);
  }

  public static Codec getCodec(String type) {
    if (type.equals(MPEG4CompressionCodec.TYPE)) {
      return new MPEG4CompressionCodec();
    }

    if (type.equals(OggCompressionCodec.TYPE)) {
      return new OggCompressionCodec();
    }

    System.out.println("unssported type " + type);
    return null;
  }
}
