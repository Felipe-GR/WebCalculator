package SessionBean;

import javax.ejb.Stateless;

@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer addition(int a, int b) {
        return (a + b);
    }

    @Override
    public Integer subtraction(int a, int b) {
        return (a - b);
    }

    @Override
    public Integer multiplication(int a, int b) {
        return (a * b);
    }

    @Override
    public Integer division(int a, int b) {
        return (a / b);
    }

}
