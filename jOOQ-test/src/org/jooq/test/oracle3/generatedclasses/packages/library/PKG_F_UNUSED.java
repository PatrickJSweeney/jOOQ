/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PKG_F_UNUSED extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.lang.Cloneable {

	private static final long serialVersionUID = 109786309;

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_F_UNUSED.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PKG_F_UNUSED() {
		super("PKG_F_UNUSED", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.packages.LIBRARY.LIBRARY, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
