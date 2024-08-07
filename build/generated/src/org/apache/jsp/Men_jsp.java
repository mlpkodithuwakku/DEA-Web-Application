package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Men_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_component/allCss.jsp");
    _jspx_dependants.add("/all_component/navbar.jsp");
    _jspx_dependants.add("/all_component/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Men home Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                padding-top: 150px;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("                width: 253px;\n");
      out.write("                height: 500px;\n");
      out.write("                border: none;\n");
      out.write("                margin: 15px;\n");
      out.write("            }\n");
      out.write("            .card-body button{\n");
      out.write("                color: white;\n");
      out.write("                border: 1px solid white;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                position: relative;\n");
      out.write("                height: 40px;\n");
      out.write("                width: 200px;\n");
      out.write("                font-size: 16px;\n");
      out.write("                font-family: Inter;\n");
      out.write("                font-weight: 700;\n");
      out.write("                word-wrap: break-word;\n");
      out.write("                background: #193E29;\n");
      out.write("                font-family: 'Montserrat', sans-serif;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .card-body button:hover{\n");
      out.write("                background: transparent;\n");
      out.write("                color: #193E29;\n");
      out.write("                border: 1px solid #193E29;\n");
      out.write("            }\n");
      out.write("            .card p{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            .row{\n");
      out.write("                    display: block;\n");
      out.write("                    align-items: center;\n");
      out.write("                    justify-content: center;\n");
      out.write("        </style>\n");
      out.write("        ");
      out.write(" <script src=\"https://unpkg.com/boxicons@2.1.4/dist/boxicons.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.8/css/line.css\">\r\n");
      out.write("\r\n");
 
      out.write("\n");
      out.write("        \n");
 
      out.write("\r\n");
      out.write("        \r\n");
 
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" style=\"background-color: #193E29;\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><img src=\"img/logo.png\" style=\"width: 115px; height: 70px;\"></a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">HOME<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          WOMEN'S\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29' \" onmouseout=\"this.style.color='white'\">T-Shirts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Crop-Tops</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Pants</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shorts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Jackets</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          MEN'S\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">T-Shirts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Pants</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shorts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Jackets</a>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\" >\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"newarr.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          SHOP LATEST\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"newarr.jsp#latest_release\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">New Drop</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"newarr.jsp#top_sell\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Best Selling</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\" >\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          ACCESSORIES\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
 
      out.write("          <a class=\"dropdown-item\" href=\"#shoes\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shoes</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#bags\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Bags</a>\r\n");
 
      out.write("          <a class=\"dropdown-item\" href=\"Accessories.jsp#shoes\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shoes</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Accessories.jsp#bags\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Bags</a>\r\n");
 
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">GIFT CARDS</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!--<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      \r\n");
      out.write("     <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>!-->\r\n");
      out.write("      <div class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            <!--<li class=\"nav-item\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("            </li>!-->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link disabled\" href=\"Login.jsp\"><box-icon name='user-circle'  color='#ffffff' ></box-icon></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link disabled\" href=\"#\"><box-icon name='cart-alt' color='#ffffff'></box-icon></a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img alt=\"\" src=\"img/mt2.jpeg\" style=\"width:253px; height: 350px;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p><b>T-SHIRTS</b></p>\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
 
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img alt=\"\" src=\"img/mt2.jpeg\" style=\"width:253px; height: 350px;\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>T-SHIRTS</b></p>\r\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
 
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img alt=\"\" src=\"img/mp1.jpeg\" style=\"width:253px; height: 350px;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p><b>PANTS</b></p>\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
 
      out.write("\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img alt=\"\" src=\"img/mp1.jpeg\" style=\"width:253px; height: 350px;\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>PANTS</b></p>\r\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
 
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img alt=\"\" src=\"img/ms1.jpeg\" style=\"width:253px; height: 350px;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p><b>SHORTS</b></p>\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
 
      out.write("\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img alt=\"\" src=\"img/ms1.jpeg\" style=\"width:253px; height: 350px;\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>SHORTS</b></p>\r\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
 
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
 
      out.write("\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img alt=\"\" src=\"img/mj1.jpeg\" style=\"width:253px; height: 350px;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <p><b>JACKETS</b></p>\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
 
      out.write("\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <img alt=\"\" src=\"img/mj1.jpeg\" style=\"width:253px; height: 350px;\">\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>JACKETS</b></p>\r\n");
      out.write("                        <a><button class=\"btn-cart\">SHOP NOW</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
 
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Footer Design</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"all_component/footer.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer\">\r\n");
      out.write("  \t <div class=\"container\">\r\n");
      out.write("  \t \t<div class=\"row\">\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>MENU</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">HOME</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">WOMENS</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">MENS</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">ACCESSORIES</a></li>\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>SHOP LATEST</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">NEW DROP</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">BEST SELLING</a></li>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>SUPPORT</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">ABOUT US</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">CONTACT US</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"#\">FAQ</a></li>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>follow us</h4>\r\n");
      out.write("  \t \t\t\t<div class=\"social-links\">\r\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("  \t \t\t\t\t<a href=\"#\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</div>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t</div>\r\n");
      out.write("  \t </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
