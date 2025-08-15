package defpackage;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;

/* renamed from: fy4  reason: default package */
public final class fy4 extends ffe implements a66 {
    public Bitmap X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ gy4 t0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fy4(int i, gy4 gy4, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = gy4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fy4) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        fy4 fy4 = new fy4(this.s0, this.t0, continuation);
        fy4.Z = obj;
        return fy4;
    }

    public final Object o(Object obj) {
        sx3 sx3;
        Bitmap bitmap;
        tx3 tx3 = tx3.a;
        int i = this.Y;
        boolean z = true;
        if (i == 0) {
            od2.a0(obj);
            sx3 = (sx3) this.Z;
            String name = sx3.getClass().getName();
            int i2 = this.s0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.X, name, zr6.h(i2, "start extracting sprite by index: "), (Throwable) null);
            }
            Bitmap y = fp3.y(this.t0.b, this.s0);
            gy4 gy4 = this.t0;
            int i3 = this.s0;
            ((Bitmap[]) gy4.a.a)[i3] = y;
            kld kld = gy4.d;
            Integer num = new Integer(i3);
            this.Z = sx3;
            this.X = y;
            this.Y = 1;
            if (kld.a(num, this) == tx3) {
                return tx3;
            }
            bitmap = y;
        } else if (i == 1) {
            bitmap = this.X;
            sx3 = (sx3) this.Z;
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String name2 = sx3.getClass().getName();
        int i4 = this.s0;
        ir6 ir62 = hm9.m;
        if (ir62 != null && ir62.c()) {
            us7 us7 = us7.X;
            if (bitmap == null) {
                z = false;
            }
            ir62.d(us7, name2, "finish extracting sprite by index: " + i4 + " , sprite exist: " + z, (Throwable) null);
        }
        return e5f.a;
    }
}
