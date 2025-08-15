package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: fg4  reason: default package */
public final class fg4 implements oud {
    public oud a;
    public final eg4 b;

    public fg4(eg4 eg4) {
        this.b = eg4;
    }

    public final boolean a() {
        return true;
    }

    public final boolean b(SSLSocket sSLSocket) {
        return this.b.b(sSLSocket);
    }

    public final String c(SSLSocket sSLSocket) {
        oud e = e(sSLSocket);
        if (e != null) {
            return e.c(sSLSocket);
        }
        return null;
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        oud e = e(sSLSocket);
        if (e != null) {
            e.d(sSLSocket, str, list);
        }
    }

    public final synchronized oud e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.b(sSLSocket)) {
                this.a = this.b.l(sSLSocket);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return this.a;
    }
}
