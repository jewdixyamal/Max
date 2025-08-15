package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: fs3  reason: default package */
public final class fs3 extends ffe implements a66 {
    public final /* synthetic */ js3 X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fs3(js3 js3, String str, Continuation continuation) {
        super(2, continuation);
        this.X = js3;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fs3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fs3(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        rd6 rd6;
        od2.a0(obj);
        td tdVar = this.X.c;
        ArrayList arrayList = new ArrayList();
        for (vpb vpb : (List) ((yx7) ((je7) tdVar.o).getValue()).e(this.Y).e()) {
            kq3 kq3 = vpb.c;
            if (kq3 == null) {
                rd6 = null;
            } else {
                lr1 lr1 = new lr1((ida) hr3.a.getAccessor().c(ida.class), vpb, (Context) tdVar.c, 4);
                wm3 wm3 = kq3.a;
                String a = wm3.a();
                w6b a2 = (a == null || a.length() == 0) ^ true ? (w6b) lr1.invoke(wm3.a()) : w6b.a();
                String c = bre.c(wm3.w0);
                b0d r = jyc.a.r();
                List list = vpb.b;
                w6b a3 = true ^ r.d(c, list).isEmpty() ? (w6b) lr1.invoke(c) : w6b.a();
                int i = iz7.l(kq3.o).a;
                if (!(i == 10 || i == 20)) {
                }
                String a4 = wm3.a();
                if (a4 == null) {
                    a4 = "";
                }
                rd6 = new rd6(wm3.a, a4, a2, a3, j47.N(wm3.d(kk0.c)), wm3, (wz) list, tdVar.b);
            }
            if (rd6 != null) {
                arrayList.add(rd6);
            }
        }
        return arrayList;
    }
}
