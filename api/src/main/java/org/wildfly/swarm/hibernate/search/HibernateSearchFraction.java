package org.wildfly.swarm.hibernate.search;

import org.wildfly.swarm.spi.api.Fraction;

/**
 * @author George Gastaldi
 */
public class HibernateSearchFraction implements Fraction {

    public static HibernateSearchFraction createDefaultFraction() {
        return new HibernateSearchFraction();
    }

}
