/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in LIBRARY_767_PACKAGE_TEST
 */
@java.lang.SuppressWarnings("all")
public final class LIBRARY_767_PACKAGE_TEST extends org.jooq.impl.PackageImpl implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -1228775945;

	/**
	 * The singleton instance of <code>TEST.LIBRARY_767_PACKAGE_TEST</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.packages.LIBRARY_767_PACKAGE_TEST LIBRARY_767_PACKAGE_TEST = new org.jooq.test.oracle3.generatedclasses.packages.LIBRARY_767_PACKAGE_TEST();

	/**
	 * Call <code>TEST.LIBRARY_767_PACKAGE_TEST.LIBRARY_767_PACKAGE_TEST</code>
	 */
	public static java.math.BigDecimal call_LIBRARY_767_PACKAGE_TEST(org.jooq.Configuration configuration) {
		org.jooq.test.oracle3.generatedclasses.packages.library_767_package_test.LIBRARY_767_PACKAGE_TEST f = new org.jooq.test.oracle3.generatedclasses.packages.library_767_package_test.LIBRARY_767_PACKAGE_TEST();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>TEST.LIBRARY_767_PACKAGE_TEST.LIBRARY_767_PACKAGE_TEST</code> as a field
	 */
	public static org.jooq.Field<java.math.BigDecimal> call_LIBRARY_767_PACKAGE_TEST() {
		org.jooq.test.oracle3.generatedclasses.packages.library_767_package_test.LIBRARY_767_PACKAGE_TEST f = new org.jooq.test.oracle3.generatedclasses.packages.library_767_package_test.LIBRARY_767_PACKAGE_TEST();

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private LIBRARY_767_PACKAGE_TEST() {
		super("LIBRARY_767_PACKAGE_TEST", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}
}
