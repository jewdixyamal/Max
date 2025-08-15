package defpackage;

import java.util.ArrayList;

/* renamed from: dl3  reason: default package */
public final /* synthetic */ class dl3 implements f6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ dl3(int i, long j, long j2, Object obj) {
        this.a = i;
        this.d = obj;
        this.b = j;
        this.c = j2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                el3 el3 = (el3) this.d;
                el3.getClass();
                el3.c(this.b, new c10(this.c, 12));
                return;
            default:
                long j = this.b;
                long j2 = this.c;
                fd5 fd5 = (fd5) this.d;
                ilc ilc = fd5.a;
                ilc.c();
                try {
                    ArrayList c2 = fd5.c();
                    int indexOf = c2.indexOf(Long.valueOf(j));
                    int indexOf2 = c2.indexOf(Long.valueOf(j2));
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        Object obj = c2.get(indexOf);
                        c2.remove(indexOf);
                        c2.add(indexOf2, obj);
                        fd5.a(c2);
                    }
                    ilc.r();
                    return;
                } finally {
                    ilc.l();
                }
        }
    }
}
