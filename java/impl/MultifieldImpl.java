package com.mysite.core.models.impl;
import com.mysite.core.models.Multifield;
import jdk.internal.loader.Resource;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;

@Model(adaptables = Resource.class, adapters = Multifield.class)
public class MultifieldImpl implements Multifield{

    @Inject
    String blogtitle;

    @Inject
    String blogdesc;

    @Inject
    String bloglink;

    @Inject
    String blogdate;

    @Override
    public String getBlogtitle() {
        return blogtitle;
    }

    @Override
    public String getBlogdesc() {
        return blogdesc;
    }

    @Override
    public String getBlogdate() {
        return blogdate;
    }

    @Override
    public String getBloglink() {
        return bloglink;
    }
}
