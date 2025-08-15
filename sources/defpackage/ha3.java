package defpackage;

import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: ha3  reason: default package */
public final class ha3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ ComplaintBottomSheet s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ha3(kq1 kq1, Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.Z = kq1;
        this.s0 = complaintBottomSheet;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ha3) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ha3 ha3 = new ha3((kq1) this.Z, continuation, this.s0);
        ha3.Y = obj;
        return ha3;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [jec, java.lang.Object] */
    public final Object o(Object obj) {
        Object obj2 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            y40 y40 = new y40(new Object(), (on5) this.Y, this.s0);
            this.X = 1;
            if (this.Z.d(y40, this) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
