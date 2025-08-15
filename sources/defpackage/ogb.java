package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.messages.views.ActAvatarCrop;

/* renamed from: ogb  reason: default package */
public final class ogb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vgb Y;
    public final /* synthetic */ Uri Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ogb(vgb vgb, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.Y = vgb;
        this.Z = uri;
    }

    public final Object invoke(Object obj, Object obj2) {
        e5f e5f = e5f.a;
        ((ogb) n((sx3) obj, (Continuation) obj2)).o(e5f);
        return e5f;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ogb ogb = new ogb(this.Y, this.Z, continuation);
        ogb.X = obj;
        return ogb;
    }

    public final Object o(Object obj) {
        Object obj2;
        Uri uri;
        e5f e5f = e5f.a;
        od2.a0(obj);
        sx3 sx3 = (sx3) this.X;
        bc7[] bc7Arr = vgb.A0;
        vgb vgb = this.Y;
        je7 je7 = vgb.Y;
        je7 je72 = vgb.Z;
        File q = ((kk5) je7.getValue()).q((String) vgb.z0.get());
        try {
            if (!q.exists() && (uri = this.Z) != null) {
                s5c.I(((Application) je72.getValue()).getContentResolver().openInputStream(uri), q);
            }
            obj2 = e5f;
        } catch (Throwable th) {
            obj2 = new njc(th);
        }
        Throwable a = pjc.a(obj2);
        if (a != null) {
            hm9.p(sx3.getClass().getName(), "failed to copy picked image, e:", a);
            vgb.t();
        }
        je7 je73 = vgb.c;
        String absolutePath = q.getAbsolutePath();
        j47.c0((y7d) je73.getValue(), absolutePath, absolutePath);
        j47.a0((y7d) je73.getValue(), q.getAbsolutePath());
        Intent intent = new Intent((Application) je72.getValue(), ActAvatarCrop.class);
        intent.putExtra("ru.ok.tamtam.extra.URI", Uri.fromFile(q));
        intent.putExtra("ru.ok.tamtam.extra.FILE_PATH", q.getAbsolutePath());
        intent.putExtra("ru.ok.tamtam.extra.SHOW_RECAPTURE", true);
        intent.putExtra("ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND", false);
        pnf.o(vgb.w0, new kfb(intent));
        return e5f;
    }
}
