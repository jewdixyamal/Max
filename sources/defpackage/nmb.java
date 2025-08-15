package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: nmb  reason: default package */
public final class nmb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cnb Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nmb(cnb cnb, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = cnb;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((nmb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nmb nmb = new nmb(this.Y, this.Z, continuation);
        nmb.X = obj;
        return nmb;
    }

    public final Object o(Object obj) {
        Object obj2;
        Uri uri;
        e5f e5f = e5f.a;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        bc7[] bc7Arr = cnb.S0;
        cnb cnb = this.Y;
        je7 je7 = cnb.v0;
        Context context = cnb.Q0;
        File q = ((kk5) je7.getValue()).q((String) cnb.P0.get());
        try {
            if (!q.exists() && (uri = this.Z) != null) {
                s5c.I(context.getContentResolver().openInputStream(uri), q);
            }
            obj2 = e5f;
        } catch (Throwable th) {
            obj2 = new njc(th);
        }
        Throwable a = pjc.a(obj2);
        if (a != null) {
            hm9.p(sx3.getClass().getName(), "failed to copy picked image, e:", a);
            cnb.D();
        }
        je7 je72 = cnb.u0;
        String absolutePath = q.getAbsolutePath();
        j47.c0((y7d) je72.getValue(), absolutePath, absolutePath);
        j47.a0((y7d) je72.getValue(), q.getAbsolutePath());
        Intent intent = new Intent(context, ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(cnb.A0, new ikb(intent));
        return e5f;
    }
}
