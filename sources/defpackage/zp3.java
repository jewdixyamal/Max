package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: zp3  reason: default package */
public final class zp3 extends ffe implements e66 {
    public final /* synthetic */ int X = 1;
    public /* synthetic */ List Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object s0;

    public /* synthetic */ zp3(int i, Continuation continuation) {
        super(i, continuation);
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.X) {
            case 0:
                r7b r7b = (r7b) obj2;
                zp3 zp3 = new zp3((cq3) this.s0, (Continuation) obj4);
                zp3.Z = (uj3) obj;
                zp3.Y = (List) obj3;
                return zp3.o(e5f.a);
            default:
                zp3 zp32 = new zp3(4, (Continuation) obj4);
                zp32.Y = (List) obj;
                zp32.Z = (List) obj2;
                zp32.s0 = (List) obj3;
                return zp32.o(e5f.a);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [s6e, java.lang.Object] */
    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                List list = this.Y;
                kpa D = ((cq3) this.s0).D((uj3) this.Z);
                return new mab((tab) D.a, (List) D.b, list);
            default:
                od2.a0(obj);
                List list2 = this.Y;
                ? obj2 = new Object();
                obj2.a = list2;
                obj2.b = (List) this.Z;
                obj2.c = (List) this.s0;
                return obj2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zp3(cq3 cq3, Continuation continuation) {
        super(4, continuation);
        this.s0 = cq3;
    }
}
