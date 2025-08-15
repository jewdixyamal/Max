package defpackage;

import android.opengl.EGLSurface;
import org.webrtc.RendererCommon;

/* renamed from: acg  reason: default package */
public final class acg extends rd7 implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ oe1 b;
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acg(ne1 ne1, Object obj, oe1 oe1) {
        super(1);
        this.c = ne1;
        this.o = obj;
        this.b = oe1;
    }

    public final Object invoke(Object obj) {
        a4c a4c;
        switch (this.a) {
            case 0:
                me1 me1 = (me1) obj;
                ne1 ne1 = this.c;
                cp1 cp1 = (cp1) ne1;
                cp1.getClass();
                cp1.k = (RendererCommon.GlDrawer) this.o;
                long nanoTime = System.nanoTime();
                dp1 dp1 = cp1.l;
                dp1.g = nanoTime;
                dp1.f = 0;
                dp1.h = 0;
                dp1.i = 0;
                dp1.c.set(0);
                dp1.d.set(0);
                oe1 oe1 = cp1.g;
                if (oe1 == null || (a4c = oe1.a) == null) {
                    throw new RuntimeException("Render is missing inside onInitialize() callback");
                }
                int incrementAndGet = cp1.m.incrementAndGet();
                a4c.log(cp1.j, "Instance " + cp1.b + " initialized. Total count is " + incrementAndGet);
                this.b.i.add(ne1);
                return e5f.a;
            default:
                k56 k56 = (k56) this.o;
                me1 me12 = (me1) obj;
                try {
                    oe1 oe12 = this.b;
                    ne1 ne12 = this.c;
                    oe12.getClass();
                    EGLSurface eGLSurface = ne12.a;
                    ne12.a = null;
                    me12.e(eGLSurface);
                    return e5f.a;
                } finally {
                    if (k56 != null) {
                        k56.invoke();
                    }
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public acg(oe1 oe1, ne1 ne1, k56 k56) {
        super(1);
        this.b = oe1;
        this.c = ne1;
        this.o = k56;
    }
}
