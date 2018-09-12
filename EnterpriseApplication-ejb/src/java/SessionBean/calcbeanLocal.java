package SessionBean;

import javax.ejb.Local;

@Local
public interface calcbeanLocal {

    Integer addition(int a, int b);

    Integer subtraction(int a, int b);

    Integer multiplication(int a, int b);

    Integer division(int a, int b);

}
