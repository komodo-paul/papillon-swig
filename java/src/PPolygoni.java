/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class PPolygoni extends PSerialisationInterface {
  private long swigCPtr;

  protected PPolygoni(long cPtr, boolean cMemoryOwn) {
    super(PapillonCoreJavaJNI.PPolygoni_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PPolygoni obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        PapillonCoreJavaJNI.delete_PPolygoni(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PPolygoni(SWIGTYPE_p_std__vectorT_papillon__PPoint2Di_t points) {
    this(PapillonCoreJavaJNI.new_PPolygoni__SWIG_0(SWIGTYPE_p_std__vectorT_papillon__PPoint2Di_t.getCPtr(points)), true);
  }

  public PPolygoni() {
    this(PapillonCoreJavaJNI.new_PPolygoni__SWIG_1(), true);
  }

  public PPolygoni(PRectanglei r) {
    this(PapillonCoreJavaJNI.new_PPolygoni__SWIG_2(PRectanglei.getCPtr(r), r), true);
  }

  public PPolygoni(PPolygoni other) {
    this(PapillonCoreJavaJNI.new_PPolygoni__SWIG_3(PPolygoni.getCPtr(other), other), true);
  }

  public void Clear() {
    PapillonCoreJavaJNI.PPolygoni_Clear(swigCPtr, this);
  }

  public boolean IsEmpty() {
    return PapillonCoreJavaJNI.PPolygoni_IsEmpty(swigCPtr, this);
  }

  public int Size() {
    return PapillonCoreJavaJNI.PPolygoni_Size(swigCPtr, this);
  }

  public PPoint2Di GetPoint(int index) {
    return new PPoint2Di(PapillonCoreJavaJNI.PPolygoni_GetPoint(swigCPtr, this, index), true);
  }

  public PPoint2Di GetFirstPoint() {
    return new PPoint2Di(PapillonCoreJavaJNI.PPolygoni_GetFirstPoint(swigCPtr, this), true);
  }

  public PPoint2Di GetLastPoint() {
    return new PPoint2Di(PapillonCoreJavaJNI.PPolygoni_GetLastPoint(swigCPtr, this), true);
  }

  public PRectanglei GetBoundingRectangle() {
    return new PRectanglei(PapillonCoreJavaJNI.PPolygoni_GetBoundingRectangle(swigCPtr, this), true);
  }

  public PPolygoni GetConvexHull() {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_GetConvexHull(swigCPtr, this), true);
  }

  public void SetPoint(int index, PPoint2Di p) {
    PapillonCoreJavaJNI.PPolygoni_SetPoint(swigCPtr, this, index, PPoint2Di.getCPtr(p), p);
  }

  public PPolygoni AddPoint(int x, int y, int index) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_AddPoint__SWIG_0(swigCPtr, this, x, y, index), false);
  }

  public PPolygoni AddPoint(int x, int y) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_AddPoint__SWIG_1(swigCPtr, this, x, y), false);
  }

  public PPolygoni AddPoint(PPoint2Di p, int index) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_AddPoint__SWIG_2(swigCPtr, this, PPoint2Di.getCPtr(p), p, index), false);
  }

  public PPolygoni AddPoint(PPoint2Di p) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_AddPoint__SWIG_3(swigCPtr, this, PPoint2Di.getCPtr(p), p), false);
  }

  public PPolygoni Intersected(PPolygoni p) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_Intersected(swigCPtr, this, PPolygoni.getCPtr(p), p), true);
  }

  public PPolygoni United(PPolygoni p) {
    return new PPolygoni(PapillonCoreJavaJNI.PPolygoni_United(swigCPtr, this, PPolygoni.getCPtr(p), p), true);
  }

  public PResult Write(POutputStream os, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PPolygoni_Write__SWIG_0(swigCPtr, this, POutputStream.getCPtr(os), os, format.swigValue()), true);
  }

  public PResult Write(POutputStream os) {
    return new PResult(PapillonCoreJavaJNI.PPolygoni_Write__SWIG_1(swigCPtr, this, POutputStream.getCPtr(os), os), true);
  }

  public PResult Read(PInputStream is, ESerialisationFormat format) {
    return new PResult(PapillonCoreJavaJNI.PPolygoni_Read__SWIG_0(swigCPtr, this, PInputStream.getCPtr(is), is, format.swigValue()), true);
  }

  public PResult Read(PInputStream is) {
    return new PResult(PapillonCoreJavaJNI.PPolygoni_Read__SWIG_1(swigCPtr, this, PInputStream.getCPtr(is), is), true);
  }

  public PString ToString() {
    return new PString(PapillonCoreJavaJNI.PPolygoni_ToString(swigCPtr, this), true);
  }

  public static PClassId getC_CLASSID() {
    long cPtr = PapillonCoreJavaJNI.PPolygoni_C_CLASSID_get();
    return (cPtr == 0) ? null : new PClassId(cPtr, false);
  }

}
