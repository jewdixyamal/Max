package org.apache.http.impl.io;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.params.HttpParams;

@Deprecated
public class SocketOutputBuffer extends AbstractSessionOutputBuffer {
    public SocketOutputBuffer(Socket socket, int i, HttpParams httpParams) throws IOException {
        if (socket != null) {
            init(socket.getOutputStream(), 8192, httpParams);
            return;
        }
        throw new IllegalArgumentException("Socket may not be null");
    }
}
