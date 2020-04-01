package it.sauronsoftware.ftp4j.connectors;

import it.sauronsoftware.ftp4j.FTPConnector;
import java.io.IOException;
import java.net.Socket;

public class DirectConnector extends FTPConnector {
    public DirectConnector() {
    }

    public Socket connectForCommunicationChannel(String host, int port) throws IOException {
        return this.tcpConnectForCommunicationChannel(host, port);
    }

    public Socket connectForDataTransferChannel(String host, int port) throws IOException {
        return this.tcpConnectForDataTransferChannel(host, port);
    }
}
