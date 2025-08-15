package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: yr2  reason: default package */
public final class yr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yr2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((yr2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        yr2 yr2 = new yr2(continuation, this.Y);
        yr2.X = obj;
        return yr2;
    }

    public final Object o(Object obj) {
        String str;
        od2.a0(obj);
        ds2 ds2 = (ds2) this.X;
        String str2 = ds2.b;
        if (str2 == null || w9e.C0(str2)) {
            str = ds2.a;
            if (str == null || w9e.C0(str)) {
                str = null;
            }
        } else {
            str = ds2.b;
        }
        s5a n0 = ChatTitleIconScreen.n0(this.Y);
        n0.setAvatarUrl(str);
        n0.setCloseBadgeVisibility(!(str == null || str.length() == 0));
        return e5f.a;
    }
}
