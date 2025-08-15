package defpackage;

import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

/* renamed from: l01  reason: default package */
public final /* synthetic */ class l01 implements EventQueueCollector.IdleStateProvider, qj3, km7, jm7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ l01() {
        this.a = 10;
        this.b = true;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 1:
                u82 u82 = (u82) obj;
                u82.d0 = new oq0(u82.d0.a, this.b);
                return;
            case 5:
                j10 j10 = (j10) obj;
                if (this.b) {
                    j10.i = d20.o;
                    return;
                } else {
                    j10.i = d20.a;
                    return;
                }
            case 7:
                ((x4b) obj).Y(this.b);
                return;
            case 8:
                ((x4b) obj).q0(this.b);
                return;
            case 9:
                ((x4b) obj).w(this.b);
                return;
            case 10:
                j10 j102 = (j10) obj;
                boolean z = this.b;
                j102.y = z;
                if (j102.r != null && j102.b().d != null) {
                    j10 j = j102.b().d.j();
                    j.y = z;
                    l20 a2 = j.a();
                    r10 a3 = j102.b().a();
                    a3.e = a2;
                    j102.r = new s10(a3);
                    return;
                }
                return;
            default:
                j10 j103 = (j10) obj;
                boolean O = s5c.O(j103);
                if (j103.d != null || O) {
                    boolean z2 = this.b;
                    if (O) {
                        h20 a4 = j103.b().d.d.a();
                        a4.n = z2;
                        k20 k20 = new k20(a4);
                        j10 j2 = j103.b().d.j();
                        j2.d = k20;
                        l20 a5 = j2.a();
                        r10 a6 = j103.b().a();
                        a6.e = a5;
                        j103.r = new s10(a6);
                        return;
                    }
                    h20 a7 = j103.c().a();
                    a7.n = z2;
                    j103.d = new k20(a7);
                    return;
                }
                return;
        }
    }

    public void invoke(Object obj) {
        switch (this.a) {
            case 2:
                ((n3b) obj).O(this.b);
                return;
            case 3:
                ((n3b) obj).j(this.b);
                return;
            case 4:
                ((m3b) obj).j(this.b);
                return;
            default:
                ((n3b) obj).O(this.b);
                return;
        }
    }

    public boolean isIdle() {
        return CallAnalyticsSender.setIdle$lambda$0(this.b);
    }

    public /* synthetic */ l01(boolean z, int i) {
        this.a = i;
        this.b = z;
    }
}
