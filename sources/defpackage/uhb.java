package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.protocol.HTTP;

/* renamed from: uhb  reason: default package */
public final class uhb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileInviteScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uhb(ProfileInviteScreen profileInviteScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileInviteScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((uhb) n((wm9) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        uhb uhb = new uhb(this.Y, continuation);
        uhb.X = obj;
        return uhb;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        boolean z = wm9 instanceof qhb;
        String str = null;
        ProfileInviteScreen profileInviteScreen = this.Y;
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((qhb) wm9).b);
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            coc coc = (coc) x53.q0(profileInviteScreen.getRouter().e());
            if (coc != null) {
                str = coc.b;
            }
            ckb.c.P1().b(":chats/share", dy7.g(new kpa("oneme:share:data", intent), new kpa("tag", str)));
        } else if (wm9 instanceof rhb) {
            String str2 = o37.a;
            Context context = profileInviteScreen.getContext();
            CharSequence b = ((rhb) wm9).b.b(profileInviteScreen.getContext());
            if (b == null) {
                b = "";
            }
            o37.d(context, b, (Uri) null);
        } else if (wm9 instanceof c64) {
            ckb.c.R1((c64) wm9);
        } else if (wm9 instanceof g43) {
            profileInviteScreen.getRouter().B(profileInviteScreen);
        }
        return e5f.a;
    }
}
