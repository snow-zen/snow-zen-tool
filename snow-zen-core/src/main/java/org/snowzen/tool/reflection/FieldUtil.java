package org.snowzen.tool.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * 通过反射获取类的成员变量信息工具
 *
 * @author sobre
 * @date 2020/3/5
 */
public class FieldUtil {

    /**
     * 通过调用{@link Class#getDeclaredFields()}解析类的所有成员变量名称
     *
     * @param clazz 解析类的{@link Class}
     * @return 解析的名称列表
     */
    public static List<String> getFieldNames(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();

        List<String> names = new ArrayList<>();

        for (Field field : fields) {
            String name = field.getName();
            if (name.startsWith("this$")) {
                continue;
            }
            names.add(name);
        }

        return names;
    }

}
