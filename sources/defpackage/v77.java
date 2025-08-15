package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: v77  reason: default package */
public final class v77 extends q2b {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public v77(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        } catch (InvocationTargetException e3) {
            throw new AssertionError("failed to remove ALPN", e3);
        }
    }

    public final void d(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((sob) next) != sob.HTTP_1_0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((sob) it.next()).a);
        }
        try {
            this.c.invoke((Object) null, new Object[]{sSLSocket, Proxy.newProxyInstance(q2b.class.getClassLoader(), new Class[]{this.f, this.g}, new u77(arrayList2))});
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to set ALPN", e3);
        }
    }

    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke((Object) null, new Object[]{sSLSocket}));
            if (invocationHandler != null) {
                u77 u77 = (u77) invocationHandler;
                boolean z = u77.a;
                if (!z && u77.b == null) {
                    q2b.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                    return null;
                } else if (z) {
                    return null;
                } else {
                    return u77.b;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        } catch (IllegalAccessException e3) {
            throw new AssertionError("failed to get ALPN selected protocol", e3);
        }
    }
}
