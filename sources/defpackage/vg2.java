package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: vg2  reason: default package */
public final class vg2 extends ffe implements e66 {
    public final /* synthetic */ int X;
    public /* synthetic */ Throwable Y;
    public /* synthetic */ long Z;
    public final /* synthetic */ Object s0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg2(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.X = i;
        this.s0 = obj;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        on5 on5 = (on5) obj;
        Throwable th = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.X) {
            case 0:
                long longValue = number.longValue();
                vg2 vg2 = new vg2((yg2) this.s0, (Continuation) obj4, 0);
                vg2.Y = th;
                vg2.Z = longValue;
                return vg2.o(e5f.a);
            default:
                long longValue2 = number.longValue();
                vg2 vg22 = new vg2((rff) this.s0, (Continuation) obj4, 1);
                vg22.Y = th;
                vg22.Z = longValue2;
                return vg22.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        boolean z;
        boolean z2;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                Throwable th = this.Y;
                long j = this.Z;
                boolean z3 = th instanceof TamErrorException;
                yg2 yg2 = (yg2) this.s0;
                if (!z3 || !f46.U(((TamErrorException) th).a.b) || j > 2) {
                    hm9.p((String) yg2.e, "request failed with " + th + ". Couldn't recover", (Throwable) null);
                    z = false;
                } else {
                    hm9.p((String) yg2.e, "request failed with " + th + ". Retrying", (Throwable) null);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                od2.a0(obj);
                Throwable th2 = this.Y;
                long j2 = this.Z;
                boolean z4 = th2 instanceof TamErrorException;
                rff rff = (rff) this.s0;
                if (!z4 || !f46.U(((TamErrorException) th2).a.b) || j2 > 2) {
                    String str = rff.f;
                    hm9.p(str, "Fetch video. Request failed with " + th2 + ". Couldn't recover", (Throwable) null);
                    z2 = false;
                } else {
                    String str2 = rff.f;
                    hm9.p(str2, "Fetch video. Request failed with " + th2 + ". Retrying", (Throwable) null);
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }
}
