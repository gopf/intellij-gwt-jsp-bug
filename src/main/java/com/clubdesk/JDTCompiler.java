package com.clubdesk;

import org.apache.tools.ant.taskdefs.Javac;
import org.eclipse.jdt.core.JDTCompilerAdapter;

public class JDTCompiler extends JDTCompilerAdapter {

  @Override
  public void setJavac(Javac attributes) {
    if (attributes.getTarget() == null) {
      attributes.setTarget("1.7");
    }
    if (attributes.getSource() == null) {
      attributes.setSource("1.7");
    }
    attributes.setDebug(true);
    attributes.setVerbose(true);
    super.setJavac(attributes);
  }
}