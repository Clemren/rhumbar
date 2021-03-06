package builders;

import beans.Origin;
import beans.Rhum;
import org.json.*;
import servlets.origin.Servlet_Origin;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class OriginBuilder {
    private int id;
    private String name;
    private String description;
    private String countryAlpha2;
    private String countryName;

    public OriginBuilder withId(int id) {
        this.id = id;
        return this;
    }

    public OriginBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public OriginBuilder withCountryAlpha2(String countryAlpha2) {
        this.countryAlpha2 = countryAlpha2;
        return this;
    }

    public OriginBuilder withCountryName(String countryAlpha2) {




        return this;
    }

    public Origin build(){
        var origin = new Origin();
        origin.setPk(this.id);
        origin.setName(this.name);
        origin.setDescription(this.description);
        origin.setCountryAlpha2(this.countryAlpha2);
        origin.setCountryName(this.countryAlpha2);
        return origin;
    }

}
