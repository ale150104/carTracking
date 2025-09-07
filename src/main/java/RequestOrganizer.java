public class RequestOrganizer {
    private  static RequestOrganizer instance;


    private RequestOrganizer(){}

    public static RequestOrganizer getRequestHandler()
    {
        if (instance ==  null){
            instance = new RequestOrganizer();
        }

        return instance;
    }


    void HandleRequest(String request)
    {

    }

}
