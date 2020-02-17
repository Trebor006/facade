package com.mibu.facade;

import java.io.File;

public class AudioMixer {

  public AudioMixer() {
  }

  public File fix(VideoFile result) {
    System.out.println("AudioMixer: fixing audio...");
    return new File(result.getName());
  }
}
