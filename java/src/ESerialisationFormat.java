/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public final class ESerialisationFormat {
  public final static ESerialisationFormat E_NEUTRAL_BINARY_FORMAT = new ESerialisationFormat("E_NEUTRAL_BINARY_FORMAT");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ESerialisationFormat swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ESerialisationFormat.class + " with value " + swigValue);
  }

  private ESerialisationFormat(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ESerialisationFormat(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ESerialisationFormat(String swigName, ESerialisationFormat swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ESerialisationFormat[] swigValues = { E_NEUTRAL_BINARY_FORMAT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

