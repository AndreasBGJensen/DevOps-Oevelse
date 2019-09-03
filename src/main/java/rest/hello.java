package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Path("Hel")
public class hello {




    @GET
    public String getTest(){
        return "Hello World";
    }


}
