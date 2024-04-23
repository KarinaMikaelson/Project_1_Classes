package org.example.WrapperClass;

public class E2 {
    public static void main(String[] args) {
         /*
    Wrapper Class:
               1. Provides a way to use primitive data types as reference data types
                  reference data types contain useful methods can be used with collections (ex.ArrayList)
                  (each Primitive has Wrapper)

                Primitive:           Wrapper:
               ------------         ----------
                byte                 Byte
                short                Short
                long                 Long
                float                Float
                boolean              Boolean
                char                 Character
                int                  Integer
                double               Double

                - Primitive - are a lot faster

                2. Autoboxing - the automatic conversion that Java compiler makes between the primitive
                   types and their corresponding object Wrapper class.

                3. Unboxing - is getting a primitive value from objects. the reverse of autoboxing.
                   Automatic conversion of wrapper class to Primitive.
     */
        // Wrapper classes , Objects and their methods
        Boolean a = true;
        Character c = '@';
        Integer i = 123;
        Double d = 3.14;
        String e = "Bro";
        a.booleanValue();
        c.charValue();
        i.toString();
        d.intValue();
        e.length();
    }
}

