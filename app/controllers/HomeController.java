package controllers;

import play.mvc.*;
import java.util.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }


    public Result about() {return ok(views.html.about.render());}

    public Result hello() {return ok(views.html.hello.render());}

    public Result status() {return ok(views.html.status.render());}

    public Result bye() {return ok(views.html.bye.render());}

    private static final String[] members = {"Ana", "Boris", "Jelena", "Marko"};

    public Result members(){
        StringBuilder html = new StringBuilder("<html><body>");
        html.append("<h1>Team Members</h1>");
        html.append("<ul>");

        for(String member : members){
            html.append("<li>").append(member).append("</li>");
        }

        html.append("</ul>");
        html.append("</body></html>");

        return ok(html.toString()).as("text/html");
    }

    public Result greet(){
        String name = "Milica";
        return ok(views.html.greet.render(name));
    }

    public Result users(){
        List<String> users = Arrays.asList("Milica", "Nikola", "Jovan", "Sara");
        StringBuilder html = new StringBuilder("<html><body>");
        html.append("<h1>Users</h1>");
        html.append("<ul>");

        for(String user : users){
            html.append("<li>").append(user).append("</li>");
        }

        html.append("</ul>");
        html.append("</body></html>");

        return ok(html.toString()).as("text/html");
    }
}
