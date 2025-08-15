package defpackage;

import android.opengl.EGLSurface;
import java.util.ArrayList;

/* renamed from: hcg  reason: default package */
public final class hcg extends rd7 implements m56 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ne1 b;
    public final /* synthetic */ oe1 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hcg(ne1 ne1, oe1 oe1) {
        super(1);
        this.b = ne1;
        this.c = oe1;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                me1 me1 = (me1) obj;
                ArrayList arrayList = this.c.i;
                ne1 ne1 = this.b;
                if (arrayList.remove(ne1)) {
                    EGLSurface eGLSurface = ne1.a;
                    ne1.a = null;
                    me1.e(eGLSurface);
                    ne1.a();
                }
                return e5f.a;
            default:
                this.b.b(this.c, (me1) obj);
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hcg(oe1 oe1, ne1 ne1) {
        super(1);
        this.c = oe1;
        this.b = ne1;
    }
}
