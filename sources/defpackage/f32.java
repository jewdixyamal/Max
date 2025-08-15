package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.Continuation;

/* renamed from: f32  reason: default package */
public final class f32 extends l32 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(f32.class, "consumed$volatile");
    public final boolean X;
    private volatile /* synthetic */ int consumed$volatile;
    public final p8c o;

    public /* synthetic */ f32(p8c p8c, boolean z) {
        this(p8c, z, hz4.a, -3, 1);
    }

    public final Object d(on5 on5, Continuation continuation) {
        e5f e5f = e5f.a;
        tx3 tx3 = tx3.a;
        if (this.b == -3) {
            boolean z = this.X;
            if (!z || Y.getAndSet(this, 1) == 0) {
                Object v = fp3.v(on5, this.o, z, continuation);
                return v == tx3 ? v : e5f;
            }
            throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
        }
        Object d = super.d(on5, continuation);
        return d == tx3 ? d : e5f;
    }

    public final String h() {
        return "channel=" + this.o;
    }

    public final Object j(iab iab, Continuation continuation) {
        Object v = fp3.v(new z5d(iab), this.o, this.X, continuation);
        return v == tx3.a ? v : e5f.a;
    }

    public final l32 k(lx3 lx3, int i, int i2) {
        return new f32(this.o, this.X, lx3, i, i2);
    }

    public final mn5 l() {
        return new f32(this.o, this.X);
    }

    public final p8c m(sx3 sx3) {
        if (!this.X || Y.getAndSet(this, 1) == 0) {
            return this.b == -3 ? this.o : super.m(sx3);
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
    }

    public f32(p8c p8c, boolean z, lx3 lx3, int i, int i2) {
        super(lx3, i, i2);
        this.o = p8c;
        this.X = z;
        this.consumed$volatile = 0;
    }
}
