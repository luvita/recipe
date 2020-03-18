package com.smile.studio.recipe.model.greendao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig pecipeDaoConfig;
    private final DaoConfig typeDaoConfig;

    private final PecipeDao pecipeDao;
    private final TypeDao typeDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        pecipeDaoConfig = daoConfigMap.get(PecipeDao.class).clone();
        pecipeDaoConfig.initIdentityScope(type);

        typeDaoConfig = daoConfigMap.get(TypeDao.class).clone();
        typeDaoConfig.initIdentityScope(type);

        pecipeDao = new PecipeDao(pecipeDaoConfig, this);
        typeDao = new TypeDao(typeDaoConfig, this);

        registerDao(Pecipe.class, pecipeDao);
        registerDao(Type.class, typeDao);
    }

    public void clear() {
        pecipeDaoConfig.clearIdentityScope();
        typeDaoConfig.clearIdentityScope();
    }

    public PecipeDao getPecipeDao() {
        return pecipeDao;
    }

    public TypeDao getTypeDao() {
        return typeDao;
    }

}
