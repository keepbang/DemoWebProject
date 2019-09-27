package com.bang.demo.openapi.key;

public enum OpenApiKey {
	DATA_API_KEY ("");

	
	private final String name;
	
	private OpenApiKey(String s) {
		this.name = s;
	}

    public boolean equalsName(String otherName) {
        return name.equals(otherName);
    }

    public String toString() {
       return this.name;
    }
}
