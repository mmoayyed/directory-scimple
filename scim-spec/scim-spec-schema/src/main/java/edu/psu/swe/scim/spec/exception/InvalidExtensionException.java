package edu.psu.swe.scim.spec.exception;

public class InvalidExtensionException extends Exception {
  
  private static final long serialVersionUID = -4113730866775103565L;

  public InvalidExtensionException(String what) {
    super(what);
  }
}
