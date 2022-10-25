package dependencyinjection;

public class DataAccessFactory {
    public static DataAccess GetDataAccessObj()
    {
        return new DataAccess();
    }
}
