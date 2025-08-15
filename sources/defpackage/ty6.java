package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ty6  reason: default package */
public final class ty6 extends ffe implements a66 {
    public fz6 X;
    public int Y;
    public int Z;
    public final /* synthetic */ fz6 s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ty6(fz6 fz6, Continuation continuation) {
        super(2, continuation);
        this.s0 = fz6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ty6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ty6(this.s0, continuation);
    }

    public final Object o(Object obj) {
        int i;
        fz6 fz6;
        tx3 tx3 = tx3.a;
        int i2 = this.Z;
        if (i2 == 0) {
            od2.a0(obj);
            fz6 = this.s0;
            String str = fz6.E0;
            if (((eua) fz6.X.getValue()).c()) {
                w76 w76 = w76.a;
                this.X = fz6;
                this.Z = 1;
                obj = fz6.a(w76, fz6, this);
                if (obj == tx3) {
                    return tx3;
                }
            } else {
                throw new IllegalStateException("storage permissions not granted".toString());
            }
        } else if (i2 == 1) {
            fz6 = this.X;
            od2.a0(obj);
        } else if (i2 == 2) {
            i = this.Y;
            try {
                od2.a0(obj);
                return new ojc(new Integer(i + ((Number) obj).intValue()));
            } catch (Throwable th) {
                return new mjc(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int intValue = ((Number) obj).intValue();
        y76 y76 = y76.a;
        this.X = null;
        this.Y = intValue;
        this.Z = 2;
        Object a = fz6.a(y76, fz6, this);
        if (a == tx3) {
            return tx3;
        }
        int i3 = intValue;
        obj = a;
        i = i3;
        return new ojc(new Integer(i + ((Number) obj).intValue()));
    }
}
