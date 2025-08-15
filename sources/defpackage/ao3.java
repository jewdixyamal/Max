package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ao3  reason: default package */
public final /* synthetic */ class ao3 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo3 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ao3(oo3 oo3, long j, int i) {
        this.a = i;
        this.b = oo3;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        yha yha = (yha) obj;
        switch (this.a) {
            case 0:
                int ordinal = yha.ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                    oo3 oo3 = this.b;
                    j47.S(oo3.a, ((w9a) oo3.c).b().plus(xq9.a), vx3.c, new no3(oo3, this.c, (Continuation) null));
                }
                return e5f.a;
            case 1:
                if (bo3.$EnumSwitchMapping$1[yha.ordinal()] == 1) {
                    oo3 oo32 = this.b;
                    j47.T(oo32.a, ((w9a) oo32.c).b(), (vx3) null, new do3(oo32, this.c, (Continuation) null), 2);
                }
                return e5f.a;
            default:
                if (bo3.$EnumSwitchMapping$1[yha.ordinal()] == 1) {
                    oo3 oo33 = this.b;
                    j47.T(oo33.a, ((w9a) oo33.c).b(), (vx3) null, new co3(oo33, this.c, (Continuation) null), 2);
                }
                return e5f.a;
        }
    }
}
