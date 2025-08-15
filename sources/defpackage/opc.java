package defpackage;

import java.util.ArrayList;

/* renamed from: opc  reason: default package */
public final class opc {
    public r5g a;
    public ArrayList b;

    public static long a(sh4 sh4, long j) {
        r5g r5g = sh4.d;
        if (r5g instanceof tj6) {
            return j;
        }
        ArrayList arrayList = sh4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            oh4 oh4 = (oh4) arrayList.get(i);
            if (oh4 instanceof sh4) {
                sh4 sh42 = (sh4) oh4;
                if (sh42.d != r5g) {
                    j2 = Math.min(j2, a(sh42, ((long) sh42.f) + j));
                }
            }
        }
        if (sh4 != r5g.i) {
            return j2;
        }
        long j3 = r5g.j();
        sh4 sh43 = r5g.h;
        long j4 = j - j3;
        return Math.min(Math.min(j2, a(sh43, j4)), j4 - ((long) sh43.f));
    }

    public static long b(sh4 sh4, long j) {
        r5g r5g = sh4.d;
        if (r5g instanceof tj6) {
            return j;
        }
        ArrayList arrayList = sh4.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            oh4 oh4 = (oh4) arrayList.get(i);
            if (oh4 instanceof sh4) {
                sh4 sh42 = (sh4) oh4;
                if (sh42.d != r5g) {
                    j2 = Math.max(j2, b(sh42, ((long) sh42.f) + j));
                }
            }
        }
        if (sh4 != r5g.h) {
            return j2;
        }
        long j3 = r5g.j();
        sh4 sh43 = r5g.i;
        long j4 = j + j3;
        return Math.max(Math.max(j2, b(sh43, j4)), j4 - ((long) sh43.f));
    }
}
