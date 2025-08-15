package defpackage;

import android.os.Build;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: hg3  reason: default package */
public final class hg3 extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ jg3 o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public hg3(defpackage.jg3 r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            gg3 r2 = defpackage.gg3.NORMAL
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        L_0x000f:
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.o = r1
            r1 = 9
            r0.<init>((int) r1, (java.lang.Object) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg3.<init>(jg3, int):void");
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (!tpa.f(obj, obj2)) {
                    gg3 gg3 = (gg3) obj2;
                    gg3 gg32 = (gg3) obj;
                    pq9 pq9 = qp4.u0;
                    jg3 jg3 = this.o;
                    int c2 = pq9.j(jg3).c(gg3.a);
                    int ordinal = gg3.ordinal();
                    vx3 vx3 = vx3.b;
                    bud bud = jg3.b2;
                    if (ordinal == 0) {
                        jg3.setInputsEnabled(false);
                        ArrayList G0 = jg3.G0(jg3);
                        ig3 ig3 = new ig3(jg3, gg3, 0);
                        bud.getClass();
                        ytd ytd = new ytd(G0, ig3, bud, new utd(bud, c2, 0), (Continuation) null);
                        sx3 sx3 = bud.a;
                        vxd T = j47.T(sx3, (lx3) null, vx3, ytd, 1);
                        bc7[] bc7Arr = bud.e;
                        bud.d.o1(bud, bc7Arr[1], T);
                        vxd T2 = j47.T(sx3, (lx3) null, vx3, new aud(G0, bud, new shb(2, bud, bud.class, "animateShackingView", "animateShackingView(Lone/me/sdk/codeinput/InputController;)V", 4, 6), (Continuation) null), 1);
                        bud.c.o1(bud, bc7Arr[0], T2);
                        return;
                    } else if (ordinal == 1) {
                        jg3.setInputsEnabled(!jg3.getDisableInputsForError());
                        if (Build.VERSION.SDK_INT >= 30) {
                            pag.F(jg3, ni6.REJECT);
                        }
                        ArrayList G02 = jg3.G0(jg3);
                        ig3 ig32 = new ig3(jg3, gg3, 1);
                        bud.b();
                        kwd kwd = new kwd(jg3, kwd.p);
                        lwd lwd = new lwd(0.0f);
                        lwd.b(1500.0f);
                        lwd.a(0.2f);
                        kwd.m = lwd;
                        kwd.a = 3000.0f;
                        kwd.g();
                        vxd T3 = j47.T(bud.a, (lx3) null, vx3, new wtd(G02, ig32, new utd(bud, c2, 1), 200, (Continuation) null), 1);
                        bud.d.o1(bud, bud.e[1], T3);
                        return;
                    } else if (ordinal == 2) {
                        jg3.setInputsEnabled(true);
                        ArrayList G03 = jg3.G0(jg3);
                        ig3 ig33 = new ig3(jg3, gg3, 2);
                        bud.b();
                        vxd T4 = j47.T(bud.a, (lx3) null, vx3, new wtd(G03, ig33, new wy6(bud, c2), 300, (Continuation) null), 1);
                        bud.d.o1(bud, bud.e[1], T4);
                        return;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return;
                }
            default:
                if (!tpa.f(obj, obj2)) {
                    int intValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    jg3 jg32 = this.o;
                    jg32.setAdapter(new qtd(intValue, jg32, new qk2(2, jg32)));
                    return;
                }
                return;
        }
    }
}
