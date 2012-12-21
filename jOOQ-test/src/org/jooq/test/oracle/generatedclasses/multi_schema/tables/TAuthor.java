/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = 417782424;

	/**
	 * The singleton instance of <code>MULTI_SCHEMA.T_AUTHOR</code>
	 */
	public static final org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor T_AUTHOR = new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord.class;
	}

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.FIRST_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.LAST_NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.DATE_OF_BIRTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.YEAR_OF_BIRTH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>MULTI_SCHEMA.T_AUTHOR.ADDRESS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord, java.lang.Object> ADDRESS = createField("ADDRESS", org.jooq.impl.DefaultDataType.getDefaultDataType("U_ADDRESS_TYPE"), this);

	/**
	 * Create a <code>MULTI_SCHEMA.T_AUTHOR</code> table reference
	 */
	public TAuthor() {
		super("T_AUTHOR", org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA);
	}

	/**
	 * Create an aliased <code>MULTI_SCHEMA.T_AUTHOR</code> table reference
	 */
	public TAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.multi_schema.MultiSchema.MULTI_SCHEMA, org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor.T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TAuthorRecord>>asList(org.jooq.test.oracle.generatedclasses.multi_schema.Keys.PK_T_AUTHOR);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.multi_schema.tables.TAuthor(alias);
	}
}
