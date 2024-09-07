package Other.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//Например, чтобы указать, что аннотация применяется только к классам, используется аннотация @Target(ElementType.TYPE)
@Target(ElementType.TYPE)
//А мета-аннотация @Retention(RetentionPolicy.RUNTIME) указывает, что аннотация должна быть доступна в рантайме.
@Retention(RetentionPolicy.RUNTIME)

public @interface Company {
    String name() default "ABC";
    String city() default "XYZ";
}
