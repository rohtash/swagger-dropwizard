
package com.tesco.swagger.config;

import com.google.common.base.Charsets;
import io.dropwizard.views.View;

/**
 * Serves the content of Swagger's index page which has been "templatized" to support replacing
 * the directory in which Swagger's static content is located (i.e. JS files) and the path with
 * which requests to resources need to be prefixed
 *
 */
public class SwaggerView extends View {

    private final String swaggerAssetsPath;
    private final String contextPath;

    protected SwaggerView(String applicationContextPath) {
        super("index.ftl", Charsets.UTF_8);
        if (applicationContextPath.charAt(0) != '/') {
            applicationContextPath = '/' + applicationContextPath;
        }
        if (applicationContextPath.equals("/")) {
            swaggerAssetsPath = "/swagger-static";
            contextPath = "";
        } else {
            swaggerAssetsPath = applicationContextPath + "/swagger-static";
            contextPath = applicationContextPath;
        }
    }

    /**
     * Returns the path with which all requests for Swagger's static content need to be prefixed
     */
    public String getSwaggerStaticPath() {
        return swaggerAssetsPath;
    }

    /**
     * Returns the path with with which all requests made by Swagger's UI to Resources need to be prefixed
     */
    public String getContextPath() {
        return contextPath;
    }
}
