package com.qait.framework.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import org.yaml.snakeyaml.Yaml;
import java.io.Reader;
import java.util.Map;

public class YamlReader {

	private static String yamlFilePath = " ";
	
	public static String getFilePath() {
		yamlFilePath = "src/test/resources/loginInfo/application.yaml";
		
		return yamlFilePath;
	}
	
	public static String getYamlvalue(String val) throws FileNotFoundException {
		return getValue(val);
	}
	
    private static String getValue(String token) throws FileNotFoundException {
        Reader doc = new FileReader(yamlFilePath);
        Yaml yaml = new Yaml();
        Map<String, Object> object = (Map<String, Object>) yaml.load(doc);
        return getMapValue(object, token);

    }

    private static String getMapValue(Map<String, Object> object, String token) {
        String[] st = token.split("\\.");
        return parseMap(object, token).get(st[st.length - 1]).toString();
    }
    
    private static Map<String, Object> parseMap(Map<String, Object> object, String token) {
        if (token.contains(".")) {
            String[] st = token.split("\\.");
            object = parseMap((Map<String, Object>) object.get(st[0]), token.replace(st[0] + ".", ""));
        }
        return object;
    }
}
