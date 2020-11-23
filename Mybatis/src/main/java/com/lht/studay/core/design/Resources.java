package com.lht.studay.core.design;

import javax.annotation.Resource;
import java.io.InputStream;

public class Resources {
    public static InputStream getResourceAsStream(String filePath) {
        return Resources.class.getClassLoader().getResourceAsStream(filePath);
    }
}
