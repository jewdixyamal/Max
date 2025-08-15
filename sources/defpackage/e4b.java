package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.TreeMap;

/* renamed from: e4b  reason: default package */
public final class e4b implements Handler.Callback {
    public boolean X;
    public boolean Y;
    public final Object Z;
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final TreeMap c;
    public boolean o;
    public final Object s0;
    public final Object t0;
    public Object u0;

    public e4b(h14 h14, wmc wmc, n64 n64) {
        this.u0 = h14;
        this.s0 = wmc;
        this.Z = n64;
        this.c = new TreeMap();
        this.b = maf.m(this);
        this.t0 = new wo(1);
    }

    public d4b a() {
        return new d4b(this, (n64) this.Z);
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (this.Y) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                a4b a4b = (a4b) message.obj;
                long j = a4b.a;
                TreeMap treeMap = this.c;
                long j2 = a4b.b;
                Long l = (Long) treeMap.get(Long.valueOf(j2));
                if (l == null) {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                } else if (l.longValue() <= j) {
                    return true;
                } else {
                    treeMap.put(Long.valueOf(j2), Long.valueOf(j));
                    return true;
                }
            default:
                if (this.Y) {
                    return true;
                }
                if (message.what != 1) {
                    return false;
                }
                b4b b4b = (b4b) message.obj;
                long j3 = b4b.a;
                TreeMap treeMap2 = this.c;
                long j4 = b4b.b;
                Long l2 = (Long) treeMap2.get(Long.valueOf(j4));
                if (l2 == null) {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                } else if (l2.longValue() <= j3) {
                    return true;
                } else {
                    treeMap2.put(Long.valueOf(j4), Long.valueOf(j3));
                    return true;
                }
        }
    }

    public e4b(i14 i14, ey1 ey1, n64 n64) {
        this.u0 = i14;
        this.s0 = ey1;
        this.Z = n64;
        this.c = new TreeMap();
        this.b = oaf.o(this);
        this.t0 = new xo(1);
    }
}
