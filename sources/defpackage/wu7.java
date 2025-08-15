package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: wu7  reason: default package */
public final class wu7 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ List Y;
    public /* synthetic */ List Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wu7(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        List list2 = (List) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                wu7 wu7 = new wu7(3, continuation, 0);
                wu7.Y = list;
                wu7.Z = list2;
                return wu7.o(e5f.a);
            case 1:
                wu7 wu72 = new wu7(3, continuation, 1);
                wu72.Y = list;
                wu72.Z = list2;
                return wu72.o(e5f.a);
            case 2:
                wu7 wu73 = new wu7(3, continuation, 2);
                wu73.Y = list;
                wu73.Z = list2;
                return wu73.o(e5f.a);
            default:
                wu7 wu74 = new wu7(3, continuation, 3);
                wu74.Y = list;
                wu74.Z = list2;
                return wu74.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                List list = this.Y;
                list.addAll(this.Z);
                return list;
            case 1:
                od2.a0(obj);
                List list2 = this.Y;
                list2.addAll(this.Z);
                return list2;
            case 2:
                od2.a0(obj);
                List list3 = this.Y;
                return list3.isEmpty() ? this.Z : list3;
            default:
                od2.a0(obj);
                return x53.t0(this.Y, this.Z);
        }
    }
}
