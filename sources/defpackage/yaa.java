package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* renamed from: yaa  reason: default package */
public final class yaa extends hu3 {
    public final /* synthetic */ zaa X;
    public int Y;
    public /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yaa(zaa zaa, Continuation continuation) {
        super(continuation);
        this.X = zaa;
    }

    public final Object o(Object obj) {
        this.o = obj;
        this.Y |= Integer.MIN_VALUE;
        this.X.a((Context) null, this);
        return tx3.a;
    }
}
