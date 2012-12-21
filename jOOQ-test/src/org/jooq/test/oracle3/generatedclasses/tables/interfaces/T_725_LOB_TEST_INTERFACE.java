/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_725_LOB_TEST", schema = "TEST")
public interface T_725_LOB_TEST_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	public void setLOB(byte[] value);

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>. 
	 */
	@javax.persistence.Column(name = "LOB")
	public byte[] getLOB();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_725_LOB_TEST_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_725_LOB_TEST_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_725_LOB_TEST_INTERFACE> E into(E into);
}
