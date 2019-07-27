package com.cc.framework;

import javax.sql.DataSource;
import java.io.Serializable;
import java.util.List;

/**
 * Created by chenchao on 2019/7/26.
 */
public abstract class BaseDaoSuppert<T extends Serializable,PK extends Serializable> {
    //���� ��д��������Ǹ����˼̳е�
    // �����������ᵥ��new����

    // ����������
//    protected abstract String getPkColumn();

    //����Դ һ��ע���
    protected abstract void setDataSource(DataSource dataSource);


    protected List<T> find (QueryRule queryRule){
        QueryRuleBuilder queryRuleBuilder = new QueryRuleBuilder(queryRule);
        return null;
    }

}
