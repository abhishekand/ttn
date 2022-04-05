package com.mysite.core.models.impl;

import com.mysite.core.models.Author;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;


@Model(adaptables = {SlingHttpServletRequest.class,Resource.class}, adapters = Author.class)
public class AuthorImpl implements Author {
    //String title;
    @ValueMapValue
    @Required
    String firstName;


    @ValueMapValue
    @Optional
    String lastName;


    @Override
    public String getFirstName() {
        return firstName;

    }

    @Override
    public String getLastName() {
        return lastName;
    }
}