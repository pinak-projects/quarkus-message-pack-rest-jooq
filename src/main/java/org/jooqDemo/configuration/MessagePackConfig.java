package org.jooqDemo.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import org.jooqDemo.constants.APIConstants;
import org.msgpack.jackson.dataformat.MessagePackFactory;

import javax.enterprise.context.Dependent;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.Provider;

@Dependent
public class MessagePackConfig {

    @Provider
    @Produces(APIConstants.APPLICATION_X_MSGPACK)
    @Consumes(APIConstants.APPLICATION_X_MSGPACK)
    public static class JacksonMessagePackProvider extends JacksonJsonProvider {
        public JacksonMessagePackProvider() {
            super(new ObjectMapper(new MessagePackFactory()));
        }

        @Override
        protected boolean hasMatchingMediaType(MediaType mediaType) {
            if (mediaType != null) {
                String subtype = mediaType.getSubtype();
                return "x-msgpack".equals(subtype);
            }
            return false;
        }
    }

}
