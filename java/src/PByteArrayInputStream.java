/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PByteArrayInputStream extends PInputStream {
  private long swigCPtr;

  protected PByteArrayInputStream(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PByteArrayInputStream_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PByteArrayInputStream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PByteArrayInputStream(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PByteArrayInputStream(PByteArray buffer) {
    this(PapillonCoreJavaJNI.new_PByteArrayInputStream(PByteArray.getCPtr(buffer), buffer), true);
  }

  public PByteArray GetByteArray() {
    return new PByteArray(PapillonCoreJavaJNI.PByteArrayInputStream_GetByteArray(swigCPtr, this), true);
  }

}
