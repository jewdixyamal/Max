package defpackage;

import android.os.Build;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: i58  reason: default package */
public final class i58 extends ffe implements c66 {
    public final /* synthetic */ int X;
    public /* synthetic */ bua Y;
    public /* synthetic */ bua Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i58(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        bua bua = (bua) obj;
        bua bua2 = (bua) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                i58 i58 = new i58(3, continuation, 0);
                i58.Y = bua;
                i58.Z = bua2;
                return i58.o(e5f.a);
            case 1:
                i58 i582 = new i58(3, continuation, 1);
                i582.Y = bua;
                i582.Z = bua2;
                return i582.o(e5f.a);
            default:
                i58 i583 = new i58(3, continuation, 2);
                i583.Y = bua;
                i583.Z = bua2;
                return i583.o(e5f.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                od2.a0(obj);
                bua bua = this.Y;
                bua bua2 = this.Z;
                int ordinal = bua.ordinal();
                v8b v8b = v8b.a;
                if (ordinal == 0) {
                    return v8b;
                }
                if (ordinal == 1) {
                    int ordinal2 = bua2.ordinal();
                    if (ordinal2 == 0) {
                        return v8b;
                    }
                    if (ordinal2 == 1) {
                        return v8b.b;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                od2.a0(obj);
                return Boolean.valueOf(Build.VERSION.SDK_INT >= 34 && this.Y == bua.b && this.Z == bua.a);
            default:
                od2.a0(obj);
                bua bua3 = this.Y;
                bua bua4 = this.Z;
                bua bua5 = bua.a;
                return Boolean.valueOf(bua3 == bua5 || bua4 == bua5);
        }
    }
}
