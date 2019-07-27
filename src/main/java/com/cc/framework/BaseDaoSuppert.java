package com.cc.framework;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chenchao on 2019/7/26.
 */
public abstract class BaseDaoSuppert<T extends Serializable,PK extends Serializable> {
    //讲究 我写的这个类是给别人继承的
    // 所以这个类你会单独new出来

    // 设置主键名
//    protected abstract String getPkColumn();

    //数据源 一般注入的
    protected abstract void setDataSource(DataSource dataSource);


    protected List<T> find (QueryRule queryRule){
        QueryRuleBuilder queryRuleBuilder = new QueryRuleBuilder(queryRule);
        return null;
    }

}
