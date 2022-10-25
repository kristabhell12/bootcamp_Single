package dependencyinjection;

public class CustomerBusinessLogic {
    public CustomerBusinessLogic()
    {
    }

    public String GetCustomerName(int id)
    {
        DataAccess dataAccess = DataAccessFactory.GetDataAccessObj();

        return dataAccess.GetCustomerName(id);
    }
}
