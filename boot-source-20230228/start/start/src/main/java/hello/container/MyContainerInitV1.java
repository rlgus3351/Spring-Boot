package hello.container;

import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

import java.util.Set;

/**
 * packageName : hello.container
 * fileName : MyContainerInitV1
 * author : user
 * date : 24. 10. 26.
 * description:
 * =====================================================================================
 * DATE                    AUTHOR                            NOTE
 * =====================================================================================
 * 24. 10. 26.                    user                            최초 생성
 */
public class MyContainerInitV1 implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("MyContainerInitv1.onStartUP");
        System.out.println("MyContainerInitv1 set = " + set);
        System.out.println("MyContainerInitv1 servletContext = " + servletContext);
    }
}
