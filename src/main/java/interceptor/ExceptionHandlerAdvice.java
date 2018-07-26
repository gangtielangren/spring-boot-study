package interceptor;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest request){
        System.out.println("get exception");
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMsg", e.getMessage());
        e.printStackTrace();
        return modelAndView;
    }
}
