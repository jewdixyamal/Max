package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: y96  reason: default package */
public final class y96 extends ffe implements a66 {
    public final /* synthetic */ z96 X;
    public final /* synthetic */ boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y96(z96 z96, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = z96;
        this.Y = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((y96) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new y96(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        hm9.m("z96", "updateUiItemsBySelections()", new Object[0]);
        z96 z96 = this.X;
        Iterable<u86> iterable = (Iterable) z96.w0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(iterable, 10));
        for (u86 u86 : iterable) {
            int t = this.Y ? 0 : z96.t(u86.c);
            arrayList.add(u86.b(u86, (awa) null, (ref) null, (Uri) null, t, !((Boolean) z96.v0.getValue()).booleanValue() || t > 0, 0, (Uri) null, 1855));
        }
        z96.w0.m((Object) null, arrayList);
        return e5f.a;
    }
}
