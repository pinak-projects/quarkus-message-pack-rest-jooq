/*
 * This file is generated by jOOQ.
 */
package gensrc;


import gensrc.tables.RoleMaster;
import gensrc.tables.UserMaster;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = -1444467842;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>ROLE_MASTER</code>.
     */
    public final RoleMaster ROLE_MASTER = RoleMaster.ROLE_MASTER;

    /**
     * The table <code>USER_MASTER</code>.
     */
    public final UserMaster USER_MASTER = UserMaster.USER_MASTER;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            RoleMaster.ROLE_MASTER,
            UserMaster.USER_MASTER);
    }
}