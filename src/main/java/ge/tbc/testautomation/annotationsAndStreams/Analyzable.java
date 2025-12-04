package ge.tbc.testautomation.annotationsAndStreams;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Analyzable {
    @VariableNameAnnotation(name = "Str1")
    public String  str1 = "string1";

    @VariableNameAnnotation(name = "Str2")
    public String  str2 = "string2";

    @VariableNameAnnotation(name = "Int1")
    public Integer int1 = 1;

    @VariableNameAnnotation(name = "Int2")
    public Integer int2 = 2;

    @VariableNameAnnotation(name = "Long1")
    public Long long1 = 2L;

    @VariableNameAnnotation(name = "Long2")
    public Long long2 = 3L;

    @VariableNameAnnotation(name = "Bool1")
    public boolean bool1 = true;

    @VariableNameAnnotation(name = "Bool2")
    public boolean bool2 = false;

    @VariableNameAnnotation()
    public String  str3 = "string3";

    @VariableNameAnnotation(name = "Integer3")
    public Integer int3 = 3;

    public static void main(String[] args) {
        // Creating an array of field names
        Field[] fields = Analyzable.class.getDeclaredFields();

        // Creating a list of fields matching their annotation names
        List<Field> listWithMatchingNames = Arrays.stream(fields).filter(field ->
                field.getName().equals(field.getAnnotation(VariableNameAnnotation.class).name().toLowerCase())
        ).toList();
        for (Field field : listWithMatchingNames) {
            System.out.println("Fields with matching field names: " + field.getName());
        }

        // Creating a list of fields that do not match their annotation names
        List<Field> listWithoutMatchingNames = Arrays.stream(fields).filter(field ->
                !field.getName().equals(field.getAnnotation(VariableNameAnnotation.class).name().toLowerCase())
        ).toList();
        for (Field field : listWithoutMatchingNames) {
            System.out.println("Fields without matching names: " + field.getName());
        }

        @SuppressWarnings("unused")
        String unusedString = "unused";

        @SuppressWarnings("unused")
        Integer unusedInteger = 5;

    }
}
