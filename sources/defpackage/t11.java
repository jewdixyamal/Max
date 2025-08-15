package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: t11  reason: default package */
public final class t11 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ boolean Y;
    public /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t11(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj;
        switch (this.X) {
            case 0:
                boolean booleanValue = bool.booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                t11 t11 = new t11(3, (Continuation) obj3, 0);
                t11.Y = booleanValue;
                t11.Z = booleanValue2;
                return t11.o(e5f.a);
            case 1:
                boolean booleanValue3 = bool.booleanValue();
                boolean booleanValue4 = ((Boolean) obj2).booleanValue();
                t11 t112 = new t11(3, (Continuation) obj3, 1);
                t112.Y = booleanValue3;
                t112.Z = booleanValue4;
                return t112.o(e5f.a);
            default:
                boolean booleanValue5 = bool.booleanValue();
                boolean booleanValue6 = ((Boolean) obj2).booleanValue();
                t11 t113 = new t11(3, (Continuation) obj3, 2);
                t113.Y = booleanValue5;
                t113.Z = booleanValue6;
                return t113.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            case 1:
                od2.a0(obj);
                return Boolean.valueOf(this.Y && !this.Z);
            default:
                od2.a0(obj);
                return Boolean.valueOf(this.Y || this.Z);
        }
    }
}
