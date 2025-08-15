package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: hd  reason: default package */
public final class hd extends q2b {
    public static final boolean d = b46.p();
    public final ArrayList c;

    public hd() {
        ArrayList d0 = ys.d0(new oud[]{b46.p() ? new Object() : null, new fg4(de.f), new fg4(fi3.a), new fg4(pr0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = d0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((oud) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
    }

    public final a14 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        jd jdVar = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            jdVar = new jd(x509TrustManager, x509TrustManagerExtensions);
        }
        return jdVar != null ? jdVar : super.b(x509TrustManager);
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oud) obj).b(sSLSocket)) {
                break;
            }
        }
        oud oud = (oud) obj;
        if (oud != null) {
            oud.d(sSLSocket, str, list);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((oud) obj).b(sSLSocket)) {
                break;
            }
        }
        oud oud = (oud) obj;
        if (oud != null) {
            return oud.c(sSLSocket);
        }
        return null;
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
