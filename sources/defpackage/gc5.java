package defpackage;

import java.util.ArrayList;

/* renamed from: gc5  reason: default package */
public final /* synthetic */ class gc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gc5(Object obj, long j, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = j;
        this.c = i;
    }

    public final void run() {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                long j = this.b;
                od5 od5 = (od5) this.d;
                ilc ilc = od5.a;
                ilc.c();
                try {
                    ArrayList c2 = od5.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    if (indexOf >= 0 && (i = this.c) >= 0) {
                        if (i < c2.size()) {
                            Object obj = c2.get(indexOf);
                            c2.remove(indexOf);
                            c2.add(i, obj);
                            od5.a(c2);
                        }
                    }
                    ilc.r();
                    return;
                } finally {
                    ilc.l();
                }
            default:
                long j2 = this.b;
                fd5 fd5 = (fd5) this.d;
                ilc ilc2 = fd5.a;
                ilc2.c();
                try {
                    ArrayList c3 = fd5.c();
                    int indexOf2 = c3.indexOf(Long.valueOf(j2));
                    if (indexOf2 >= 0 && (i2 = this.c) >= 0) {
                        if (i2 < c3.size()) {
                            Object obj2 = c3.get(indexOf2);
                            c3.remove(indexOf2);
                            c3.add(i2, obj2);
                            fd5.a(c3);
                        }
                    }
                    ilc2.r();
                    return;
                } finally {
                    ilc2.l();
                }
        }
    }
}
