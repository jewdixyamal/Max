package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: xd  reason: default package */
public final class xd extends q2b {
    public static final boolean e;
    public final ArrayList c;
    public final vq7 d;

    static {
        boolean z = false;
        if (b46.p() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public xd() {
        de deVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            deVar = new de(cls);
        } catch (Exception e2) {
            q2b.a.getClass();
            q2b.i(5, "unable to load android socket classes", e2);
            deVar = null;
        }
        ArrayList d0 = ys.d0(new oud[]{deVar, new fg4(de.f), new fg4(fi3.a), new fg4(pr0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = d0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((oud) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", (Class[]) null);
            method = cls2.getMethod("open", new Class[]{String.class});
            method2 = cls2.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.d = new vq7(method3, method, method2, 4);
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

    public final c3f c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new wd(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
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

    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
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

    public final Object g() {
        vq7 vq7 = this.d;
        Method method = (Method) vq7.b;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, (Object[]) null);
            ((Method) vq7.c).invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    public final void j(Object obj, String str) {
        vq7 vq7 = this.d;
        vq7.getClass();
        if (obj != null) {
            try {
                ((Method) vq7.o).invoke(obj, (Object[]) null);
                return;
            } catch (Exception unused) {
            }
        }
        q2b.i(5, str, (Throwable) null);
    }
}
