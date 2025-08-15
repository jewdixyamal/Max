package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: gj6  reason: default package */
public final class gj6 extends ffe implements a66 {
    public final /* synthetic */ ij6 X;
    public final /* synthetic */ File Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gj6(ij6 ij6, File file, Continuation continuation) {
        super(2, continuation);
        this.X = ij6;
        this.Y = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gj6) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gj6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wha wha = (wha) this.X.d.getValue();
        wha.h("Дамп памяти закончился");
        String absolutePath = this.Y.getAbsolutePath();
        wha.b("Если что файл можно будет найти по этому пути: " + absolutePath);
        return wha.i();
    }
}
