package org.apereo.cas.configuration.model.support.generic;

import org.apereo.cas.configuration.support.RequiresModule;
import org.apereo.cas.configuration.support.SpringResourceProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * This is {@link GroovyAuthenticationProperties}.
 *
 * @author Misagh Moayyed
 * @since 6.1.0
 */
@RequiresModule(name = "cas-server-support-generic")
@Getter
@Setter
public class GroovyAuthenticationProperties extends SpringResourceProperties {

    private static final long serialVersionUID = 2179027841236526083L;

    /**
     * Authentication hanler name used to verify credentials in the file.
     */
    private String name;

    /**
     * Order of the authentication handler in the chain.
     */
    private Integer order;
}
