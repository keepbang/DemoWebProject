package com.bang.demo.openapi.url;

public enum OpenApiURL {
	
	SO_CITY_STATS("http://116.67.77.182/openapi/SOCitysStats");
	
	private final String name;
	
	private OpenApiURL(String s) {
		this.name = s;
	}

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
