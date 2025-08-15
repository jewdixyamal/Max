package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: zr2  reason: default package */
public final class zr2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatTitleIconScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zr2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.Y = chatTitleIconScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((zr2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zr2 zr2 = new zr2(continuation, this.Y);
        zr2.X = obj;
        return zr2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof or2;
        ChatTitleIconScreen chatTitleIconScreen = this.Y;
        if (z) {
            mr0.G(chatTitleIconScreen);
            chatTitleIconScreen.startActivityForResult(((or2) wm9).b, 666);
        } else if (wm9 instanceof sr2) {
            mr0.G(chatTitleIconScreen);
            try {
                chatTitleIconScreen.startActivityForResult(((sr2) wm9).b, 777);
                an9.g((an9) chatTitleIconScreen.s0.getValue(), wuc.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                bc7[] bc7Arr = ChatTitleIconScreen.z0;
                chatTitleIconScreen.r0().t();
                hm9.p(ChatTitleIconScreen.class.getName(), "failed open camera", (Throwable) null);
            }
        } else if (wm9 instanceof rr2) {
            bc7[] bc7Arr2 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9, 0));
        } else if (wm9 instanceof qr2) {
            bc7[] bc7Arr3 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9, 1));
        } else if (wm9 instanceof pr2) {
            bc7[] bc7Arr4 = ChatTitleIconScreen.z0;
            chatTitleIconScreen.p0().setProgressEnabled(false);
            syd.c.b2(new as2(chatTitleIconScreen, wm9, 2));
        } else if (tpa.f(wm9, tr2.b)) {
            bc7[] bc7Arr5 = ChatTitleIconScreen.z0;
            ((eua) chatTitleIconScreen.Z.getValue()).g(new l5g(chatTitleIconScreen, 1));
        }
        return e5f.a;
    }
}
