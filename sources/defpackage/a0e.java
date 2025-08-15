package defpackage;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* renamed from: a0e  reason: default package */
public final class a0e extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j0e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a0e(j0e j0e, Continuation continuation) {
        super(2, continuation);
        this.Z = j0e;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((a0e) n((on5) obj, (Continuation) obj2)).o(e5f.a);
        return tx3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a0e a0e = new a0e(this.Z, continuation);
        a0e.Y = obj;
        return a0e;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [jec, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            o69 o69 = new o69(new Object(), (on5) this.Y);
            this.X = 1;
            if (this.Z.d(o69, this) == obj2) {
                return obj2;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            od2.a0(obj);
        }
        throw new KotlinNothingValueException();
    }
}
