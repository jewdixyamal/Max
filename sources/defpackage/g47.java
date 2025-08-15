package defpackage;

import android.net.TrafficStats;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: g47  reason: default package */
public final class g47 {
    public static final khe c = new khe(new fh5(23));
    public final zwd a;
    public final String b = g47.class.getName();

    public g47(zwd zwd) {
        this.a = zwd;
    }

    public final void a(Socket socket) {
        String str = this.b;
        try {
            TrafficStats.untagSocket(socket);
        } catch (Exception e) {
            hm9.p(str, "error occuried while untag stat for " + socket, e);
        }
        if (!socket.isClosed()) {
            try {
                socket.close();
            } catch (IOException e2) {
                hm9.p(str, "failed to close " + socket, e2);
            }
        }
    }

    public final void b(Socket socket) {
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        String str = this.b;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.o, str, "sendRequest, OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n ...", (Throwable) null);
        }
        Charset charset = a52.a;
        outputStream.write("OPTIONS /generate_204 HTTP/1.1\r\nHost: gstatic.com:443\r\nUser-Agent: WebClient\r\nAccept: */*\r\nConnection: close\r\n\r\n".getBytes(charset));
        outputStream.flush();
        byte[] bytes = "\r\n\r\n".getBytes(charset);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        do {
            int read = inputStream.read();
            if (read != -1) {
                byteArrayOutputStream.write(read);
                i2 = read == bytes[i2] ? i2 + 1 : 0;
            } else {
                throw new IOException("Unexpected error in header");
            }
        } while (i2 != bytes.length);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byte[] bArr = (byte[]) c.getValue();
        int length = byteArray.length - bArr.length;
        if (length >= 0) {
            while (true) {
                if (!Arrays.equals(bArr, ys.Z(i, byteArray, bArr.length + i))) {
                    if (i == length) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        i = -1;
        if (i == -1) {
            String str2 = new String(byteArray, a52.a);
            if (!eae.o0(str2, "HTTP/1.1 204 No Content", true)) {
                throw new IOException("Invalid reply header=".concat(str2));
            }
        }
        String str3 = this.b;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            ir62.d(us7.o, str3, "process, looks like the gstatic.com is reachable", (Throwable) null);
        }
    }
}
