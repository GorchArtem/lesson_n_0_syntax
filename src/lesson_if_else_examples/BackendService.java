package lesson_if_else_examples;

public class BackendService {

    public static void checkRequest(int statusCode) {
        switch (statusCode) {
            case 200:
                System.out.println("OK");
                break;
                case 300:
                    System.out.println("redirect");
                    break;
                    case 400:
                        System.out.println("Clients Bad Request");
                        break;
                        case 500:
                            System.out.println("Server Error");
                            break;
            default:
                    System.out.println("Unknown Error");
        }
    }
}
