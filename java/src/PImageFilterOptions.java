/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PImageFilterOptions extends PSerialisationInterface {
  private long swigCPtr;

  protected PImageFilterOptions(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PImageFilterOptions_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PImageFilterOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PImageFilterOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PImageFilterOptions() {
    this(PapillonCoreJavaJNI.new_PImageFilterOptions__SWIG_0(), true);
  }

  public PImageFilterOptions(PImageFilterOptions other) {
    this(PapillonCoreJavaJNI.new_PImageFilterOptions__SWIG_1(PImageFilterOptions.getCPtr(other), other), true);
  }

  public void Reset() {
    PapillonCoreJavaJNI.PImageFilterOptions_Reset(swigCPtr, this);
  }

  public PResult SetRegionOfInterest(PRectanglei roi) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_SetRegionOfInterest(swigCPtr, this, PRectanglei.getCPtr(roi), roi), true);
  }

  public PRectanglei GetRegionOfInterest() {
    return new PRectanglei(PapillonCoreJavaJNI.PImageFilterOptions_GetRegionOfInterest(swigCPtr, this), false);
  }

  public PResult SetIntParameter(PString parameterName, int value) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_SetIntParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName, value), true);
  }

  public int GetIntParameter(PString parameterName) {
    return PapillonCoreJavaJNI.PImageFilterOptions_GetIntParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName);
  }

  public PResult SetDoubleParameter(PString parameterName, double value) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_SetDoubleParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName, value), true);
  }

  public double GetDoubleParameter(PString parameterName) {
    return PapillonCoreJavaJNI.PImageFilterOptions_GetDoubleParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PImageFilterOptions_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PImageFilterOptions_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PImageFilterOptions_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

  public static PImageFilterOptions getNONE() {
    long cPtr = PapillonCoreJavaJNI.PImageFilterOptions_NONE_get();
    return (cPtr == 0) ? null : new PImageFilterOptions(cPtr, false);
  }

}
