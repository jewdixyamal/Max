package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: hw6  reason: default package */
public final class hw6 extends n1 implements rx6, uaf, Iterable {
    public static final hw6 b = new hw6(new uaf[0]);
    public final uaf[] a;

    public hw6(uaf[] uafArr) {
        this.a = uafArr;
    }

    public final String a() {
        uaf[] uafArr = this.a;
        if (uafArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(uafArr[0].a());
        for (int i = 1; i < uafArr.length; i++) {
            sb.append(",");
            sb.append(uafArr[i].a());
        }
        sb.append("]");
        return sb.toString();
    }

    public final hw6 c() {
        return this;
    }

    public final int e() {
        return 7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uaf = (uaf) obj;
        boolean z = uaf instanceof hw6;
        uaf[] uafArr = this.a;
        if (z) {
            return Arrays.equals(uafArr, ((hw6) uaf).a);
        }
        int e = ((n1) uaf).e();
        if (e == 0) {
            throw null;
        } else if (e != 7) {
            return false;
        } else {
            hw6 c = uaf.c();
            if (uafArr.length != c.a.length) {
                return false;
            }
            Iterator it = c.iterator();
            for (uaf equals : uafArr) {
                gw6 gw6 = (gw6) it;
                if (!gw6.hasNext() || !equals.equals(gw6.next())) {
                    return false;
                }
            }
            return true;
        }
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            uaf[] uafArr = this.a;
            if (i2 >= uafArr.length) {
                return i;
            }
            i = (i * 31) + uafArr[i2].hashCode();
            i2++;
        }
    }

    public final Iterator iterator() {
        return new gw6(this.a, 0);
    }

    public final hw6 r() {
        return this;
    }

    public final String toString() {
        uaf[] uafArr = this.a;
        if (uafArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        uaf uaf = uafArr[0];
        if (h4f.g(((n1) uaf).e())) {
            sb.append(uaf.a());
        } else {
            sb.append(uaf.toString());
        }
        for (int i = 1; i < uafArr.length; i++) {
            sb.append(",");
            uaf uaf2 = uafArr[i];
            if (h4f.g(((n1) uaf2).e())) {
                sb.append(uaf2.a());
            } else {
                sb.append(uaf2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
