package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: i14  reason: default package */
public final class i14 implements ok5 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final bdb i;
    public final fb8 j;
    public final Uri k;
    public final enb l;
    public final List m;

    public i14(long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, enb enb, bdb bdb, fb8 fb8, Uri uri, ArrayList arrayList) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = z;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.l = enb;
        this.i = bdb;
        this.k = uri;
        this.j = fb8;
        this.m = arrayList;
    }

    public final Object a(List list) {
        long j2;
        long j3;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new x8e(-1, -1, -1));
        ArrayList arrayList3 = new ArrayList();
        long j4 = 0;
        int i2 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i2 >= this.m.size()) {
                break;
            }
            if (((x8e) linkedList.peek()).a != i2) {
                long c2 = c(i2);
                if (c2 != -9223372036854775807L) {
                    j4 += c2;
                }
                j3 = j4;
                arrayList = arrayList3;
            } else {
                kta b2 = b(i2);
                List list2 = b2.c;
                x8e x8e = (x8e) linkedList.poll();
                int i3 = x8e.a;
                ArrayList arrayList4 = new ArrayList();
                while (true) {
                    int i4 = x8e.b;
                    u8 u8Var = (u8) list2.get(i4);
                    List list3 = u8Var.c;
                    ArrayList arrayList5 = new ArrayList();
                    do {
                        arrayList5.add((lhc) list3.get(x8e.c));
                        x8e = (x8e) linkedList.poll();
                        if (!(x8e.a == i3 && x8e.b == i4)) {
                            int i5 = u8Var.b;
                            List list4 = u8Var.d;
                            arrayList2 = arrayList3;
                            j3 = j4;
                            arrayList4.add(new u8(u8Var.a, i5, arrayList5, list4, u8Var.e, u8Var.f));
                        }
                        arrayList5.add((lhc) list3.get(x8e.c));
                        x8e = (x8e) linkedList.poll();
                        break;
                    } while (x8e.b == i4);
                    int i52 = u8Var.b;
                    List list42 = u8Var.d;
                    arrayList2 = arrayList3;
                    j3 = j4;
                    arrayList4.add(new u8(u8Var.a, i52, arrayList5, list42, u8Var.e, u8Var.f));
                    if (x8e.a != i3) {
                        break;
                    }
                    arrayList3 = arrayList2;
                    j4 = j3;
                }
                linkedList.addFirst(x8e);
                arrayList = arrayList2;
                arrayList.add(new kta(b2.a, b2.b - j3, arrayList4, b2.d));
            }
            i2++;
            arrayList3 = arrayList;
            j4 = j3;
        }
        long j5 = j4;
        ArrayList arrayList6 = arrayList3;
        long j6 = this.b;
        if (j6 != -9223372036854775807L) {
            j2 = j6 - j5;
        }
        i14 i14 = r4;
        i14 i142 = new i14(this.a, j2, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList6);
        return i14;
    }

    public final kta b(int i2) {
        return (kta) this.m.get(i2);
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
            j3 = ((kta) list.get(i2)).b;
        } else {
            j2 = ((kta) list.get(i2 + 1)).b;
            j3 = ((kta) list.get(i2)).b;
        }
        return j2 - j3;
    }

    public final long d(int i2) {
        return oaf.S(c(i2));
    }
}
