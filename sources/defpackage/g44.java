package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g44  reason: default package */
public final class g44 extends ffe implements m56 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ o44 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g44(o44 o44, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = o44;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new g44(this.Z, continuation, 0).o(e5f.a);
            case 1:
                return new g44(this.Z, continuation, 1).o(e5f.a);
            case 2:
                return new g44(this.Z, continuation, 2).o(e5f.a);
            default:
                return new g44(this.Z, continuation, 3).o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                tx3 tx3 = tx3.a;
                int i = this.Y;
                if (i == 0) {
                    od2.a0(obj);
                    hm9.m(o44.k, "cancelAll", new Object[0]);
                    f44 f44 = f44.f;
                    o44 o44 = this.Z;
                    o44.g = f44;
                    this.Y = 1;
                    if (((n79) ((b79) o44.a.getValue())).c(this) == tx3) {
                        return tx3;
                    }
                } else if (i == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
            case 1:
                tx3 tx32 = tx3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    od2.a0(obj);
                    o44 o442 = this.Z;
                    f44 f442 = o442.g;
                    f44 f443 = new f44(f442.a, f442.b, f442.e, f442.c, (je5) null);
                    this.Y = 1;
                    if (o44.a(o442, f443, this) == tx32) {
                        return tx32;
                    }
                } else if (i2 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
            case 2:
                tx3 tx33 = tx3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    od2.a0(obj);
                    o44 o443 = this.Z;
                    f44 f444 = o443.g;
                    f44 f445 = new f44(f444.a, f444.b, f444.e, f444.c, (je5) null);
                    this.Y = 1;
                    if (o44.a(o443, f445, this) == tx33) {
                        return tx33;
                    }
                } else if (i3 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
            default:
                tx3 tx34 = tx3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    od2.a0(obj);
                    o44 o444 = this.Z;
                    f44 f446 = new f44(false, false, o444.g.e, true, (je5) null);
                    this.Y = 1;
                    if (o44.a(o444, f446, this) == tx34) {
                        return tx34;
                    }
                } else if (i4 == 1) {
                    od2.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return e5f.a;
        }
    }
}
