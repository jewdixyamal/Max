package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: ei3  reason: default package */
public final class ei3 implements eg4 {
    public final boolean b(SSLSocket sSLSocket) {
        boolean z = di3.d;
        return bi3.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, oud] */
    public final oud l(SSLSocket sSLSocket) {
        return new Object();
    }
}
