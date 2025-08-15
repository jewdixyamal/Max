package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.search.SearchMessageBottomWidget;

/* renamed from: yyc  reason: default package */
public final class yyc extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ SearchMessageBottomWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yyc(SearchMessageBottomWidget searchMessageBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.Y = searchMessageBottomWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yyc) n((c64) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yyc yyc = new yyc(this.Y, continuation);
        yyc.X = obj;
        return yyc;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        jzc.c.R1((c64) this.X);
        return e5f.a;
    }
}
