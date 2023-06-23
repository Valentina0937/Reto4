import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Figuras.Circulo;
import Figuras.Rectangulo;
import Figuras.Trapecio;
import Figuras.Triangulo;

public class servlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingreso al server");
        String control=req.getParameter("control");
        System.out.println("El control es "+control);
        switch(control){
        
            case "trapecio":
            req.getRequestDispatcher("opcionTra.jsp").forward(req, resp);
            break;

            case "triangulo":
            req.getRequestDispatcher("opcionTrian.jsp").forward(req, resp);
            break;

            case "rectangulo":
            req.getRequestDispatcher("opcionrect.jsp").forward(req, resp);
            break;

            case "circulo":
            req.getRequestDispatcher("opcioncir.jsp").forward(req, resp);
            break;

            case "areatrapecio":
            req.getRequestDispatcher("Trapecio.jsp").forward(req, resp);
            break;

            case "areatri":
            req.getRequestDispatcher("Triangulo.jsp").forward(req, resp);
            break;

            case "arearecta":
            req.getRequestDispatcher("Rectangulo.jsp").forward(req, resp);
            break;

            case "areacir":
            req.getRequestDispatcher("Circulo.jsp").forward(req, resp);
            break;

            case "perimetra":
            req.getRequestDispatcher("peritra.jsp").forward(req, resp);
            break;

            case "perimetri":
            req.getRequestDispatcher("peritri.jsp").forward(req, resp);
            break;

            case "perimerec":
            req.getRequestDispatcher("perirect.jsp").forward(req, resp);
            break;

            case "perimecir":
            req.getRequestDispatcher("pericir.jsp").forward(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Ingreso al server");
        String control=req.getParameter("control");
        System.out.println("El control es "+control);
        switch(control){
            case "areatri":
            double base=Double.parseDouble(req.getParameter("basemenor"));
            double altura=Double.parseDouble(req.getParameter("altura"));
            Triangulo tri=new Triangulo(base,altura);

            req.setAttribute("area", tri.calcularArea());
            System.out.println("El area es "+tri.calcularArea());
            req.setAttribute("perimetro", tri.calcularPerimetro());     
            req.getRequestDispatcher("area.jsp").forward(req, resp);
            break;
            
            case "areatra":
            double baseMayor=Double.parseDouble(req.getParameter("basemayor"));
            double baseMenor=Double.parseDouble(req.getParameter("basemenor"));
            double altura2=Double.parseDouble(req.getParameter("altura"));
            Trapecio tra=new Trapecio(baseMayor,baseMenor,altura2);

            req.setAttribute("area", tra.calcularArea());
            System.out.println("El área es: "+tra.calcularArea());
            req.getRequestDispatcher("area.jsp").forward(req, resp);
            break;


            case "arearect":
            double base2=Double.parseDouble(req.getParameter("base"));
            double altura3=Double.parseDouble(req.getParameter("altura"));
            Rectangulo rec=new Rectangulo(base2,altura3);

            req.setAttribute("area", rec.calcularArea());
            System.out.println("El area es "+rec.calcularArea());
            req.setAttribute("perimetro", rec.calcularPerimetro());
            req.getRequestDispatcher("area.jsp").forward(req, resp);

            break;

            case "areacir":
            double radio=Double.parseDouble(req.getParameter("radio"));
            Circulo cir=new Circulo(radio);

            req.setAttribute("area", cir.calcularArea());
            System.out.println("El area es "+cir.calcularArea());
            req.getRequestDispatcher("area.jsp").forward(req, resp);
            break;

            case "perimetra":
            double baseMayor2=Double.parseDouble(req.getParameter("basemayor"));
            double baseMenor2=Double.parseDouble(req.getParameter("basemenor"));
            double lado1=Double.parseDouble(req.getParameter("lado1"));
            double lado2=Double.parseDouble(req.getParameter("lado2"));
            Trapecio trap=new Trapecio(baseMayor2,baseMenor2,lado1,lado2);

            req.setAttribute("perimetro", trap.calcularPerimetro());
            System.out.println("El perimetro es: "+trap.calcularPerimetro());
            req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
            break;

            case "perimetri":
            double basep=Double.parseDouble(req.getParameter("base"));
            double ladop=Double.parseDouble(req.getParameter("lado1"));
            double ladop2=Double.parseDouble(req.getParameter("lado1"));
            Triangulo tria=new Triangulo(basep,ladop,ladop2);

           
            req.setAttribute("perimetro", tria.calcularPerimetro());     
            req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
            break;

            case "perimerec":
            double basepe=Double.parseDouble(req.getParameter("base"));
            double alturape=Double.parseDouble(req.getParameter("altura"));
            Rectangulo rect=new Rectangulo(basepe,alturape);

            req.setAttribute("perimetro", rect.calcularPerimetro());
            req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
            break;

            case "perimecir":
            double radioc=Double.parseDouble(req.getParameter("radio"));
            Circulo circ=new Circulo(radioc);

            req.setAttribute("perimetro", circ.calcularPerimetro());
            req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
            break;


    }
    
    }
    
}
