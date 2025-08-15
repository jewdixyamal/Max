package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: qh3  reason: default package */
public final class qh3 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Serializable e;

    public qh3(String str, String str2, boolean z, boolean z2) {
        this.a = 1;
        this.d = str;
        this.b = z;
        this.c = z2;
        this.e = str2;
    }

    public rh3 a() {
        return new rh3(this.b, this.c, (String[]) this.d, (String[]) this.e);
    }

    public void b(u13... u13Arr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(u13Arr.length);
            for (u13 u13 : u13Arr) {
                arrayList.add(u13.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                c((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void c(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.d = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
    }

    public void d() {
        if (this.b) {
            this.c = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
    }

    public void e(awe... aweArr) {
        if (this.b) {
            ArrayList arrayList = new ArrayList(aweArr.length);
            for (awe awe : aweArr) {
                arrayList.add(awe.a);
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                f((String[]) Arrays.copyOf(strArr, strArr.length));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    /* JADX WARNING: type inference failed for: r3v7, types: [java.lang.String[], java.io.Serializable] */
    public void f(String... strArr) {
        if (this.b) {
            if (!(strArr.length == 0)) {
                Object clone = strArr.clone();
                if (clone != null) {
                    this.e = (String[]) clone;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder m = au1.m("CodecInfo{type=", (this.b ? "Video" : "Audio").concat(this.c ? "Decoder" : "Encoder"), ", configurationFormat=");
                m.append((String) this.d);
                m.append(", name=");
                return rh4.m(m, (String) this.e, '}');
            default:
                return super.toString();
        }
    }

    public qh3(int i) {
        this.a = i;
        switch (i) {
            case 2:
                return;
            default:
                this.b = true;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.String[], java.io.Serializable] */
    public qh3(rh3 rh3) {
        this.a = 0;
        this.b = rh3.a;
        this.d = rh3.c;
        this.e = rh3.d;
        this.c = rh3.b;
    }
}
