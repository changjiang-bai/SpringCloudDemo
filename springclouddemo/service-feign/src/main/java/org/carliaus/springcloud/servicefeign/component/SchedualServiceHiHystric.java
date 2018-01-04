package org.carliaus.springcloud.servicefeign.component;

import org.carliaus.springcloud.servicefeign.iface.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
