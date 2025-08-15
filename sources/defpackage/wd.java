package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* renamed from: wd  reason: default package */
public final class wd implements c3f {
    public final X509TrustManager a;
    public final Method b;

    public wd(X509TrustManager x509TrustManager, Method method) {
        this.a = x509TrustManager;
        this.b = method;
    }

    public final X509Certificate a(X509Certificate x509Certificate) {
        try {
            Object invoke = this.b.invoke(this.a, new Object[]{x509Certificate});
            if (invoke != null) {
                return ((TrustAnchor) invoke).getTrustedCert();
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd)) {
            return false;
        }
        wd wdVar = (wd) obj;
        return tpa.f(this.a, wdVar.a) && tpa.f(this.b, wdVar.b);
    }

    public final int hashCode() {
        int i = 0;
        X509TrustManager x509TrustManager = this.a;
        int hashCode = (x509TrustManager != null ? x509TrustManager.hashCode() : 0) * 31;
        Method method = this.b;
        if (method != null) {
            i = method.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + ")";
    }
}
