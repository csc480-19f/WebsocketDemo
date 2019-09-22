import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/websocketendpoint")
public class WebsocketDemo {

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("onOpen");
    }
    @OnClose
    public void onClose(Session session) {
        System.out.println("onClose");
    }

    @OnMessage
    public String onMessage(String message, Session session) {

        System.out.println("Message from the client: " + message);
        String echoMsg = "\nEcho from the server : " + message;
        return echoMsg;
    }

    @OnError
    public void onError(Throwable t) {
        System.out.println("onError::");
    }


}
