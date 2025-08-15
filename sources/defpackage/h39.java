package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;

/* renamed from: h39  reason: default package */
public final /* synthetic */ class h39 implements k56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ h39(n59 n59, boolean z, MessageModel messageModel) {
        this.c = n59;
        this.b = z;
        this.o = messageModel;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                n59 n59 = (n59) this.c;
                boolean z = this.b;
                MessageModel messageModel = (MessageModel) this.o;
                Object i0 = x53.i0(n59.D().f.b.b());
                s5f s5f = i0 instanceof s5f ? (s5f) i0 : null;
                if (z && s5f != null) {
                    long j = 0;
                    if (s5f.a != 0) {
                        String str = n59.A0;
                        ir6 ir6 = hm9.m;
                        if (ir6 != null && ir6.c()) {
                            ir6.d(us7.X, str, ey8.h(s5f.a, "Try scroll to unread marker, mark: "), (Throwable) null);
                        }
                        long j2 = s5f.a;
                        if (messageModel != null) {
                            j = messageModel.c;
                        }
                        l89 B = n59.B();
                        B.getClass();
                        B.f(j47.S(B.c, B.b, vx3.b, new h89(B, j2, j, (Continuation) null)));
                    }
                }
                return e5f.a;
            default:
                Bitmap bitmap = (Bitmap) this.o;
                boolean z2 = this.b;
                fjf fjf = ((sif) this.c).u0;
                if (fjf != null) {
                    String str2 = fjf.p;
                    ir6 ir62 = hm9.m;
                    if (ir62 != null && ir62.c()) {
                        us7 us7 = us7.X;
                        String J = bitmap != null ? ay7.J(bitmap) : null;
                        ir62.d(us7, str2, "setStencilBitmap, " + J + ", recycle_after_consume=" + z2, (Throwable) null);
                    }
                    b2e b2e = fjf.q;
                    if (b2e == null) {
                        b2e = new b2e(fjf.o);
                        fjf.q = b2e;
                    }
                    String str3 = b2e.d;
                    ir6 ir63 = hm9.m;
                    if (ir63 != null && ir63.c()) {
                        us7 us72 = us7.X;
                        String J2 = bitmap != null ? ay7.J(bitmap) : null;
                        ir63.d(us72, str3, "setBitmap, " + J2 + ", recycle_after_consume=" + z2, (Throwable) null);
                    }
                    if (bitmap != null) {
                        b2e.e.setStencilBitmap(bitmap, z2);
                    }
                    return e5f.a;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public /* synthetic */ h39(sif sif, Bitmap bitmap, boolean z) {
        this.c = sif;
        this.o = bitmap;
        this.b = z;
    }
}
