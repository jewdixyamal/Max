package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.coroutines.Continuation;

/* renamed from: alb  reason: default package */
public final class alb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uj3 Y;
    public final /* synthetic */ blb Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public alb(uj3 uj3, blb blb, Continuation continuation) {
        super(2, continuation);
        this.Y = uj3;
        this.Z = blb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((alb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new alb(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        ArrayList arrayList;
        tx3 tx3 = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            oz4 oz4 = oz4.a;
            uj3 uj3 = this.Y;
            int[] iArr = uj3.a.c.v;
            int length = iArr.length;
            if (length != 0) {
                if (length != 1) {
                    ArrayList arrayList2 = new ArrayList(iArr.length);
                    for (int valueOf : iArr) {
                        arrayList2.add(Integer.valueOf(valueOf));
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = Collections.singletonList(Integer.valueOf(iArr[0]));
                }
            } else {
                arrayList = nz4.a;
            }
            wgb wgb = new wgb(0, uj3.n(), new bdb((Object) oz4, 0, arrayList));
            adb adb = this.Z.a;
            this.X = 1;
            adb.getClass();
            if (ote.j((ilc) adb.a, new uh(adb, 18, wgb), this) == tx3) {
                return tx3;
            }
        } else if (i == 1) {
            od2.a0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
