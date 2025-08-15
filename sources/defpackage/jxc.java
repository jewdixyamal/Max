package defpackage;

import android.net.Uri;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: jxc  reason: default package */
public final class jxc {
    public static final jxc c;
    public final wk a;
    public final eqd b;

    static {
        jxc jxc = new jxc(eqd.d, wk.f);
        c = jxc;
        jxc.d(Uri.parse("https://api.odnoklassniki.ru"));
    }

    public jxc(eqd eqd, wk wkVar) {
        this.b = eqd;
        this.a = wkVar;
    }

    public final Uri a() {
        eqd eqd = this.b;
        int binarySearch = Arrays.binarySearch(eqd.a, "api");
        return (Uri) (binarySearch < 0 ? null : eqd.b[binarySearch]);
    }

    public final jxc b(String str) {
        wk wkVar = this.a;
        if (Objects.equals(str, wkVar.a)) {
            return this;
        }
        String str2 = wkVar.d;
        if (str2 != null) {
            throw new IllegalStateException("Some session key");
        } else if (wkVar.c == null) {
            if (!str.equals(wkVar.a)) {
                wkVar = new wk(str, str2, wkVar.e);
            }
            return new jxc(this.b, wkVar);
        } else {
            throw new IllegalStateException("Some auth token");
        }
    }

    public final jxc c(String str, String str2) {
        wk wkVar = this.a;
        boolean equals = Objects.equals(str, wkVar.d);
        String str3 = wkVar.e;
        if (equals && Objects.equals(str2, str3)) {
            return this;
        }
        String str4 = wkVar.a;
        if (str4 != null) {
            if (!str.equals(wkVar.d) || !str2.equals(str3)) {
                wkVar = new wk(str4, str, str2);
            }
            return new jxc(this.b, wkVar);
        }
        throw new IllegalStateException("No app key");
    }

    public final jxc d(Uri uri) {
        eqd eqd;
        eqd eqd2 = this.b;
        Comparable[] comparableArr = eqd2.a;
        int binarySearch = Arrays.binarySearch(comparableArr, "api");
        Object[] objArr = eqd2.b;
        if (binarySearch < 0) {
            int i = -binarySearch;
            int i2 = i - 1;
            Class<?> componentType = comparableArr.getClass().getComponentType();
            int i3 = eqd2.c + 1;
            Comparable[] comparableArr2 = (Comparable[]) Array.newInstance(componentType, i3);
            Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i3);
            System.arraycopy(comparableArr, 0, comparableArr2, 0, i2);
            comparableArr2[i2] = "api";
            System.arraycopy(comparableArr, i2, comparableArr2, i, comparableArr.length - i2);
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            objArr2[i2] = uri;
            System.arraycopy(objArr, i2, objArr2, i, objArr.length - i2);
            eqd = new eqd(comparableArr2, objArr2);
        } else if (Objects.equals(objArr[binarySearch], uri)) {
            eqd = eqd2;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[binarySearch] = uri;
            eqd = new eqd(comparableArr, copyOf);
        }
        return eqd == eqd2 ? this : new jxc(eqd, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jxc.class != obj.getClass()) {
            return false;
        }
        jxc jxc = (jxc) obj;
        return this.a.equals(jxc.a) && this.b.equals(jxc.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SdkApiConfig{apiConfig=" + this.a + ", uris=" + this.b + '}';
    }
}
