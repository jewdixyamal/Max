package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: kb9  reason: default package */
public final class kb9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xb9 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb9(xb9 xb9, Continuation continuation) {
        super(2, continuation);
        this.Z = xb9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kb9) n((gi9) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        kb9 kb9 = new kb9(this.Z, continuation);
        kb9.Y = obj;
        return kb9;
    }

    public final Object o(Object obj) {
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gi9 gi9 = (gi9) this.Y;
            gi9 gi92 = new gi9(gi9.d);
            long[] jArr = gi9.b;
            long[] jArr2 = gi9.a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr2[i2];
                    if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j) < 128) {
                                gi92.a(jArr[(i2 << 3) + i4]);
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            xb9 xb9 = this.Z;
            List b = xb9.b(gi92);
            int i5 = ft4.o;
            long R = z7.R(10, kt4.SECONDS);
            this.X = 1;
            if (xb9.j(R, b, this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
