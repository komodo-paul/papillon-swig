/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PFrame extends PSerialisationInterface {
  private long swigCPtr;

  protected PFrame(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PFrame_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PFrame obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PFrame(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PFrame() {
    this(PapillonCoreJavaJNI.new_PFrame__SWIG_0(), true);
  }

  public PFrame(PImage image, PGuid frameId, PGuid sourceId) {
    this(PapillonCoreJavaJNI.new_PFrame__SWIG_1(PImage.getCPtr(image), image, PGuid.getCPtr(frameId), frameId, PGuid.getCPtr(sourceId), sourceId), true);
  }

  public PFrame(PImage image, PGuid frameId) {
    this(PapillonCoreJavaJNI.new_PFrame__SWIG_2(PImage.getCPtr(image), image, PGuid.getCPtr(frameId), frameId), true);
  }

  public PFrame(PImage image) {
    this(PapillonCoreJavaJNI.new_PFrame__SWIG_3(PImage.getCPtr(image), image), true);
  }

  public PFrame(PFrame other) {
    this(PapillonCoreJavaJNI.new_PFrame__SWIG_4(PFrame.getCPtr(other), other), true);
  }

  public PGuid GetFrameId() {
    return new PGuid(PapillonCoreJavaJNI.PFrame_GetFrameId(swigCPtr, this), false);
  }

  public PGuid GetSourceId() {
    return new PGuid(PapillonCoreJavaJNI.PFrame_GetSourceId(swigCPtr, this), false);
  }

  public int GetWidth() {
    return PapillonCoreJavaJNI.PFrame_GetWidth(swigCPtr, this);
  }

  public int GetHeight() {
    return PapillonCoreJavaJNI.PFrame_GetHeight(swigCPtr, this);
  }

  public PRectanglei GetRectangle() {
    return new PRectanglei(PapillonCoreJavaJNI.PFrame_GetRectangle(swigCPtr, this), true);
  }

  public void SetNewImage(PImage image, PGuid frameId, PGuid sourceId) {
    PapillonCoreJavaJNI.PFrame_SetNewImage__SWIG_0(swigCPtr, this, PImage.getCPtr(image), image, PGuid.getCPtr(frameId), frameId, PGuid.getCPtr(sourceId), sourceId);
  }

  public void SetNewImage(PImage image, PGuid frameId) {
    PapillonCoreJavaJNI.PFrame_SetNewImage__SWIG_1(swigCPtr, this, PImage.getCPtr(image), image, PGuid.getCPtr(frameId), frameId);
  }

  public void SetNewImage(PImage image) {
    PapillonCoreJavaJNI.PFrame_SetNewImage__SWIG_2(swigCPtr, this, PImage.getCPtr(image), image);
  }

  public void SetImage(PImage image) {
    PapillonCoreJavaJNI.PFrame_SetImage(swigCPtr, this, PImage.getCPtr(image), image);
  }

  public void SetFrameNumber(int frameNumber) {
    PapillonCoreJavaJNI.PFrame_SetFrameNumber(swigCPtr, this, frameNumber);
  }

  public void Resize(PSizei newSize, PImage.EInterpolation interpolation) {
    PapillonCoreJavaJNI.PFrame_Resize__SWIG_0(swigCPtr, this, PSizei.getCPtr(newSize), newSize, interpolation.swigValue());
  }

  public void Resize(PSizei newSize) {
    PapillonCoreJavaJNI.PFrame_Resize__SWIG_1(swigCPtr, this, PSizei.getCPtr(newSize), newSize);
  }

  public void Resize(float scaleFactor, PImage.EInterpolation interpolation) {
    PapillonCoreJavaJNI.PFrame_Resize__SWIG_2(swigCPtr, this, scaleFactor, interpolation.swigValue());
  }

  public void Resize(float scaleFactor) {
    PapillonCoreJavaJNI.PFrame_Resize__SWIG_3(swigCPtr, this, scaleFactor);
  }

  public void ConvertTo(PImage.EPixelFormat format) {
    PapillonCoreJavaJNI.PFrame_ConvertTo(swigCPtr, this, format.swigValue());
  }

  public PImage GetImage() {
    return new PImage(PapillonCoreJavaJNI.PFrame_GetImage__SWIG_0(swigCPtr, this), true);
  }

  public PImage GetImage(PImage.EPixelFormat pixelFormat) {
    return new PImage(PapillonCoreJavaJNI.PFrame_GetImage__SWIG_1(swigCPtr, this, pixelFormat.swigValue()), true);
  }

  public int GetFrameNumber() {
    return PapillonCoreJavaJNI.PFrame_GetFrameNumber(swigCPtr, this);
  }

  public PProperties GetProperties() {
    return new PProperties(PapillonCoreJavaJNI.PFrame_GetProperties(swigCPtr, this), false);
  }

  public void Reset() {
    PapillonCoreJavaJNI.PFrame_Reset(swigCPtr, this);
  }

  public PResult Display(PString title, int waitTimeMs) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Display__SWIG_0(swigCPtr, this, PString.getCPtr(title), title, waitTimeMs), true);
  }

  public PResult Display(PString title) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Display__SWIG_1(swigCPtr, this, PString.getCPtr(title), title), true);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PFrame_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PFrame_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PFrame_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

}
