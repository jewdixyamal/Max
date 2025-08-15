package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: rh3  reason: default package */
public final class rh3 {
    public static final rh3 e;
    public static final rh3 f = new rh3(false, false, (String[]) null, (String[]) null);
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        u13 u13 = u13.q;
        u13 u132 = u13.r;
        u13 u133 = u13.s;
        u13 u134 = u13.k;
        u13 u135 = u13.m;
        u13 u136 = u13.l;
        u13 u137 = u13.n;
        u13 u138 = u13.p;
        u13 u139 = u13.o;
        u13 u1310 = u13;
        u13 u1311 = u132;
        u13 u1312 = u133;
        u13 u1313 = u134;
        u13 u1314 = u135;
        u13 u1315 = u136;
        u13 u1316 = u137;
        u13 u1317 = u138;
        u13[] u13Arr = {u1310, u1311, u1312, u1313, u1314, u1315, u1316, u1317, u139, u13.i, u13.j, u13.g, u13.h, u13.e, u13.f, u13.d};
        qh3 qh3 = new qh3(0);
        qh3.b((u13[]) Arrays.copyOf(new u13[]{u1310, u1311, u1312, u1313, u1314, u1315, u1316, u1317, u139}, 9));
        awe awe = awe.TLS_1_3;
        awe awe2 = awe.TLS_1_2;
        qh3.e(awe, awe2);
        qh3.d();
        qh3.a();
        qh3 qh32 = new qh3(0);
        qh32.b((u13[]) Arrays.copyOf(u13Arr, 16));
        qh32.e(awe, awe2);
        qh32.d();
        e = qh32.a();
        qh3 qh33 = new qh3(0);
        qh33.b((u13[]) Arrays.copyOf(u13Arr, 16));
        qh33.e(awe, awe2, awe.TLS_1_1, awe.TLS_1_0);
        qh33.d();
        qh33.a();
    }

    public rh3(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final List a() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String i : strArr) {
            arrayList.add(u13.t.i(i));
        }
        return x53.D0(arrayList);
    }

    public final boolean b(SSLSocket sSLSocket) {
        if (!this.a) {
            return false;
        }
        String[] strArr = this.d;
        if (strArr != null && !naf.i(strArr, sSLSocket.getEnabledProtocols(), rm9.b)) {
            return false;
        }
        String[] strArr2 = this.c;
        return strArr2 == null || naf.i(strArr2, sSLSocket.getEnabledCipherSuites(), u13.b);
    }

    public final List c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String w : strArr) {
            arrayList.add(z04.w(w));
        }
        return x53.D0(arrayList);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rh3)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        rh3 rh3 = (rh3) obj;
        boolean z = rh3.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        return !z2 || (Arrays.equals(this.c, rh3.c) && Arrays.equals(this.d, rh3.d) && this.b == rh3.b);
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        int i = 0;
        String[] strArr = this.c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            i = Arrays.hashCode(strArr2);
        }
        return ((hashCode + i) * 31) + (this.b ^ true ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
