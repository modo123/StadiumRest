/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import entities.Stadion;
import servlet.StadionContext;

@Path("/stadion")
public class StadionResource 
{

    public static final String STADION_CONTEXT = "stadionContext";

    @Context
    ServletContext context;

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Stadion> listStadions() 
    {
        return getStadionContext().findAllEvents();
    }

    @GET
    @Path("find")
    @Produces(MediaType.APPLICATION_JSON)
    public Stadion findStadion(@DefaultValue("-1") @QueryParam("stadion_id") Integer stadionId) 
    {
        return getStadionContext().findEvent(stadionId);
    }

    

   private StadionContext getStadionContext() 
   {
        StadionContext stadionContext = (StadionContext) context.getAttribute(STADION_CONTEXT);
        if (stadionContext == null) 
        {
            stadionContext = new StadionContext();
            context.setAttribute(STADION_CONTEXT, stadionContext);
        }
        return stadionContext;
    }
}