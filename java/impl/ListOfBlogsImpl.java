package com.mysite.core.models.impl;

import com.mysite.core.models.ListOfBlogs;
import com.mysite.core.models.Multifield;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.inject.Inject;
import java.util.List;
@Model(adaptables = Resource.class, adapters = ListOfBlogs.class)
public class ListOfBlogsImpl implements ListOfBlogs {
    @Inject
    List<Multifield> blogs;
    @Override
    public List<Multifield> getBlogs() {
        return blogs;
    }
}
