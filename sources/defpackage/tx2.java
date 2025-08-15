package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* renamed from: tx2  reason: default package */
public final class tx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((tx2) n(obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tx2 tx2 = new tx2(continuation, this.Y);
        tx2.X = obj;
        return tx2;
    }

    public final Object o(Object obj) {
        od2.a0(obj);
        wm9 wm9 = (wm9) this.X;
        if (wm9 instanceof vla) {
            gy2 gy2 = gy2.c;
            long longValue = ((Number) ((vla) wm9).a).longValue();
            f64 P1 = gy2.P1();
            P1.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (wm9 instanceof yc9) {
            gy2.c.P1().b(ey8.i(((Number) ((yc9) wm9).a).longValue(), ":profile/change-owner?chat_id=", "&leave_chat=true"), (Bundle) null);
        } else if (wm9 instanceof c64) {
            gy2.c.R1((c64) wm9);
        } else if (wm9 instanceof tla) {
            Context context = this.Y.getContext();
            Uri uri = (Uri) ((tla) wm9).a;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(uri);
            try {
                context.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                e.getMessage();
                uri.toString();
            }
        } else if (wm9 instanceof a47) {
            gy2 gy22 = gy2.c;
            gy22.P1().c(((m64) ((a47) wm9).a).a, (Bundle) null);
        }
        return e5f.a;
    }
}
