package controllers;

import play.mvc.*;


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


}
