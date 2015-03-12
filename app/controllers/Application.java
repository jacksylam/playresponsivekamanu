package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.About;
import views.html.Aukahi;
import views.html.Index;
import views.html.Kamanu;
import views.html.Pueo;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }


  /**
   * Returns the Pueo page.
   * @return The resulting Pueo page.
   */
  public static Result pueo() {
    return ok(Pueo.render("Welcome to the Pueo page."));
  }

  /**
   * Returns the Aukahi page.
   * @return The resulting Aukahi page.
   */
  public static Result aukahi() {
    return ok(Aukahi.render("Welcome to the Aukahi page."));
  }

  /**
   * Returns the Kamanu page.
   * @return The resulting Kamanu page.
   */
  public static Result kamanu() {
    return ok(Kamanu.render("Welcome to the Kamanu page."));
  }

  /**
   * Returns the About page.
   * @return The resulting About page.
   */
  public static Result about() {
    return ok(About.render("Welcome to the About page."));
  }


}
