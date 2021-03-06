
package com.hcldex.cqmetrics.domain;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Component {

	@JsonIgnoreProperties(ignoreUnknown = true)
	   
    private String id;
    
    private String key;
   
    private String name;
    
    private String qualifier;
   
    private List<Measures> measures = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public List<Measures> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measures> measures) {
        this.measures = measures; 
    }

    

}
