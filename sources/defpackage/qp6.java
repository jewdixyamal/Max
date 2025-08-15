package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: qp6  reason: default package */
public final class qp6 extends wx {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ qp6(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    public IOException k(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
            default:
                return super.k(iOException);
        }
    }

    public final void l() {
        switch (this.k) {
            case 0:
                ((rp6) this.l).e(9);
                kp6 kp6 = ((rp6) this.l).n;
                synchronized (kp6) {
                    long j = kp6.A0;
                    long j2 = kp6.z0;
                    if (j >= j2) {
                        kp6.z0 = j2 + 1;
                        kp6.B0 = System.nanoTime() + ((long) 1000000000);
                        kp6.t0.c(new ip6(zr6.l(new StringBuilder(), kp6.o, " ping"), kp6), 0);
                        return;
                    }
                    return;
                }
            case 1:
                ((b8c) this.l).d();
                return;
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (Exception e) {
                    Logger logger = x2a.a;
                    Level level = Level.WARNING;
                    logger.log(level, "Failed to close timed out socket " + socket, e);
                    return;
                } catch (AssertionError e2) {
                    Logger logger2 = x2a.a;
                    boolean z = false;
                    if (e2.getCause() != null) {
                        String message = e2.getMessage();
                        if (message != null ? w9e.p0(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (z) {
                        Logger logger3 = x2a.a;
                        Level level2 = Level.WARNING;
                        logger3.log(level2, "Failed to close timed out socket " + socket, e2);
                        return;
                    }
                    throw e2;
                }
        }
    }

    public void m() {
        if (j()) {
            throw k((IOException) null);
        }
    }
}
