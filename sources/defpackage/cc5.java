package defpackage;

import java.util.ArrayList;

/* renamed from: cc5  reason: default package */
public final /* synthetic */ class cc5 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cc5(Object obj, long j, boolean z, int i) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = z;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                od5 od5 = (od5) this.d;
                ilc ilc = od5.a;
                ilc.c();
                try {
                    ArrayList c2 = od5.c();
                    boolean z = this.c;
                    long j = this.b;
                    if (!z) {
                        if (c2.remove(Long.valueOf(j))) {
                            od5.a(c2);
                        }
                    } else if (c2.indexOf(Long.valueOf(j)) == -1) {
                        c2.add(0, Long.valueOf(j));
                        od5.a(c2);
                    }
                    ilc.r();
                    return;
                } finally {
                    ilc.l();
                }
            default:
                fd5 fd5 = (fd5) this.d;
                ilc ilc2 = fd5.a;
                ilc2.c();
                try {
                    ArrayList c3 = fd5.c();
                    boolean z2 = this.c;
                    long j2 = this.b;
                    if (!z2) {
                        if (c3.remove(Long.valueOf(j2))) {
                            fd5.a(c3);
                        }
                    } else if (c3.indexOf(Long.valueOf(j2)) == -1) {
                        c3.add(0, Long.valueOf(j2));
                        fd5.a(c3);
                    }
                    ilc2.r();
                    return;
                } finally {
                    ilc2.l();
                }
        }
    }
}
