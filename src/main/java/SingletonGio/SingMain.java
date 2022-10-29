package SingletonGio;

public class SingMain {
    public class main {
        public static void main(String[] args){
            mysqlClient MysqlClient = mysqlClient.getSing();
            MysqlClient.con();
            mysqlClient MysqlClient2 = mysqlClient.getSing();
            MysqlClient2.con();
            mysqlClient MysqlClient3 = mysqlClient.getSing();
            MysqlClient3.con();





        }
    }
}
