package defpackage;

import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* renamed from: ni4  reason: default package */
public final class ni4 implements mn5 {
    public final /* synthetic */ mn5 a;
    public final /* synthetic */ DevMenuScreen b;
    public final /* synthetic */ int c;

    public ni4(j0e j0e, DevMenuScreen devMenuScreen, int i) {
        this.a = j0e;
        this.b = devMenuScreen;
        this.c = i;
    }

    public final Object d(on5 on5, Continuation continuation) {
        Object d = this.a.d(new zq(on5, this.b, this.c), continuation);
        return d == tx3.a ? d : e5f.a;
    }
}
