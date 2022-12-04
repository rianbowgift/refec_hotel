package service;

import entity.Customer;

public interface LoginService {
    public int customerSignInOrAdminSignIn(String id, String password);
    public void SignUp(String id,String password,String name,String number);
    public void findCustomerInformation();
}
