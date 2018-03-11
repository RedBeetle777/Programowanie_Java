//========================================================================
// This conversion was produced by the Free Edition of
// C++ to Java Converter courtesy of Tangible Software Solutions.
// Order the Premium Edition at https://www.tangiblesoftwaresolutions.com
//========================================================================

/*!
 * Modeluje zbior operatorow arytmetycznych.
 */
public enum Operator
{
	Op_Dodaj,
	Op_Odejmij,
	Op_Mnoz,
	Op_Dziel;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static Operator forValue(int value)
	{
		return values()[value];
	}
}