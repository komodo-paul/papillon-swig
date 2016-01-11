/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PSizei extends PSerialisationInterface {
  private long swigCPtr;

  protected PSizei(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PSizei_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PSizei obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PSizei(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PSizei() {
    this(PapillonCoreJavaJNI.new_PSizei__SWIG_0(), true);
  }

  public PSizei(int width, int height) {
    this(PapillonCoreJavaJNI.new_PSizei__SWIG_1(width, height), true);
  }

  public PSizei(PSizei other) {
    this(PapillonCoreJavaJNI.new_PSizei__SWIG_2(PSizei.getCPtr(other), other), true);
  }

  public boolean IsValid() {
    return PapillonCoreJavaJNI.PSizei_IsValid(swigCPtr, this);
  }

  public int GetWidth() {
    return PapillonCoreJavaJNI.PSizei_GetWidth(swigCPtr, this);
  }

  public int GetHeight() {
    return PapillonCoreJavaJNI.PSizei_GetHeight(swigCPtr, this);
  }

  public void Set(int width, int height) {
    PapillonCoreJavaJNI.PSizei_Set(swigCPtr, this, width, height);
  }

  public void SetWidth(int width) {
    PapillonCoreJavaJNI.PSizei_SetWidth(swigCPtr, this, width);
  }

  public void SetHeight(int height) {
    PapillonCoreJavaJNI.PSizei_SetHeight(swigCPtr, this, height);
  }

  public PSizei Scale(float factor) {
    return new PSizei(PapillonCoreJavaJNI.PSizei_Scale(swigCPtr, this, factor), true);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PSizei_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PSizei_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PSizei_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PSizei_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PSizei_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PSizei_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

  public static PSizei getC_ZERO() {
    long cPtr = PapillonCoreJavaJNI.PSizei_C_ZERO_get();
    return (cPtr == 0) ? null : new PSizei(cPtr, false);
  }

}
