package ua.lviv.iot.work;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/root")
public class WorkApplication extends Application {


    public WorkApplication() {
    }

    public Set<Class<?>> getClasses() {
        HashSet<Class<?>> set = new HashSet<>();
        set.add(MilitaryMachineryService.class);

        return set;
    }

    @Override
    public Set<Object> getSingletons() {
        final Set<Object> instances = new HashSet<Object>();
        return instances;
    }
}
