package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: uy4  reason: default package */
public final class uy4 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ az4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uy4(az4 az4, Continuation continuation) {
        super(2, continuation);
        this.Z = az4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uy4) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uy4 uy4 = new uy4(this.Z, continuation);
        uy4.Y = obj;
        return uy4;
    }

    public final Object o(Object obj) {
        Object obj2;
        on5 on5;
        Object[] objArr;
        int i;
        int i2;
        int i3;
        qx4 qx4;
        tx3 tx3 = tx3.a;
        int i4 = this.X;
        int i5 = 1;
        if (i4 == 0) {
            od2.a0(obj);
            on5 = (on5) this.Y;
            y8 y8Var = this.Z.c;
            this.Y = on5;
            this.X = 1;
            cz4 cz4 = (cz4) y8Var.a;
            cz4.getClass();
            kl7 l = j1e.l();
            int i6 = 0;
            while (i6 < 9) {
                Object[] objArr2 = tpa.a[i6];
                int length = objArr2.length;
                int i7 = 0;
                while (i7 < length) {
                    Object obj3 = objArr2[i7];
                    if (obj3 instanceof String) {
                        qx4 qx42 = r8;
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        qx4 qx43 = new qx4(i6, i5, (CharSequence) obj3, (List) null, cz4.c((String) obj3), 0, 40);
                        l.add(qx42);
                    } else {
                        i = i7;
                        i2 = length;
                        i3 = i6;
                        objArr = objArr2;
                        if (obj3 instanceof Object[]) {
                            Object[] objArr3 = (Object[]) obj3;
                            if (objArr3[0] instanceof Object[]) {
                                String str = ((String[][]) objArr3)[0][0];
                                Object[][] objArr4 = (Object[][]) objArr3;
                                int i8 = 0;
                                for (Object[] length2 : objArr4) {
                                    i8 += length2.length;
                                }
                                ArrayList arrayList = new ArrayList(i8);
                                for (Object[] X2 : objArr4) {
                                    d63.X(arrayList, X2);
                                }
                                qx4 = new qx4(i3, i5, str, arrayList, cz4.c(str), 0, 32);
                            } else {
                                String str2 = ((String[]) objArr3)[0];
                                qx4 = new qx4(i3, i5, str2, ys.m0(objArr3), cz4.c(str2), 0, 32);
                            }
                            l.add(qx4);
                        }
                    }
                    i5++;
                    i7 = i + 1;
                    i6 = i3;
                    length = i2;
                    objArr2 = objArr;
                }
                i6++;
            }
            obj2 = j1e.d(l);
            if (obj2 == tx3) {
                return tx3;
            }
        } else if (i4 == 1) {
            on5 = (on5) this.Y;
            od2.a0(obj);
            obj2 = obj;
        } else if (i4 == 2) {
            od2.a0(obj);
            return e5f.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y = null;
        this.X = 2;
        if (on5.a(obj2, this) == tx3) {
            return tx3;
        }
        return e5f.a;
    }
}
