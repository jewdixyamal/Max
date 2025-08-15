package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: h14  reason: default package */
public final class h14 implements nk5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final m94 i;
    public final fb8 j;
    public final Uri k;
    public final dnb l;
    public final List m;

    public h14(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, dnb dnb, m94 m94, fb8 fb8, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = dnb;
        this.i = m94;
        this.k = uri;
        this.j = fb8;
        this.m = arrayList;
    }

    public final Object a(List list) {
        h14 h14 = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new w8e());
        ArrayList arrayList = new ArrayList();
        long j2 = 0;
        int i2 = 0;
        while (i2 < h14.m.size()) {
            if (((w8e) linkedList.peek()).a != i2) {
                long c2 = h14.c(i2);
                if (c2 != -9223372036854775807L) {
                    j2 += c2;
                }
            } else {
                jta b2 = h14.b(i2);
                List list2 = b2.c;
                w8e w8e = (w8e) linkedList.poll();
                int i3 = w8e.a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i4 = w8e.b;
                    t8 t8Var = (t8) list2.get(i4);
                    List list3 = t8Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add((khc) list3.get(w8e.c));
                        w8e = (w8e) linkedList.poll();
                        if (!(w8e.a == i3 && w8e.b == i4)) {
                            List list4 = list2;
                            arrayList2.add(new t8(t8Var.a, t8Var.b, arrayList3, t8Var.d, t8Var.e, t8Var.f));
                        }
                        arrayList3.add((khc) list3.get(w8e.c));
                        w8e = (w8e) linkedList.poll();
                        break;
                    } while (w8e.b == i4);
                    List list42 = list2;
                    arrayList2.add(new t8(t8Var.a, t8Var.b, arrayList3, t8Var.d, t8Var.e, t8Var.f));
                    if (w8e.a != i3) {
                        break;
                    }
                    list2 = list42;
                }
                linkedList.addFirst(w8e);
                arrayList.add(new jta(b2.a, b2.b - j2, arrayList2, b2.d));
            }
            i2++;
            h14 = this;
        }
        long j3 = h14.b;
        return new h14(h14.a, j3 != -9223372036854775807L ? j3 - j2 : -9223372036854775807L, h14.c, h14.d, h14.e, h14.f, h14.g, h14.h, h14.l, h14.i, h14.j, h14.k, arrayList);
    }

    public final jta b(int i2) {
        return (jta) this.m.get(i2);
    }

    public final long c(int i2) {
        long j2;
        long j3;
        List list = this.m;
        if (i2 == list.size() - 1) {
            j2 = this.b;
            if (j2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j3 = ((jta) list.get(i2)).b;
        } else {
            j2 = ((jta) list.get(i2 + 1)).b;
            j3 = ((jta) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return maf.D(c(i2));
    }
}
