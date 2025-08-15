package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: of9  reason: default package */
public final class of9 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;

    public of9(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710) {
        this.a = je7;
        this.b = je72;
        this.c = je73;
        this.d = je74;
        this.e = je75;
        this.f = je76;
        this.g = je77;
        this.h = je78;
        this.i = je79;
        this.j = je710;
    }

    /* JADX WARNING: type inference failed for: r12v5, types: [one, java.lang.Object] */
    public final void a(long j2, long j3, fs8 fs8) {
        long j4 = fs8.Y;
        vlc vlc = ((k24) ((au8) this.a.getValue()).a).c;
        ru8 h2 = vlc.d().h(j2, j4);
        cu8 cu8 = null;
        cu8 b2 = h2 != null ? vlc.b(h2) : null;
        if (b2 == null) {
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Z, "MsgSendLogic", zr6.k(au1.k(fs8.Y, "message cid=", " for chatId="), j2, " not found!"), (Throwable) null);
                return;
            }
            return;
        }
        if (b2.c == 0) {
            vlc vlc2 = ((k24) ((c34) this.b.getValue())).c;
            oz7 oz7 = iu8.b;
            vlc2.o(fs8, j2, false, (vx8) null);
            ((au8) this.a.getValue()).w(b2, iz7.g(fs8.s0, (vxc) this.c.getValue()));
            long j5 = fs8.Y;
            vlc vlc3 = ((k24) ((au8) this.a.getValue()).a).c;
            ru8 h3 = vlc3.d().h(j2, j5);
            if (h3 != null) {
                cu8 = vlc3.b(h3);
            }
            b2 = cu8;
        }
        if (b2 != null) {
            e52 S = ((p82) this.e.getValue()).S(b2.t0, j3, b2);
            ((t6b) this.d.getValue()).b(S, b2);
            if (S != null) {
                if (S.b.m == 0) {
                    ((p7c) this.j.getValue()).b(S);
                }
                if (((ri4) this.f.getValue()).d()) {
                    ArrayList j6 = S.j();
                    pk pkVar = (pk) this.h.getValue();
                    ArrayList arrayList = new ArrayList(z53.S(j6, 10));
                    Iterator it = j6.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((uj3) it.next()).n()));
                    }
                    ((k4a) pkVar).u(arrayList);
                }
                ((av0) this.g.getValue()).c(new l6f(S.a, b2.b, 0));
                es8 es8 = S.c;
                if (es8 != null && es8.a.b == b2.b) {
                    ((av0) this.g.getValue()).c(new vz2(Collections.singletonList(Long.valueOf(S.a)), false, false, (mg4) null, (h9b) null, 124));
                }
            }
            k8g k8g = b2.z0;
            if (k8g != null && k8g.i() > 0) {
                for (l20 l20 : (List) k8g.a) {
                    x10 x10 = l20.b;
                    if (x10 != null && x10.X) {
                        if (l20.s.length() > 0) {
                            String str = l20.s;
                            int i2 = pag.d;
                            if (str.endsWith(".mp4")) {
                            }
                        }
                        ? obj = new Object();
                        obj.a = b2.b;
                        obj.b = l20.r;
                        x10 x102 = l20.b;
                        obj.e = x102.s0;
                        obj.g = x102.t0;
                        ((rf5) this.i.getValue()).a(new pne(obj));
                    }
                }
            }
        }
    }
}
