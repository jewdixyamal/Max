package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: vn3  reason: default package */
public final class vn3 extends ffe implements a66 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ String Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vn3(Object obj, Continuation continuation, String str) {
        super(2, continuation);
        this.X = obj;
        this.Y = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vn3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vn3(this.X, continuation, this.Y);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        pua pua = (pua) this.X;
        long j = (long) pua.a;
        List O = c54.O(pua);
        String str = pua.g;
        return new nn3(j, pua.b, (String) null, O, (CharSequence) null, this.Y, str != null ? Uri.parse(str) : null, false, false, pua.a(), false, pua, 0, false, 29696);
    }
}
