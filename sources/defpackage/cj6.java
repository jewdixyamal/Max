package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* renamed from: cj6  reason: default package */
public final class cj6 implements Iterable, qb7 {
    public final String[] a;

    public cj6(String[] strArr) {
        this.a = strArr;
    }

    public final String a(String str) {
        String[] strArr = this.a;
        h37 X = ote.X(new h37(strArr.length - 2, 0, -1), 2);
        int i = X.a;
        int i2 = X.b;
        int i3 = X.c;
        if (i3 < 0 ? i >= i2 : i <= i2) {
            while (!eae.k0(str, strArr[i], true)) {
                if (i != i2) {
                    i += i3;
                }
            }
            return strArr[i + 1];
        }
        return null;
    }

    public final String b(int i) {
        return this.a[i * 2];
    }

    public final bj6 c() {
        bj6 bj6 = new bj6();
        d63.X(bj6.a, this.a);
        return bj6;
    }

    public final String d(int i) {
        return this.a[(i * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cj6) {
            if (Arrays.equals(this.a, ((cj6) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final Iterator iterator() {
        int size = size();
        kpa[] kpaArr = new kpa[size];
        for (int i = 0; i < size; i++) {
            kpaArr[i] = new kpa(b(i), d(i));
        }
        return new u1(2, kpaArr);
    }

    public final int size() {
        return this.a.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String b = b(i);
            String d = d(i);
            sb.append(b);
            sb.append(": ");
            if (naf.p(b)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
