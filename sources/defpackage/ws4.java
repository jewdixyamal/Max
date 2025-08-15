package defpackage;

import android.content.Context;
import java.util.Map;
import org.webrtc.EglBase;

/* renamed from: ws4  reason: default package */
public final /* synthetic */ class ws4 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ws4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((o23) this.b).e((ax1) this.c, (ax1) this.o, (iee) this.X, (iee) this.Y, (Map.Entry) this.Z);
                return;
            default:
                fwc fwc = (fwc) this.b;
                a4c a4c = (a4c) this.Y;
                fwc.getClass();
                fwc.o = new h26((EglBase.Context) this.c, (Context) this.o, (u5e) this.X, a4c);
                fwc.X = new l26(a4c, (dnc) this.Z);
                fwc.Y = new z26();
                h26 h26 = fwc.o;
                l26 l26 = fwc.X;
                h26.Z = l26;
                z26 z26 = fwc.Y;
                l26.getClass();
                l26.c.c(new j26(l26, z26, 0));
                l26 l262 = fwc.X;
                z26 z262 = fwc.Y;
                l262.getClass();
                l262.c.c(new j26(l262, z262, 1));
                return;
        }
    }
}
