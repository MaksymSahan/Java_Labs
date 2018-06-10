package ua.lviv.iot.work;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.work.MilitaryMachinery;

@Named
@Dependent
public class MilitaryMachineryDaoImpl extends AbstractDao<MilitaryMachinery> implements MilitaryMachineryDao, Serializable {

    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<MilitaryMachinery> getEntityClass() {
        return MilitaryMachinery.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

    @PostConstruct
    public void init() {
        System.out.println("ready");
    }

}