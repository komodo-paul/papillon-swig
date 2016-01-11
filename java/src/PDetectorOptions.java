/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PDetectorOptions extends PSerialisationInterface {
  private long swigCPtr;

  protected PDetectorOptions(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PDetectorOptions_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PDetectorOptions obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PDetectorOptions(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PDetectorOptions() {
    this(PapillonCoreJavaJNI.new_PDetectorOptions__SWIG_0(), true);
  }

  public PDetectorOptions(PDetectorOptions other) {
    this(PapillonCoreJavaJNI.new_PDetectorOptions__SWIG_1(PDetectorOptions.getCPtr(other), other), true);
  }

  public void Reset() {
    PapillonCoreJavaJNI.PDetectorOptions_Reset(swigCPtr, this);
  }

  public PResult SetThreshold(float threshold) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetThreshold(swigCPtr, this, threshold), true);
  }

  public float GetThreshold() {
    return PapillonCoreJavaJNI.PDetectorOptions_GetThreshold(swigCPtr, this);
  }

  public PResult SetRegionOfInterest(PRectanglei roi) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetRegionOfInterest(swigCPtr, this, PRectanglei.getCPtr(roi), roi), true);
  }

  public PRectanglei GetRegionOfInterest() {
    return new PRectanglei(PapillonCoreJavaJNI.PDetectorOptions_GetRegionOfInterest(swigCPtr, this), false);
  }

  public PResult SetMinDetectionSize(int minDetectionSize) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetMinDetectionSize__SWIG_0(swigCPtr, this, minDetectionSize), true);
  }

  public PResult SetMinDetectionSize(PSizei minDetectionSize) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetMinDetectionSize__SWIG_1(swigCPtr, this, PSizei.getCPtr(minDetectionSize), minDetectionSize), true);
  }

  public PSizei GetMinDetectionSize() {
    return new PSizei(PapillonCoreJavaJNI.PDetectorOptions_GetMinDetectionSize(swigCPtr, this), false);
  }

  public PResult SetMaxDetectionSize(int maxDetectionSize) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetMaxDetectionSize__SWIG_0(swigCPtr, this, maxDetectionSize), true);
  }

  public PResult SetMaxDetectionSize(PSizei maxDetectionSize) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetMaxDetectionSize__SWIG_1(swigCPtr, this, PSizei.getCPtr(maxDetectionSize), maxDetectionSize), true);
  }

  public PSizei GetMaxDetectionSize() {
    return new PSizei(PapillonCoreJavaJNI.PDetectorOptions_GetMaxDetectionSize(swigCPtr, this), false);
  }

  public PResult SetMaxDetections(int maxDetections) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetMaxDetections(swigCPtr, this, maxDetections), true);
  }

  public int GetMaxDetections() {
    return PapillonCoreJavaJNI.PDetectorOptions_GetMaxDetections(swigCPtr, this);
  }

  public PResult SetIntParameter(PString parameterName, int value) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetIntParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName, value), true);
  }

  public int GetIntParameter(PString parameterName) {
    return PapillonCoreJavaJNI.PDetectorOptions_GetIntParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName);
  }

  public PResult SetDoubleParameter(PString parameterName, double value) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_SetDoubleParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName, value), true);
  }

  public double GetDoubleParameter(PString parameterName) {
    return PapillonCoreJavaJNI.PDetectorOptions_GetDoubleParameter(swigCPtr, this, PString.getCPtr(parameterName), parameterName);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PDetectorOptions_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PDetectorOptions_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PDetectorOptions_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

  public static PDetectorOptions getNO_OPTION() {
    long cPtr = PapillonCoreJavaJNI.PDetectorOptions_NO_OPTION_get();
    return (cPtr == 0) ? null : new PDetectorOptions(cPtr, false);
  }

}
