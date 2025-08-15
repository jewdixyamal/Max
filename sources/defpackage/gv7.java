package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: gv7  reason: default package */
public final class gv7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CharSequence Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gv7(CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.Y = charSequence;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gv7) n((File) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gv7 gv7 = new gv7(this.Y, continuation);
        gv7.X = obj;
        return gv7;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        aab aab = new aab(((File) this.X).getAbsolutePath());
        return new nj7(new mqc(new rje(aab, (Continuation) null)), this.Y.toString(), 2);
    }
}
