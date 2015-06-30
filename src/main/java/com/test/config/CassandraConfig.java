package com.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 *
 * @author bl4ckbird
 */
@Configuration
@EnableCassandraRepositories("com.test.repository")
public class CassandraConfig extends AbstractCassandraConfiguration{


    private static final String KEYSPACE_NAME = "demo";
    private static final String CONTACT_POINTS = "casdb";
    private static final int PORT = 9042;
    private static final int MAX_POOL_CONNECTION = 50;

    @Override
    protected String getKeyspaceName() {

        return KEYSPACE_NAME;
    }

    @Override
    protected String getContactPoints() {
        return CONTACT_POINTS;
    }

    @Override
    protected int getPort() {
        return PORT;
    }

     @Override
        public SchemaAction getSchemaAction() {
            return SchemaAction.NONE;
     }

    @Bean
    public CassandraOperations operations() throws Exception {

        return new CassandraTemplate(session().getObject(), new MappingCassandraConverter(new BasicCassandraMappingContext()));
    } 

}