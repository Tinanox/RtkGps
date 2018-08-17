/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gdal.gnm;

public class ProgressCallback {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ProgressCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProgressCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnmJNI.delete_ProgressCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int run(double dfComplete, String pszMessage) {
    return gnmJNI.ProgressCallback_run(swigCPtr, this, dfComplete, pszMessage);
  }

  public ProgressCallback() {
    this(gnmJNI.new_ProgressCallback(), true);
  }

}