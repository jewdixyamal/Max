package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: bp  reason: default package */
public final /* synthetic */ class bp implements k56 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ bp(yz0 yz0, je7 je7, je7 je72, je7 je73) {
        this.a = 1;
        this.c = yz0;
        this.b = je7;
        this.o = je72;
        this.X = je73;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ep epVar = (ep) this.o;
                return new xp4((Context) this.c, (p7b) epVar.l.getValue(), epVar.a(), (p84) this.X, (p82) ((je7) this.b).getValue());
            case 1:
                return new tz0((yz0) this.c, (je7) this.b, (je7) this.o, (je7) this.X);
            case 2:
                p7b p7b = (p7b) ((m7b) this.c);
                return new yc8((Context) xcb.a.getAccessor().c(Context.class), p7b.a, (ge2) this.o, (je7) this.b, (je7) this.X, p7b.e);
            case 3:
                return new ki5((File) this.c, (li5) this.o, (mi5) this.X, (fd7) this.b);
            case 4:
                fs8 fs8 = (fs8) this.o;
                long j = fs8.a;
                au8 au8 = (au8) this.c;
                au8.A(j, fs8.c);
                iu8 iu8 = iu8.SENT;
                cu8 cu8 = (cu8) this.X;
                au8.x(cu8, iu8);
                pl plVar = ((ve9) this.b).c;
                if (plVar == null) {
                    plVar = null;
                }
                au8.w(cu8, iz7.g(fs8.s0, (vxc) plVar.F.getValue()));
                return e5f.a;
            default:
                return new ya9((je7) this.b, (je7) this.c, (je7) this.o, (je7) this.X);
        }
    }

    public /* synthetic */ bp(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = 5;
        this.b = je7;
        this.c = je72;
        this.o = je73;
        this.X = je74;
    }

    public /* synthetic */ bp(m7b m7b, ge2 ge2, je7 je7, je7 je72) {
        this.a = 2;
        this.c = m7b;
        this.o = ge2;
        this.b = je7;
        this.X = je72;
    }

    public /* synthetic */ bp(Context context, ep epVar, p84 p84, v7g v7g, je7 je7) {
        this.a = 0;
        this.c = context;
        this.o = epVar;
        this.X = p84;
        this.b = je7;
    }

    public /* synthetic */ bp(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.X = obj3;
        this.b = obj4;
    }
}
